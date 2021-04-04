package com.github.svyshe.date;

import org.junit.Assert;
import org.junit.Test;

public class DateTest {

    @Test
    public void parseFromStringTest() throws DateException {
        Date actual = Date.parseFromString("20210223145950");
        Date expected = new Date();
        expected.setYear(2021);
        expected.setMonth(2);
        expected.setDayOfMonth(23);
        expected.setHours(14);
        expected.setMinutes(59);
        expected.setSeconds(50);
        expected.setMilliseconds(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseFromString() {
    }

    @Test
    public void after() {
    }

    @Test
    public void before() {
    }

    @Test
    public void compareTo() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void getYear() {
    }

    @Test
    public void setYear() {
    }

    @Test
    public void getMonth() {
    }

    @Test
    public void setMonth() {
    }

    @Test
    public void getDayOfMonth() {
    }

    @Test
    public void setDayOfMonth() {
    }

    @Test
    public void getHours() {
    }

    @Test
    public void setHours() {
    }

    @Test
    public void getMinutes() {
    }

    @Test
    public void setMinutes() {
    }

    @Test
    public void getSeconds() {
    }

    @Test
    public void setSeconds() {
    }

    @Test
    public void getMilliseconds() {
    }

    @Test
    public void setMilliseconds() {
    }
}
