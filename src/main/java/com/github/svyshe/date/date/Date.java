package com.github.svyshe.date.date;

import java.io.Serializable;
import java.time.LocalDateTime;

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

    public Date(int year, int month, int dayOfMonth) throws DateException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHours(0);
        setMinutes(0);
        setSeconds(0);
        setMilliseconds(0);
    }

    public Date(int year, int month, int dayOfMonth, int hours, int minutes) throws DateException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(0);
        setMilliseconds(0);
    }

    public Date(int year, int month, int dayOfMonth, int hours, int minutes, int seconds) throws DateException {
        setYear(year);
        setMonth(month);
        setDayOfMonth(dayOfMonth);
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        setMilliseconds(0);
    }

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

    public boolean after(Date date) {
        int comparisonResult = this.compareTo(date);
        return comparisonResult > 0;
    }

    public boolean before(Date date) {
        int comparisonResult = this.compareTo(date);
        return comparisonResult < 0;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws DateException {
        if (year >= 0) {
            this.year = year;
        } else {
            throw new DateException("Field year has to be greater or equal to 0.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws DateException {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            throw new DateException("The field month has to be greater 0 and smaller or equal to 12.");
        }
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) throws DateException {
        if (dayOfMonth > 0 && dayOfMonth <= 31) {
            this.dayOfMonth = dayOfMonth;
        } else {
            throw new DateException("The field dayOfMonth has to be greater 0 and smaller or equal to 31.");
        }

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws DateException {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {

            throw new DateException("The field hours hast to be greater or equal to 0 and smaller 24.");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws DateException {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new DateException("The field minutes has to be greater or equal to 0 and smaller 60.");
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) throws DateException {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            throw new DateException("The field seconds has to be greater or equal to 0 and smaller 60.");
        }
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) throws DateException {
        if (milliseconds >= 0 && milliseconds < 1000) {
            this.milliseconds = milliseconds;
        } else {
            throw new DateException("The field milliseconds has to be greater or equal to 0 and smaller 1000.");
        }
    }
}
