
package com.mycompany.alternating_series;

import java.util.Scanner;
public class Alternating_Series {

    public static int alternatingSum(int n) {
        return (n % 2 == 0) ? -n / 2 : (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("Sum of the series: " + alternatingSum(n));
    }
}