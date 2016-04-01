package TextProcessingAndRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String line=console.nextLine();
        String specifiedWord=console.nextLine();

        Pattern pattern=Pattern.compile("([a-zA-Z]+)");

        Matcher matcher=pattern.matcher(line);

        List<String> words=new ArrayList<>();
        int counter=0;

        while (matcher.find()){

            words.add(matcher.group(1).toLowerCase());
        }

        for (String word:words) {

            if (word.equals(specifiedWord)){

                counter++;
            }
        }

        System.out.println(counter);
    }
}
