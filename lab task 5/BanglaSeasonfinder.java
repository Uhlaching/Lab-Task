
package com.mycompany.banglaseasonfinder;
import java.util.Scanner;
public class BanglaSeasonfinder {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        scanner.close();

        String season;
        switch (month) {
            case 1: case 2:
                season = "Winter";
                break;
            case 3: case 4:
                season = "Spring ";
                break;
            case 5: case 6:
                season = "Summer ";
                break;
            case 7: case 8:
                season = "Monsoon ";
                break;
            case 9: case 10:
                season = "Autumn ";
                break;
            case 11: case 12:
                season = "Late Autumn ";
                break;
            default:
                season = "Invalid month!";
        }

        System.out.println("Bangla Season: " + season);
    }
}