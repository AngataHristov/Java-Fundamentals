package HitTheTarget;

import java.util.Scanner;

public class Main {

     private static final int BottomBound  = 1;
    private static final int TopBound  = 20;

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        int target=console.nextInt();

        for (int i = 1; i <=20 ; i++) {

            for (int j = 1; j <20 ; j++) {

                if (i+j==target){

                    System.out.printf("%d + %d = %d \n",i,j,target);
                }
                else if (i-j==target)
                {
                    System.out.printf("%d - %d = %d \n",i,j,target);
                }
            }
        }
    }
}
