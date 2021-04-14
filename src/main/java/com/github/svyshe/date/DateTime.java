package com.github.svyshe.date;

import java.io.Serializable;

/**
 * This class tries to combine the {@code java.utils.Date} and {@code java.time.LocalDateTime}
 * functionality in one class to make it more usable and not deprecated.
 */
public class DateTime implements Serializable, Comparable<DateTime> {

    private static final int JANUARY = 1;
    private static final int DECEMBER = 12;

    private int year;
    private int month;
    private int dayOfMonth;
    private int hours;
    private int minutes;
    private int seconds;
    private int milliseconds;

    /**
     * Initializes the fields year, hours, minutes and seconds
     * to the value 0 and the fields month and day of month to 1.
     *
     * @throws DateTimeException if invalid values are specified for the fields.
     */
    public DateTime() throws DateTimeException {
        setYear(0);
        setMonth(1);
        setDayOfMonth(1);
        setHours(0);
        setMinutes(0);
        setSeconds(0);
        setMilliseconds(0);
    }

    /**
     * Parses a date from the specified string.
     *
     * @param dateString The string to parse the date from.
     * @return A new date object with the values specified in the input string.
     * @throws DateTimeException if invalid values are set for the fields.
     * @since 0.1 - supported strings are string in the format
     * yyyyMMddHHmmss, yyyyMMddHHmm and yyyyMMdd.
     */
    public static DateTime parseFromString(String dateString) throws DateTimeException {
        DateTime dateTime = new DateTime();
        if (dateString.length() == 14) {
            parseYear(dateString, dateTime);
            parseMonth(dateString, dateTime);
            parseDayOfMonth(dateString, dateTime);
            parseHours(dateString, dateTime);
            parseMinutes(dateString, dateTime);
            parseSeconds(dateString, dateTime);
            return dateTime;
        } else if (dateString.length() == 12) {
            parseYear(dateString, dateTime);
            parseMonth(dateString, dateTime);
            parseDayOfMonth(dateString, dateTime);
            parseHours(dateString, dateTime);
            parseMinutes(dateString, dateTime);
            return dateTime;
        } else if (dateString.length() == 8) {
            parseYear(dateString, dateTime);
            parseMonth(dateString, dateTime);
            parseDayOfMonth(dateString, dateTime);
            return dateTime;
        }
        throw new DateTimeException("Please choose a length that is compatible with one of the following formats: yyyyMMddHHmmss, yyyyMMddHHmm or yyyyMMdd");
    }

    private static void parseYear(String dateString, DateTime dateTime) throws DateTimeException {
        dateTime.setYear(Integer.parseInt(dateString.substring(0, 4)));
    }

    private static void parseMonth(String dateString, DateTime dateTime) throws DateTimeException {
        dateTime.setMonth(Integer.parseInt(dateString.substring(4, 6)));
    }

    private static void parseDayOfMonth(String dateString, DateTime dateTime) throws DateTimeException {
        dateTime.setDayOfMonth(Integer.parseInt(dateString.substring(6, 8)));
    }

    private static void parseHours(String dateString, DateTime dateTime) throws DateTimeException {
        dateTime.setHours(Integer.parseInt(dateString.substring(8, 10)));
    }

    private static void parseMinutes(String dateString, DateTime dateTime) throws DateTimeException {
        dateTime.setMinutes(Integer.parseInt(dateString.substring(10, 12)));
    }

    private static void parseSeconds(String dateString, DateTime dateTime) throws DateTimeException {
        dateTime.setSeconds(Integer.parseInt(dateString.substring(12, 14)));
    }

    /**
     * Checks whether this date is after the specified date.
     *
     * @param dateTime The date to check against.
     * @return true if this date is after the specified date, false if not.
     */
    public boolean isAfter(DateTime dateTime) {
        int comparisonResult = this.compareTo(dateTime);
        return comparisonResult > 0;
    }

    /**
     * Checks whether this date is before the specified date.
     *
     * @param dateTime The date to check against.
     * @return true if this date is before the specified date, false if not.
     */
    public boolean isBefore(DateTime dateTime) {
        int comparisonResult = this.compareTo(dateTime);
        return comparisonResult < 0;
    }

