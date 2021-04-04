package com.github.svyshe.date;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * This class tries to combine the {@code java.utils.Date} and {@code java.time.LocalDateTime}
 * functionality in one class to make it more usable and not deprecated.
 */
public class Date implements Serializable, Cloneable, Comparable<Date> {

    public static int JANUARY = 1;
    public static int FEBRUARY = 2;
    public static int MARCH = 3;
    public static int APRIL = 4;
    public static int MAY = 5;
    public static int JUNE = 6;
    public static int JULY = 7;
    public static int AUGUST = 8;
    public static int SEPTEMBER = 9;
    public static int OCTOBER = 10;
    public static int NOVEMBER = 11;
    public static int DECEMBER = 12;

    private int year;
    private int month;
    private int dayOfMonth;
    private int hours;
    private int minutes;
    private int seconds;
    private int milliseconds;

    /**
     * Initializes the fields year, month, date of month, hours, minutes and seconds
     * to the values at the current time. The field milliseconds gets set to 0;
     * @throws DateException if invalid values are specified for the fields.
     */
    public Date() throws DateException {
        LocalDateTime dateTime = LocalDateTime.now();
        setYear(dateTime.getYear());
        setMonth(dateTime.getMonthValue());
        setDayOfMonth(dateTime.getDayOfMonth());
        setHours(dateTime.getHour());
        setMinutes(dateTime.getMinute());
        setSeconds(dateTime.getSecond());
        setMilliseconds(0);
    }

