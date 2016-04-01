package TextProcessingAndRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String input=console.nextLine();

        String template="\\b(\\w*[-._]*\\w+)([-.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\\b";

        Pattern pattern=Pattern.compile(template);
        Matcher matches=pattern.matcher(input);

        List<String> emails=new ArrayList<>();

        while (matches.find()){

            emails.add(matches.group(0));
        }

        for (String email:emails) {

            System.out.println(email);
        }
    }
}
