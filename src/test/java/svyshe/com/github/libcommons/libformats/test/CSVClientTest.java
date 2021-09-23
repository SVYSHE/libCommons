package svyshe.com.github.libcommons.libformats.test;

import org.junit.*;
import svyshe.com.github.libcommons.libformats.csv.CSVClient;
import svyshe.com.github.libcommons.libformats.csv.CSVDelimiter;
import svyshe.com.github.libcommons.libformats.csv.exceptions.CSVClientException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

// RFC4180
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

    @Test
    public void writeAll() throws IOException {
        final String absoluteFilePath = "src/test/resources/writeAllTest.txt";
        createTestFile(absoluteFilePath);
        String[] testLine1 = new String[]{"HEADER1 ","HEADER2","HEADER3"};
        String[] testLine2 = new String[]{"CONTENT1", "CONTENT2 ", "CONTENT3"};
        List<String[]> expected = new ArrayList<>();
        expected.add(testLine1);
        expected.add(testLine2);
        try (CSVClient client = new CSVClient(new File(absoluteFilePath))) {
            client.writeAll(expected, Charset.defaultCharset(), CSVDelimiter.COMMA);
        }

        List<String[]> actual;
        try (CSVClient reader = new CSVClient(new File(absoluteFilePath))) {

            actual = reader.readAll();
        }
        Assert.assertThat(actual.toArray(), is(expected.toArray()));
    }

    private static void createTestFile(String s) throws IOException {
        if (!Files.exists(Paths.get(s))) {
            File file = new File(s);
            file.createNewFile();
        }
    }

    @After
    public void teardown() throws IOException {
        this.client.close();
        Files.deleteIfExists(Paths.get("src/test/resources/writeAllTest.txt"));
    }
}
