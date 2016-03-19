package RandomizeNumbers;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        int n=console.nextInt();
        int m=console.nextInt();

        int minNum=Math.min(n,m);
        int maxNum=Math.max(n,m);

        List<Integer>numbers=new ArrayList<>();

        for (int i = minNum; i <=maxNum ; i++) {

            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int num :numbers) {

            System.out.printf("%d ",num);
        }

    }
}
