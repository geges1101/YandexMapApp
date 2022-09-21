package com.example.mapkitApp;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void fileReadsCorrect()
            throws IOException {
        String expected_value = "your_api_key";
        String file = "/Users/geges/AndroidStudioProjects/YandexMapApp/app/src/test/java/com/example/mapkitApp/BufferReaderTest";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();

        assertEquals(expected_value, currentLine);
    }
}
