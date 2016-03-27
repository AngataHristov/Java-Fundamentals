package JavaCollections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String n=console.nextLine();
        int arrayLength=Integer.parseInt(n);
        String input=console.nextLine();
        String[] inputArgs=input.split(" ");

        int[] numbers=new int[arrayLength];

        for (int i = 0; i < inputArgs.length; i++) {

            numbers[i]=Integer.parseInt(inputArgs[i]);
        }

       // Arrays.sort(numbers);
        selectionSort(numbers);

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i]+" ");
        }
    }

    private static void selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++)
        {
            int minNum = i;

            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[j] < numbers[minNum])
                {
                    minNum = j;
                }

                if (minNum != i)
                {
                    int num = numbers[minNum];
                    numbers[minNum] = numbers[i];
                    numbers[i] = num;
                    minNum = i;
                }
            }
        }
    }
}
