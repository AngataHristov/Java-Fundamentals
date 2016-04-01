package TextProcessingAndRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String input=console.nextLine();
       // input = input.replaceAll("[\\W+\\d+]"," ");
        String[] words=input.split("[\\W\\d]+");

        for (int i = 0; i < words.length; i++) {

            System.out.print(words[i] +" ");
        }
    }
}
