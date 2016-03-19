package FromDecimalSystemTobase7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console= new Scanner(System.in);

        int number= console.nextInt();

        convertToBase7(number);
    }

    public static void convertToBase7(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%7;
            num = num/7;
        }

        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
