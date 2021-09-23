package svyshe.com.github.libcommons.libformats.csv.exceptions;

import java.io.IOException;

public class CSVClientException extends IOException {
    public CSVClientException() {
        super();
    }

    public CSVClientException(String message) {
        super(message);
    }

    public CSVClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
