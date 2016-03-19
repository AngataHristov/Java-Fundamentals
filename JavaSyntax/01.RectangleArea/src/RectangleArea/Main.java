package RectangleArea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        int firstNumber=console.nextInt();
        int secondNumber=console.nextInt();

        if (firstNumber<=0||secondNumber<=0){

            throw new IllegalArgumentException("Side cannot be negative");
        }

        int area=firstNumber*secondNumber;

        System.out.printf("Area: %d",area);
    }
}
