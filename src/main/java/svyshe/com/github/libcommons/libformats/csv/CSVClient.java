package svyshe.com.github.libcommons.libformats.csv;

import org.apache.commons.lang3.StringUtils;
import svyshe.com.github.libcommons.libformats.csv.exceptions.CSVClientException;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSVClient implements AutoCloseable {

    private File file;
    private CSVDelimiter delimiter;
    private final Scanner reader;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public CSVDelimiter getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(CSVDelimiter delimiter) {
        this.delimiter = delimiter;
    }


    public CSVClient(File file) throws CSVClientException {
        this.file = file;
        this.delimiter = CSVDelimiter.COMMA;
        try {
            this.reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            throw new CSVClientException("Error while initializing CSV client reader.", e.getCause());
        }
    }

    public List<String[]> readAll() {
        List<String[]> content = new LinkedList<>();
        while (hasNextLine()) {
            String[] line = readLine();
            if (line.length > 0) {
                content.add(line);
            }
        }
        return content;
    }

    public String[] readLine() {
        String line = reader.nextLine();
        if (StringUtils.isEmpty(line)) {
            return new String[]{};
        }
        if (line.contains("\"")) {
            if (hasOddCountOfDoubleQuotes(line)) {
                line += reader.nextLine();
            }
            line = escapeDoubleQuotes(line);
        }
        return StringUtils.splitByWholeSeparator(line, String.valueOf(this.delimiter.character));
    }

    public boolean hasNextLine() {
        return reader.hasNextLine();
    }

    public void appendLine(String[] line, Charset charset, CSVDelimiter delimiter) throws CSVClientException {
        String outputString = String.join(delimiter.character, line) + "\r\n";
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(String.valueOf(file)), charset, StandardOpenOption.APPEND)) {
            writer.write(outputString);
        } catch (IOException e) {
            throw new CSVClientException("Error while trying to write to file: '" + file.getAbsolutePath() + "'.", e.getCause());
        }
    }

    public void writeAll(List<String[]> lines, final Charset charset, final CSVDelimiter delimiter) throws CSVClientException {
        for (String[] line : lines) {
            appendLine(line, charset, delimiter);
        }
    }

    @Override
    public void close() {
        this.reader.close();
    }

    private boolean hasOddCountOfDoubleQuotes(String line) {
        return StringUtils.countMatches(line, "\"") % 2 != 0;
    }

    private String escapeDoubleQuotes(String line) {
        line = line.replace("\"", "");
        return line;
    }
}
