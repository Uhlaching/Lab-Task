package com.mycompany.factorial_num;
import java.util.Scanner;

public class Factorial_Num {

   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your number: ");
       int n, factorial = 1;
       n = input.nextInt();
       
      
       for (int i = 1; i <= n; i++) { 
           factorial *= i; 
       }
       
       System.out.println("Factorial of " + n + " is: " + factorial);  
       input.close(); 
   }
}

