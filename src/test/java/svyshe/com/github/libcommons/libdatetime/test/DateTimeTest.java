package svyshe.com.github.libcommons.libdatetime.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import svyshe.com.github.libcommons.libdatetime.DateTime;
import svyshe.com.github.libcommons.libdatetime.DateTimeException;

public class DateTimeTest {

    @Test
    public void parseFromStringLength14Test() throws DateTimeException {
        DateTime expected = new DateTime();
        expected.setYear(2021);
        expected.setMonth(2);
        expected.setDayOfMonth(23);
        expected.setHours(14);
        expected.setMinutes(59);
        expected.setSeconds(50);
        expected.setMilliseconds(0);

        DateTime actual = DateTime.parseFromString("20210223145950");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseFromStringLength12Test() throws DateTimeException {
        DateTime expected = new DateTime();
        expected.setYear(2021);
        expected.setMonth(2);
        expected.setDayOfMonth(23);
        expected.setHours(14);
        expected.setMinutes(59);
        expected.setSeconds(0);
        expected.setMilliseconds(0);

        DateTime actual = DateTime.parseFromString("202102231459");

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void parseFromStringLength8Test() throws DateTimeException {
        DateTime expected = new DateTime();
        expected.setYear(2021);
        expected.setMonth(2);
        expected.setDayOfMonth(23);
        expected.setHours(0);
        expected.setMinutes(0);
        expected.setSeconds(0);
        expected.setMilliseconds(0);

        DateTime actual = DateTime.parseFromString("20210223");

        Assert.assertEquals(expected, actual);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void parseFromStringShouldThrowTest() throws DateTimeException {
        exceptionRule.expect(DateTimeException.class);
        exceptionRule.expectMessage("Please choose a length that is compatible with one of the following formats: yyyyMMddHHmmss, yyyyMMddHHmm or yyyyMMdd");
        DateTime.parseFromString("4444");
    }

    @Test
    public void SetDateTest() throws DateTimeException {
        DateTime expected = new DateTime();
        expected.setYear(2021);
        expected.setMonth(4);
        expected.setDayOfMonth(5);

        DateTime actual = new DateTime();
        actual.setDate(2021, 4, 5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void SetTimeTest() throws DateTimeException {
        DateTime expected = new DateTime();
        expected.setHours(14);
        expected.setMinutes(45);
        expected.setSeconds(5);

        DateTime actual = new DateTime();
        actual.setTime(14, 45, 5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAfterTest() throws DateTimeException {
        DateTime later = new DateTime();
        later.setDate(2021, 5, 1);
        DateTime sooner = new DateTime();
        sooner.setDate(2020, 4, 2);
        boolean actual = later.isAfter(sooner);

        Assert.assertTrue(actual);
    }

    @Test
    public void isBeforeTest() throws DateTimeException {
        DateTime later = new DateTime();
        later.setDate(2021, 5, 1);
        DateTime sooner = new DateTime();
        sooner.setDate(2020, 4, 2);
        boolean actual = sooner.isBefore(later);

        Assert.assertTrue(actual);
    }

    @Test
    public void isLeapYearDiv4Test() throws DateTimeException {
        DateTime dateTime = new DateTime();
        dateTime.setYear(44);
        boolean actual = dateTime.isLeapYear();
        Assert.assertTrue(actual);
    }

    @Test
    public void isLeapYearDiv100_ShouldFalse() throws DateTimeException {
        DateTime dateTimeLocal = new DateTime();
        dateTimeLocal.setYear(100);
        boolean actual = dateTimeLocal.isLeapYear();
        Assert.assertFalse(actual);
    }

    @Test
    public void isLeapYearDiv400() throws DateTimeException {
        DateTime dateTimeLocal = new DateTime();
        dateTimeLocal.setYear(400);
        boolean actual = dateTimeLocal.isLeapYear();
        Assert.assertTrue(actual);
    }

    @Test
    public void isLeapYearShouldFalse() throws DateTimeException {
        DateTime dateTimeLocal = new DateTime();
        dateTimeLocal.setYear(2003);
        boolean actual = dateTimeLocal.isLeapYear();
        Assert.assertFalse(actual);
    }
}
