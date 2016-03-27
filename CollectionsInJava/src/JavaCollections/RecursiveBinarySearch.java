package JavaCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String n=console.nextLine();
        int numberForSearch=Integer.parseInt(n);
        String input=console.nextLine();
        String[] inputArgs=input.split(" ");

        List<Integer> numbers=new ArrayList<>();

        for (int i = 0; i < inputArgs.length; i++) {

            int currentNumber=Integer.parseInt(inputArgs[i]);
            numbers.add(currentNumber);
        }

        int index=binarySearch(numbers,0,numbers.size()-1, numberForSearch);

        System.out.println(index);
    }

    public static int binarySearch(List<Integer> numbers, int start, int end, int target) {

        int midIndex = (start + end) / 2;

        if (end < start) {
            return -1;
        }

        if (target == numbers.get(midIndex)) {
            return midIndex;
        } else if (target < numbers.get(midIndex)) {
            return binarySearch(numbers, start, midIndex - 1, target);
        } else {
            return binarySearch(numbers, midIndex + 1, end, target);
        }
    }
}
