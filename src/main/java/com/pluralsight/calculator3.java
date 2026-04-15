package com.pluralsight;
import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your monthly payout? ");
        double M = scanner.nextDouble();
        System.out.print("What is your expected interest rate? ");
        double rate = scanner.nextDouble();
        double r = rate / 100;
        System.out.print("What are your years of pay out to you users? ");
        double pay = scanner.nextDouble();

        double P = pay * 12;
        double i = r /12;

        // Calculating the code.
        double PV = M * (1 - Math.pow(1 + i, -P)) / i;

        // display my results.
        System.out.printf("You need $%.2f today%n", PV);

    }
}
