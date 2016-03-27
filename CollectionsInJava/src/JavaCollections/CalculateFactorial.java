package JavaCollections;

import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        int n=console.nextInt();

        System.out.println(factorial(n));
    }

    private static long factorial(int n){

        if (n<=1){

            return 1;
        }

        return n*factorial(n-1);
    }
}
