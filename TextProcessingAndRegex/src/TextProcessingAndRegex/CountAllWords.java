package TextProcessingAndRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String line=console.nextLine();

        Pattern pattern= Pattern.compile("([a-zA-Z]+)");

        Matcher matcher=pattern.matcher(line);

        int counter=0;
        while (matcher.find()){

            counter++;
        }

        System.out.println(counter);

    }
}
