package svyshe.com.github.libcommons.libdatetime;

public class DateTimeException extends Exception {
    public DateTimeException(String errorMessage)
    {
        super(errorMessage);
    }

    public DateTimeException(String errorMessage, Throwable error)
    {
        super(errorMessage, error);
    }
}
