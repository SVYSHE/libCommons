package svyshe.com.github.libcommons.libformats;

import org.apache.commons.lang3.StringUtils;
import svyshe.com.github.libcommons.libformats.exceptions.CSVClientException;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CSVClient {

    public static final String CSV_DELIMITER_DEFAULT = ",";
    public static final String CSV_DELIMITER_SEMICOLON = ";";
    public static final String CSV_DELIMITER_TAB = "\t";

    private final File file;
    private CharSequence delimiter;
    private Scanner reader;

    public CSVClient(File file) throws CSVClientException {
        this.file = file;
        this.delimiter = CSV_DELIMITER_DEFAULT;
        try {
            this.reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            throw new CSVClientException(e.getMessage());
        }
    }

    public List<String[]> readAll() {
        List<String[]> content = new LinkedList<>();
        while (hasNextLine()) {
            content.add(readLine());
        }
        return content;

    }

    public String[] readLine() {
        String line = reader.nextLine();
        return StringUtils.splitPreserveAllTokens(line, String.valueOf(this.delimiter));
    }

    public boolean hasNextLine() {
        return reader.hasNextLine();
    }

    public void close() {
        this.reader.close();
    }
    //public readAll();
    //public readLine();
    //public hasNextLine();
    //public writeAll();
    //public writeRaw();
    //public writeLine();
}
