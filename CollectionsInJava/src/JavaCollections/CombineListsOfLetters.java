package JavaCollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombineListsOfLetters {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String firstLine=console.nextLine();
        String secondtLine=console.nextLine();

        ArrayList<String> firstList=new ArrayList<>(Arrays.asList(firstLine.split(" ")));
        ArrayList<String> secondList=new ArrayList<>(Arrays.asList(secondtLine.split(" ")));

        for (String element:secondList ) {

            if (!firstList.contains(element)){

                firstList.add(element);
            }
        }

        System.out.println(String.join(" ",firstList));
    }
}
