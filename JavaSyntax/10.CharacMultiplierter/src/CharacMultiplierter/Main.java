package CharacMultiplierter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String input=console.nextLine();

        String[] inputTokens=input.split(" ");

        String firstString=inputTokens[0];
        String secondString=inputTokens[1];

        long result=sumCharCodes(firstString,secondString);

        System.out.println(result);
    }

    private static long sumCharCodes(String firstString,String secondString){

        long sum=0;
        int shorterStringLength=Math.min(firstString.length(),secondString.length());

        for (int i = 0; i <shorterStringLength ; i++) {

            sum+=(firstString.charAt(i)*secondString.charAt(i));
        }

        String rest=null;

        if (firstString.length()>secondString.length()){

           rest=firstString.substring(secondString.length());
        }
        else{

            rest=secondString.substring(firstString.length());
        }

        for (int i = 0; i < rest.length(); i++) {

            sum+=rest.charAt(i);
        }

        return sum;
    }
}

