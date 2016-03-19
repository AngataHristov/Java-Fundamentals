package TriangleArea;

import org.omg.CORBA.Environment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        System.out.println("Enter points");

        double aX=console.nextDouble();
        double aY=console.nextDouble();

        double bX=console.nextDouble();
        double bY=console.nextDouble();

        double cX=console.nextDouble();
        double cY=console.nextDouble();

        double area=calculateArea(aX,aY,bX,bY,cX,cY);

        if (area<=0){

            System.out.printf("Area: %d",0);
        }
        else {

            System.out.printf("Area: %.2f", ((double) Math.round(area)));
        }

    }

    private static double calculateArea(double aX,double aY,double bX,double bY,double cX,double cY){

        double area=Math.abs((aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY))/2);

        return area;
    }
}
