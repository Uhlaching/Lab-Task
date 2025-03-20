
package com.mycompany.power_calculation;
import java.util.Scanner;

public class Power_calculation {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
}