    /**
     * Compares this date with another. If this date is later in time
     * than the specified date, 1 will be returned. If this date is
     * sooner in time than the specified date, -1 will be returned.
     * In case that the dates are equal, 0 will be returned.
     *
     * @param o The date to compare with.
     * @return 1 if this date is later in time, -1 if it's sooner in time
     * compared to the specified date. 0 if they are equal.
     */
    @Override
    public int compareTo(DateTime o) {
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
     *
     * @param o The date to compare equality to.
     * @return True if they are equal, false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DateTime)) {
            return false;
        }
        DateTime dateTime = (DateTime) o;
        return this.getYear() == dateTime.getYear() && this.getMonth() == dateTime.getMonth() && this.getDayOfMonth() == dateTime.getDayOfMonth() && this.getHours() == dateTime.getHours() && this.getMinutes() == dateTime.getMinutes() && this.getSeconds() == dateTime.getSeconds() && this.getMilliseconds() == dateTime.getMilliseconds();
    }

    /**
     * Generates the hashcode based on the class fields.
     *
     * @return A hashcode as integer.
     */
    @Override
    public int hashCode() {
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
     *
     * @return The year as integer.
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for the year.
     *
     * @param year Integer value greater than or equal to 0.
     * @throws DateTimeException if the value is smaller than 0.
     */
    public void setYear(int year) throws DateTimeException {
        if (year >= 0) {
            this.year = year;
        } else {
            throw new DateTimeException("Field year has to be greater or equal to 0.");
        }
    }

    /**
     * Getter for the month.
     *
     * @return The month as integer.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Setter for the month.
     *
     * @param month Integer value greater than 0 and smaller than or equal to 12.
     * @throws DateTimeException if the value is smaller than or equal to 0 or greater than 12.
     */
    public void setMonth(int month) throws DateTimeException {
        if (month >= JANUARY && month <= DECEMBER) {
            this.month = month;
        } else {
            throw new DateTimeException("The field month has to be greater 0 and smaller or equal to 12.");
        }
    }

    /**
     * Getter for the day of the month.
     *
     * @return the day of the month as integer.
     */
    public int getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Setter for the day of the month.
     *
     * @param dayOfMonth Integer value greater than 0 and smaller than or equal to 31.
     * @throws DateTimeException if the specified value is smaller than or equal to 0 or greater 31.
     */
    public void setDayOfMonth(int dayOfMonth) throws DateTimeException {
        if (dayOfMonth > 0 && dayOfMonth <= 31) {
            this.dayOfMonth = dayOfMonth;
        } else {
            throw new DateTimeException("The field dayOfMonth has to be greater 0 and smaller or equal to 31.");
        }

    }

    /**
     * Getter for the hours.
     *
     * @return the hours as integer.
     */
    public int getHours() {
        return hours;
    }

    /**
     * Setter for the hours.
     *
     * @param hours Integer value greater than or equal to 0 and smaller than 24.
     * @throws DateTimeException if the specified value is smaller than 0 or greater than or equal to 24.
     */
    public void setHours(int hours) throws DateTimeException {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {

            throw new DateTimeException("The field hours hast to be greater or equal to 0 and smaller 24.");
        }
    }

    /**
     * Getter for the minutes.
     *
     * @return the minutes as integer.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Setter for the minutes.
     *
     * @param minutes Integer value greater than or equal to 0 and smaller than 60.
     * @throws DateTimeException if the specified value is smaller than 0 or greater than or equal to 60.
     */
    public void setMinutes(int minutes) throws DateTimeException {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new DateTimeException("The field minutes has to be greater or equal to 0 and smaller 60.");
        }
    }

    /**
     * Getter for the seconds.
     *
     * @return the seconds as integer.
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * Setter for the seconds.
     *
     * @param seconds Integer value greater than or equal to 0 and smaller than 60.
     * @throws DateTimeException if the specified value is smaller than 0 or greater than or equal to 60.
     */
    public void setSeconds(int seconds) throws DateTimeException {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new DateTimeException("The field seconds has to be greater or equal to 0 and smaller 60.");
        }
    }

    /**
     * Getter for the milliseconds.
     *
     * @return the milliseconds as integer.
     */
    public int getMilliseconds() {
        return milliseconds;
    }

    /**
     * Setter for the milliseconds.
     *
     * @param milliseconds Integer value greater than or equal to 0 and smaller 1000.
     * @throws DateTimeException if the specified value is smaller than 0 or greater than or equal to 1000.
     */
    public void setMilliseconds(int milliseconds) throws DateTimeException {
        if (milliseconds >= 0 && milliseconds < 1000) {
            this.milliseconds = milliseconds;
        } else {
            throw new DateTimeException("The field milliseconds has to be greater or equal to 0 and smaller 1000.");
        }
    }

    public void setDate(int year, int month, int dayOfMonth) throws DateTimeException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
    }

    public void setTime(int hour, int minutes, int seconds) throws DateTimeException {
        setHours(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }
}
