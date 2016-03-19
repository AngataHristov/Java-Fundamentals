package FromBase7ToDecimal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        int number= console.nextInt();

        long decnum = 0;
        long r = 0;
        int j = 0;
        while (number != 0)
        {
            r = number % 10;
            decnum = (long)(decnum + (r * Math.pow(7, j++)));
            number = number / 10;
        }

        System.out.println(decnum);
    }
}
