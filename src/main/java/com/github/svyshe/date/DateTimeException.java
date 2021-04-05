package com.github.svyshe.date;

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
