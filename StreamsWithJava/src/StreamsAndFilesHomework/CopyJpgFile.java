package StreamsAndFilesHomework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgFile {

    public static void main(String[] args) {

        FileInputStream input = null;
        FileOutputStream output = null;
        byte[] buffer = new byte[1024];
        try {
            input = new FileInputStream("C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\404-error.jpg");
            output = new FileOutputStream("C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\404-error-copied.jpg");
            int read = input.read(buffer, 0, buffer.length);
            while (read > 0)
            {
                output.write(buffer, 0, read);
                read = input.read(buffer, 0, buffer.length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
