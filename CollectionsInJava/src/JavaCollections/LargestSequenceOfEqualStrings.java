package JavaCollections;

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String input=console.nextLine();
        String[] inputArgs=input.split(" ");

        int bestCount=1;
        String bestElement=inputArgs[0];
        int currentCount=1;

        for (int i = 0; i < inputArgs.length-1; i++) {


            String currentElement=inputArgs[i];
            String nextElement=inputArgs[i+1];

            if (currentElement.equals(nextElement)){

                currentCount++;
            }
            else{

                currentCount=1;
            }

            if (currentCount>bestCount){

                bestCount=currentCount;
                bestElement=currentElement;
            }
        }

        for (int i = 0; i < bestCount; i++) {

            System.out.printf("%s ",bestElement);
        }
    }
}
