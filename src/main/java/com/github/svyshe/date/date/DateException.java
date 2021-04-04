package com.github.svyshe.date.date;

public class DateException extends Exception {
    public DateException(String errorMessage)
    {
        super(errorMessage);
    }

    public DateException(String errorMessage, Throwable error)
    {
        super(errorMessage, error);
    }
}
