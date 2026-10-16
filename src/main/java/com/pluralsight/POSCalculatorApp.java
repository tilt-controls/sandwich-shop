package com.pluralsight;
import java.util.*;

public class POSCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for sandwich size
        System.out.println("Regular or Large Sandwich?: ");
        String sandwichSize = scanner.nextLine();

        // If/else statement for base sandwich price
        if (sandwichSize.equals("Regular")) {
            double sandwichPrice = 5.45;
        }  else {
            double sandwichPrice = 8.95;
        }
        // Ask user age
        System.out.println("Enter age: ");
        int age = scanner.nextInt();


    }
}
