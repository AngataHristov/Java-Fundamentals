package PrintCharacters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i ; j++) {

                char symbol=(char)(j%26+'a');
                System.out.print(symbol+" ");
            }

            System.out.println();
        }

        for (int i = n; i >=0 ; i--) {

            for (int j = 0; j < i ; j++) {

                char symbol=(char)(j%26+'a');
                System.out.print(symbol+" ");
            }

            System.out.println();
        }
    }
}
