package Average;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double numberOne=sc.nextDouble();
        double numberTwo=sc.nextDouble();
        double numberThree=sc.nextDouble();

        List<Double> numbers = new ArrayList<>();

        numbers.add(numberOne);
        numbers.add(numberTwo);
        numbers.add(numberThree);

        System.out.printf("Average: %.2f", numbers.stream().mapToDouble(d -> d).average().getAsDouble());
    }
}
