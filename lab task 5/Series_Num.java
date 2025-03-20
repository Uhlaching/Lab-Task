
package com.mycompany.series_num;
import java.util.Scanner;
public class Series_Num {

   public static int sumOfOddSquares(int n) {
        return (n * (2 * n + 1) * (2 * n - 1)) / 3; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("Sum of the series: " + sumOfOddSquares(n));
    }
}