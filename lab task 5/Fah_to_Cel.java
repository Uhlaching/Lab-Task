
package com.mycompany.fah_to_cel;
import java.util.Scanner ;
public class Fah_to_Cel {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius\n", fahrenheit, celsius);
        
        scanner.close();
    }
}
