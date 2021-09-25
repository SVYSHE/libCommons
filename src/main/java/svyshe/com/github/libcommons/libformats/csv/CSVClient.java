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

/**
 * This class is supposed to offer a way to handle CSV files.
 * In difference to other existing CSV libraries, CSVClient will offer you options to read a file line by line or even
 * the whole file at once which will be less memory efficient in further processing steps.
 *
 * @author https://www.github.com/SVYSHE
 * @version 1.0
 */
public class CSVClient implements AutoCloseable {

    private File file;
    private CSVDelimiter delimiter;
    private final Scanner reader;

    /**
     * Getter for the CSV file.
     *
     * @return The CSV file.
     */
    public File getFile() {
        return file;
    }

    /**
     * The setter for the CSV file.
     *
     * @param file The file to set as CSV file.
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * The getter for the delimiter in read mode.
     *
     * @return The delimiter in read mode.
     */
    public CSVDelimiter getDelimiter() {
        return delimiter;
    }

    /**
     * The setter for the delimiter in read mode.
     *
     * @param delimiter The delimiter to set for read mode.
     */
    public void setDelimiter(CSVDelimiter delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Constructs a new CSV client and initializes it with the specified CSV file.
     *
     * @param file The CSV file that the client should operate on.
     * @throws CSVClientException If the specified file can't be found.
     */
    public CSVClient(File file) throws CSVClientException {
        this.file = file;
        this.delimiter = CSVDelimiter.COMMA;
        try {
            this.reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            throw new CSVClientException("Error while initializing CSV client reader.", e.getCause());
        }
    }

    /**
     * Reads the whole CSV file and returns it as a list of string arrays. The delimiter has to be already specified.
     *
     * @return A list of string arrays representing the whole file.
     */
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

    /**
     * Reads a single line from the CSV file starting from the top.
     *
     * @return A string array containing the fields.
     */
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

    /**
     * Checks whether the file-cursors next position will be a line.
     *
     * @return True if there is a next line, false if not.
     */
    public boolean hasNextLine() {
        return reader.hasNextLine();
    }

    /**
     * Appends a line to the set file.
     *
     * @param line      The contents to write to the file.
     * @param charset   The charset used to write with.
     * @param delimiter The delimiter to separate the single fields.
     * @throws CSVClientException In case the writer isn't able to write to the specified file.
     */
    public void appendLine(String[] line, Charset charset, CSVDelimiter delimiter) throws CSVClientException {
        String outputString = String.join(delimiter.character, line) + "\r\n";
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(String.valueOf(file)), charset, StandardOpenOption.APPEND)) {
            writer.write(outputString);
        } catch (IOException e) {
            throw new CSVClientException("Error while trying to write to file: '" + file.getAbsolutePath() + "'.", e.getCause());
        }
    }

    /**
     * Writes multiple lines at once to a file.
     *
     * @param lines     The lines represented as a list of string arrays.
     * @param charset   The charset used to write with.
     * @param delimiter The delimiter to separate the single fields.
     * @throws CSVClientException In case the writer isn't able to write to the specified file.
     */
    public void writeAll(List<String[]> lines, final Charset charset, final CSVDelimiter delimiter) throws CSVClientException {
        for (String[] line : lines) {
            appendLine(line, charset, delimiter);
        }
    }

    /**
     * Closes the reader.
     */
    @Override
    public void close() {
        if (this.reader != null) {
            this.reader.close();
        }
    }

    /**
     * Checks whether the line (represented as single string) contains an odd number of double quotes.
     *
     * @param line The line as string to check.
     * @return true if it has an odd count of double quotes, false if not.
     */
    private boolean hasOddCountOfDoubleQuotes(String line) {
        return StringUtils.countMatches(line, "\"") % 2 != 0;
    }

    /**
     * Escapes double quotes in the given line (represented as single string).
     *
     * @param line The line as string to escape the double quotes from.
     * @return The escaped line.
     */
    private String escapeDoubleQuotes(String line) {
        line = line.replace("\"", "");
        return line;
    }
}
