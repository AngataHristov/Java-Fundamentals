package FunctionalProgrammingAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortArrayWithStreamAPI {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String[] inputArgs=console.nextLine().split(" ");
        String sortingType=console.nextLine();

        List<Integer> numbers= new ArrayList<>();

        switch (sortingType){

            case "Ascending":
                numbers= Arrays
                        .stream(inputArgs)
                        .map(n->Integer.parseInt(n))
                        .sorted((n1,n2)->n1.compareTo(n2))
                        .collect(Collectors.toList());
                break;
            case "Descending":
                numbers= Arrays
                        .stream(inputArgs)
                        .map(n->Integer.parseInt(n))
                        .sorted((n1,n2)->n2.compareTo(n1))
                        .collect(Collectors.toList());
                break;
        }

        for (int num:numbers) {

            System.out.print(num+" ");
        }
    }
}
