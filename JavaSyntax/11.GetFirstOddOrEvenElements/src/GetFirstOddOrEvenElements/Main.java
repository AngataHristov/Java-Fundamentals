package GetFirstOddOrEvenElements;

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

         String[] input=console.nextLine().split(" ");

        int count=Integer.parseInt(input[1]);
        String command=input[2];

        List<Integer> result=getNumbers(numbers,command,count);

        for (int num:result){

            System.out.printf("%d ",num);
        }
    }

    private static List<Integer> getNumbers(List<Integer> numbers,String command,int count){

        switch (command){

            case "even":
                return getEvenNumbers(numbers,count);
            case "odd":
                return getOddNumbers(numbers,count);
        }

        return null;
    }

    private static List<Integer> getEvenNumbers(List<Integer> numbers,int count){

        int counter=0;
        List<Integer> result=new ArrayList<>();

        for (int num :numbers) {

            if (num %2==0&&counter<=count){

                result.add(num);
                counter++;
            }
        }

        return result;
    }

    private static List<Integer> getOddNumbers(List<Integer> numbers,int count){

        int counter=0;
        List<Integer> result=new ArrayList<>();

        for (int num :numbers) {

            if (num %2!=0&&counter<=count){

                result.add(num);
                counter++;
            }
        }

        return result;
    }
}
