package OddAndEvenPairs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String nums=console.nextLine();
        String[] inputAsArr=nums.split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputAsArr.length; i++) {

            numbers.add(Integer.parseInt(inputAsArr[i]));
        }

            printPairs(numbers);
    }

    private static void printPairs(List<Integer> numbers){


        for (int i = 0; i < numbers.size()-1; i+=2) {

            int firstRemainder=numbers.get(i)%2;
            int secondRemainder=numbers.get(i+1)%2;

            if (firstRemainder==0&&secondRemainder==0){

                System.out.printf("%d, %d -> both are even \n",numbers.get(i),numbers.get(i+1));
            }
            else if (firstRemainder==1&&secondRemainder==1){

                System.out.printf("%d, %d -> both are odd \n",numbers.get(i),numbers.get(i+1));
            }
            else {

                System.out.printf("%d, %d -> different \n",numbers.get(i),numbers.get(i+1));
            }
        }
    }
}
