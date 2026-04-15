package com.pluralsight;

import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // prompting the user.
        System.out.print("How much would you like to deposit? ");
        double P = scanner.nextDouble();
        System.out.print("What is its interest rate? ");
        double rate = scanner.nextDouble();
        double r = rate / 100;
        System.out.print("How many years would you keep it in this CD? ");
        double t = scanner.nextDouble();

        // computing the information.
        double FV = P * (Math.pow(1 + (r / 365),(365 * t)));
        double TE = FV - P;

        //displaying our work.
        System.out.printf("The Future Value of your CD is %.2f%n", FV);
        System.out.printf("Your initial payment gained %.2f interest!%n", TE);
    }
}