    /**
     * Initializes the fields year, month and day of month to the specified values.
     * All other fields are initialized with the value 0.
     * @param year The year as integer.
     * @param month The month as integer
     * @param dayOfMonth The day of the month as integer.
     * @throws DateException if invalid values are specified for the fields.
     */
    public Date(int year, int month, int dayOfMonth) throws DateException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHours(0);
        setMinutes(0);
        setSeconds(0);
        setMilliseconds(0);
    }

    /**
     * Initializes the fields year, month, day of month, hours and minutes to
     * the specified values. All other fields are initialized to the value 0.
     * @param year The year as integer.
     * @param month The month as integer.
     * @param dayOfMonth The day of month as integer.
     * @param hours The hours as integer.
     * @param minutes The minutes as integer.
     * @throws DateException if invalid values are specified for the fields.
     */
    public Date(int year, int month, int dayOfMonth, int hours, int minutes) throws DateException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(0);
        setMilliseconds(0);
    }

    /**
     * Initializes the fields year, month, day of month, hours and minutes to
     * the specified values. The field milliseconds is initialized to the value 0.
     * @param year The year as integer.
     * @param month The month as integer.
     * @param dayOfMonth The day of month as integer.
     * @param hours The hours as integer.
     * @param minutes The minutes as integer.
     * @param seconds The seconds as integer.
     * @throws DateException if invalid values are specified for the fields.
     */
    public Date(int year, int month, int dayOfMonth, int hours, int minutes, int seconds) throws DateException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        setMilliseconds(0);
    }

    /**
     * Parses a date from the specified string.
     * @since 0.1 - supported strings are string in the format
     * yyyyMMddHHmmss, yyyyMMddHHmm and yyyyMMdd.
     * @param dateString The string to parse the date from.
     * @return A new date object with the values specified in the input string.
     * @throws DateException if invalid values are set for the fields.
     */
    public static Date parseFromString(String dateString) throws DateException {
        Date date = new Date();
        if (dateString.length() == 14)
        {
            date.setYear(Integer.parseInt(dateString.substring(0,4)));
            date.setMonth(Integer.parseInt(dateString.substring(4,6)));
            date.setDayOfMonth(Integer.parseInt(dateString.substring(6,8)));
            date.setHours(Integer.parseInt(dateString.substring(8,10)));
            date.setMinutes(Integer.parseInt(dateString.substring(10,12)));
            date.setSeconds(Integer.parseInt(dateString.substring(12,14)));
            return date;
        }
        else if (dateString.length() == 12)
        {
            date.setYear(Integer.parseInt(dateString.substring(0,4)));
            date.setMonth(Integer.parseInt(dateString.substring(4,6)));
            date.setDayOfMonth(Integer.parseInt(dateString.substring(6,8)));
            date.setHours(Integer.parseInt(dateString.substring(8,10)));
            date.setMinutes(Integer.parseInt(dateString.substring(10,12)));
            return date;
        }
        else if (dateString.length() == 8)
        {
            date.setYear(Integer.parseInt(dateString.substring(0,4)));
            date.setMonth(Integer.parseInt(dateString.substring(4,6)));
            date.setDayOfMonth(Integer.parseInt(dateString.substring(6,8)));
            return date;
        }
        return null;
    }

    /**
     * Checks whether this date is after the specified date.
     * @param date The date to check against.
     * @return true if this date is after the specified date, false if not.
     */
    public boolean after(Date date) {
        int comparisonResult = this.compareTo(date);
        return comparisonResult > 0;
    }

    /**
     * Checks whether this date is before the specified date.
     * @param date The date to check against.
     * @return true if this date is before the specified date, false if not.
     */
    public boolean before(Date date) {
        int comparisonResult = this.compareTo(date);
        return comparisonResult < 0;
    }

    /**
     * Compares this date with another. If this date is later in time
     * than the specified date, 1 will be returned. If this date is
     * sooner in time than the specified date, -1 will be returned.
     * In case that the dates are equal, 0 will be returned.
     * @param o The date to compare with.
     * @return 1 if this date is later in time, -1 if it's sooner in time
     * compared to the specified date. 0 if they are equal.
     */
    @Override
    public int compareTo(Date o) {
        if (this.getYear() > o.getYear()) {
            return 1;
        } else if (this.getYear() < o.getYear()) {
            return -1;
        }
        if (this.getMonth() > o.getMonth()) {
            return 1;
        } else if (this.getMonth() < o.getMonth()) {
            return -1;
        }
        if (this.getDayOfMonth() > o.getDayOfMonth()) {
            return 1;
        } else if (this.getDayOfMonth() < o.getDayOfMonth()) {
            return -1;
        }
        if (this.getHours() > o.getHours()) {
            return 1;
        } else if (this.getMinutes() < o.getMinutes()) {
            return -1;
        }
        if (this.getMinutes() > o.getMinutes()) {
            return 1;
        } else if (this.getMinutes() < o.getMinutes()) {
            return -1;
        }
        if (this.getSeconds() > o.getSeconds()) {
            return 1;
        } else if (this.getSeconds() < o.getSeconds()) {
            return -1;
        }
        if (this.getMilliseconds() > o.getMilliseconds()) {
            return 1;
        } else if (this.getMilliseconds() < o.getMilliseconds()) {
            return -1;
        }

        return 0;
    }

    /**
     * Checks for equality of both this and the specified date.
     * @param o The date to compare equality to.
     * @return True if they are equal, false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Date)) {
            return false;
        }
        Date date = (Date) o;
        return this.getYear() == date.getYear() && this.getMonth() == date.getMonth() && this.getDayOfMonth() == date.getDayOfMonth() && this.getHours() == date.getHours() && this.getMinutes() == date.getMinutes() && this.getSeconds() == date.getSeconds() && this.getMilliseconds() == date.getMilliseconds();
    }

    /**
     * Generates the hashcode based on the class fields.
     * @return A hashcode as integer.
     */
    @Override
    public int hashCode()
    {
        int result = 17;
        result = 31 * result + getYear();
        result = 31 * result + getMonth();
        result = 31 * result + getDayOfMonth();
        result = 31 * result + getHours();
        result = 31 * result + getMinutes();
        result = 31 * result + getSeconds();
        result = 31 * result + getMilliseconds();
        return result;
    }

    /**
     * Getter for the year.
     * @return The year as integer.
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for the year.
     * @param year Integer value greater than or equal to 0.
     * @throws DateException if the value is smaller than 0.
     */
    public void setYear(int year) throws DateException {
        if (year >= 0) {
            this.year = year;
        } else {
            throw new DateException("Field year has to be greater or equal to 0.");
        }
    }

    /**
     * Getter for the month.
     * @return The month as integer.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Setter for the month.
     * @param month Integer value greater than 0 and smaller than or equal to 12.
     * @throws DateException if the value is smaller than or equal to 0 or greater than 12.
     */
    public void setMonth(int month) throws DateException {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            throw new DateException("The field month has to be greater 0 and smaller or equal to 12.");
        }
    }

    /**
     * Getter for the day of the month.
     * @return the day of the month as integer.
     */
    public int getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Setter for the day of the month.
     * @param dayOfMonth Integer value greater than 0 and smaller than or equal to 31.
     * @throws DateException if the specified value is smaller than or equal to 0 or greater 31.
     */
    public void setDayOfMonth(int dayOfMonth) throws DateException {
        if (dayOfMonth > 0 && dayOfMonth <= 31) {
            this.dayOfMonth = dayOfMonth;
        } else {
            throw new DateException("The field dayOfMonth has to be greater 0 and smaller or equal to 31.");
        }

    }

    /**
     * Getter for the hours.
     * @return the hours as integer.
     */
    public int getHours() {
        return hours;
    }

    /**
     * Setter for the hours.
     * @param hours Integer value greater than or equal to 0 and smaller than 24.
     * @throws DateException if the specified value is smaller than 0 or greater than or equal to 24.
     */
    public void setHours(int hours) throws DateException {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {

            throw new DateException("The field hours hast to be greater or equal to 0 and smaller 24.");
        }
    }

    /**
     * Getter for the minutes.
     * @return the minutes as integer.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Setter for the minutes.
     * @param minutes Integer value greater than or equal to 0 and smaller than 60.
     * @throws DateException if the specified value is smaller than 0 or greater than or equal to 60.
     */
    public void setMinutes(int minutes) throws DateException {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new DateException("The field minutes has to be greater or equal to 0 and smaller 60.");
        }
    }

    /**
     * Getter for the seconds.
     * @return the seconds as integer.
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Setter for the seconds.
     * @param seconds Integer value greater than or equal to 0 and smaller than 60.
     * @throws DateException if the specified value is smaller than 0 or greater than or equal to 60.
     */
    public void setSeconds(int seconds) throws DateException {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new DateException("The field seconds has to be greater or equal to 0 and smaller 60.");
        }
    }

    /**
     * Getter for the milliseconds.
     * @return the milliseconds as integer.
     */
    public int getMilliseconds() {
        return milliseconds;
    }

    /**
     * Setter for the milliseconds.
     * @param milliseconds Integer value greater than or equal to 0 and smaller 1000.
     * @throws DateException if the specified value is smaller than 0 or greater than or equal to 1000.
     */
    public void setMilliseconds(int milliseconds) throws DateException {
        if (milliseconds >= 0 && milliseconds < 1000) {
            this.milliseconds = milliseconds;
        } else {
            throw new DateException("The field milliseconds has to be greater or equal to 0 and smaller 1000.");
        }
    }
}
