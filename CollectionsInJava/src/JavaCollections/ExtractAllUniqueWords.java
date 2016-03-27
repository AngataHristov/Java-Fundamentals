package JavaCollections;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllUniqueWords {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String input=console.nextLine();

        Pattern pattern=Pattern.compile("([a-zA-Z]+)");

        Matcher matcher=pattern.matcher(input);

        Set<String> uniqueWords = new TreeSet<String>();

        while (matcher.find()){

            uniqueWords.add(matcher.group(1).toLowerCase());
        }

        for (String word:uniqueWords) {

            System.out.print(word+" ");

        }
    }
}
