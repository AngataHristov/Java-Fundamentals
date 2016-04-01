package FunctionalProgrammingAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArray {

    private static final int MIN_LENGTH = 3;

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String[] words=console.nextLine().split("[ ,.?!]");

        List<String> result= Arrays
                .stream(words)
                .filter(w->w.length()>MIN_LENGTH)
                .collect(Collectors.toList());

        System.out.println(String.join(" ",result));
    }
}
