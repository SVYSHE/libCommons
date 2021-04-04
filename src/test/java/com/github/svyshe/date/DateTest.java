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

}
