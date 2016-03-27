package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String input=console.nextLine();
        String[] inputArgs=input.split(" ");

        int[]numbers=new int[inputArgs.length];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i]=Integer.parseInt(inputArgs[i]);
        }

        int counter = 1;
        int maxLength = 1;
        int endElement = 0;

        System.out.printf("%d ",numbers[0]);

        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] > numbers[i - 1])
            {
                System.out.printf("%d ",numbers[i]);

                counter++;
            }
            else
            {
                counter = 1;

                System.out.println();
                System.out.printf("%d ",numbers[i]);
            }

            if (counter > maxLength)
            {
                maxLength = counter;
                endElement = i;
            }
        }

        System.out.println();
        System.out.print("Longest: ");

        for (int j = endElement - maxLength + 1; j <= endElement; j++)
        {
            System.out.printf("%d ",numbers[j]);
        }

        System.out.println();

//        Scanner console=new Scanner(System.in);
//
//        String input=console.nextLine();
//        String[] inputArgs=input.split(" ");
//
//        int[]numbers=new int[inputArgs.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            numbers[i]=Integer.parseInt(inputArgs[i]);
//        }
//
//        int bestCount=1;
//        int bestElement=numbers[0];
//        int currentCount=1;
//
//        for (int i = 0; i < numbers.length-1; i++) {
//
//            int currentElement=numbers[i];
//            int nextElement=numbers[i+1];
//
//            if (currentElement==nextElement-1){
//
//                currentCount++;
//
//                System.out.printf("%d ",currentElement);
//            }
//            else{
//
//                currentCount=1;
//                System.out.printf("%d ",currentElement);
//
//                if (currentElement>nextElement){
//
//                    System.out.println();
//                }
//            }
//
//            if (currentCount>bestCount){
//
//                bestCount=currentCount;
//                bestElement=currentElement+1;
//            }
//        }
//
//        System.out.print(numbers[numbers.length-1]);
//
//        List<Integer>longestSequence=new ArrayList<>();
//
//        for (int i = bestElement+1-bestCount; i < bestElement+1; i++) {
//
//            longestSequence.add(i);
//        }
//
//        System.out.println();
//        System.out.print("Longest: ");
//
//        for (int num:longestSequence) {
//
//            System.out.print(num+" ");
//        }
    }
}
