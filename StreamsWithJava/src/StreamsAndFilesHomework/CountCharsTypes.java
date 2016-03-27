package StreamsAndFilesHomework;

import java.io.*;

public class CountCharsTypes {

    private static final String IN_PATH="C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\words.txt";
    private static final String OUT_PATH="C:\\Users\\Elliot\\Desktop\\SoftUni\\02.Fundamentals\\04.JavaFundamentals\\03.StreamsWithJava\\MyHomework\\count-chars.txt";

    public static void main(String[] args) {

        File fileIn = new File(IN_PATH);
        File fileOut = new File(OUT_PATH);

        int vowelsCount=0;
        int punctuationCount=0;
        int whitespacesCount=0;
        int textLength=0;
        try (
                FileReader fileReader = new FileReader(fileIn);
                BufferedReader reader = new BufferedReader(fileReader);
        ) {

            FileWriter fileWriter = new FileWriter(fileOut, true);
            PrintWriter printWriter = new PrintWriter(fileWriter, true);

            String line=reader.readLine();

            while(line!=null){

                for (int i = 0; i < line.length(); i++) {

                    char currentChat=line.charAt(i);

                    if (currentChat=='.'||
                            currentChat==','||
                            currentChat=='!'||
                            currentChat=='?'){

                        punctuationCount++;
                    }
                    else if (currentChat=='a'||
                            currentChat=='e'||
                            currentChat=='i'||
                            currentChat=='o'||
                            currentChat=='u'){

                        vowelsCount++;
                    }
                    else if (currentChat==' '){
                        whitespacesCount++;
                    }

                    textLength++;
                }

                line=reader.readLine();
            }

            printWriter.println("Vowels: "+vowelsCount);
            printWriter.println("Consonants: "+(textLength-whitespacesCount-vowelsCount-punctuationCount));
            printWriter.println("Punctuation: "+punctuationCount);

        } catch (IOException iox){

            System.err.println("Cannot read the file.");
        }
    }
}
