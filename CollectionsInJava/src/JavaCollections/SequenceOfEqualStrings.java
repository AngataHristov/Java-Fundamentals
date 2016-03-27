package JavaCollections;

import java.util.HashSet;
import java.util.Scanner;

public class SequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String line=console.nextLine();

        String[] elements = line.split(" ");

        groupElements(elements);
    }

    private static void groupElements(String[] elements)
    {
        HashSet<String> keys = new HashSet<>();

        for (String element: elements)
        {
            keys.add(element);
        }

        for (String uniqueElement: keys)
        {
            for (String element: elements)
            {
                if (uniqueElement.equals(element))
                {
                    System.out.printf("%s ", uniqueElement);
                }
            }

            System.out.println();
        }
    }
}
