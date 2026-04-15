package com.pluralsight;

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //prompt the user for know values.
        System.out.print("What is your principle? ");
        double P = scanner.nextDouble();
        System.out.print("What is your interest rate? ");
        double r = scanner.nextDouble();
        System.out.print("What is the length of your loan? ");
        double y = scanner.nextDouble();


        double n = 12 * y;
        double i = r/12;

        //compute unknown values.
        double M = P * (i * Math.pow(1 + i, n)
                / ( Math.pow(1 + i, n) - 1));

        //display the output.
        System.out.println("Your monthly payment is: "+ M);
    }
}
