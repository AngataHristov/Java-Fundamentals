package FormattingNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        int a=console.nextInt();
        float b=console.nextFloat();
        float c=console.nextFloat();

        String aInBinaryString = Integer.toBinaryString(a);
        int aInBinary =Integer.parseInt(aInBinaryString);

        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|",a,aInBinary,b,c);
    }
}
