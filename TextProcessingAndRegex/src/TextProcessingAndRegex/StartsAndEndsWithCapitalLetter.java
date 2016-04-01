package TextProcessingAndRegex;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String input=console.nextLine();

        Pattern pattern=Pattern.compile("\\b[A-Z]{1}[a-zA-Z]+[A-Z]{1}\\b");
        Matcher matches=pattern.matcher(input);

        while(matches.find()){

            System.out.print(matches.group(0)+" ");
        }
    }
}
