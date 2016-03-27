package StreamsAndFilesHomework;

import java.io.*;

public class SumLines {

    private static final String IN_PATH="C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\SumLines.txt";

    public static void main(String[] args) throws IOException {

        File file=new File(IN_PATH);

        try (
                BufferedReader reader=new BufferedReader(new FileReader(file));
        ) {
            String line=reader.readLine();

            while(line!=null){

                int sum=0;

                for (int i = 0; i < line.length(); i++) {

                    sum+=line.charAt(i);
                }

                System.out.println(sum);

                line=reader.readLine();
            }
        } catch (IOException iox){

            System.err.println("Cannot read the file.");
        }
    }
}

