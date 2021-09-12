package svyshe.com.github.libcommons.libformats.exceptions;

import java.io.IOException;

public class CSVClientException extends IOException {
    public CSVClientException() {
        super();
    }

    public CSVClientException(String message) {
        super(message);
    }
}
