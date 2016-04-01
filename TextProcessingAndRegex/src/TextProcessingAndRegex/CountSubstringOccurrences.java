package TextProcessingAndRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String input=console.nextLine().toLowerCase();

        String template=console.nextLine();

        int counter = 0;
        int index = 0;

        while (true)
        {
            int found = input
                    .indexOf(template, index);

            if (found < 0)
            {
                break;
            }

            counter++;
            index = found+1;
        }

        System.out.println(counter);
    }
}
