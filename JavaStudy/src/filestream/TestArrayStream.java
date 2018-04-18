package filestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestArrayStream {
    public static void main(String[] args) {
        String text = "hello world!";
        InputStream input = new ByteArrayInputStream(text.getBytes());
        OutputStream output = new ByteArrayOutputStream();
        int temp = 0;
    }
}
