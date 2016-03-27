package StreamsAndFilesHomework;

import java.io.*;

public class AllCapitals {

    private static final String IN_PATH="C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\AllCapitalsIn.txt";
    private static final String OUT_PATH="C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\AllCapitalsIn.txt";

    public static void main(String[] args) throws IOException {

        File fileIn = new File(IN_PATH);
        File fileOut = new File(OUT_PATH);

        try (
                FileReader fileReader = new FileReader(fileIn);
                BufferedReader reader = new BufferedReader(fileReader);
        ) {
            FileWriter fileWriter = new FileWriter(fileOut, true);
            PrintWriter printWriter = new PrintWriter(fileWriter, true);

            String line = reader.readLine();

            StringBuilder text = new StringBuilder();

            while (line != null) {

                line = line.toUpperCase();

                text.append(line);
                text.append('\n');

                line = reader.readLine();
            }

            String result = text.toString();
            String[] resultArgs = result.split("\n");

            for (String sentence : resultArgs) {

                printWriter.println(sentence);
            }
        } catch (IOException iox){

            System.err.println("Cannot read the file.");
        }
    }
}
