package svyshe.com.github.libcommons.libformats.test;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import svyshe.com.github.libcommons.libformats.CSVClient;
import svyshe.com.github.libcommons.libformats.exceptions.CSVClientException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class CSVClientTest {
    private CSVClient client;

    @Before
    public void setup() throws CSVClientException {
        this.client = new CSVClient(new File("src/test/resources/CSVTestFile.txt"));
    }

    @Test
    public void readAll() {
        List<String[]> expected = Arrays.asList(new String[]{"HEADER1", "HEADER2", "HEADER3"}, new String[]{"content1", "content2", "content3"});
        List<String[]> actual = client.readAll();
        Assert.assertThat(actual.toArray(), is(expected.toArray()));
    }
}
