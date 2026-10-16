package com.pluralsight;
import java.util.*;

public class POSCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sandwichPrice;
        int age;

        // Ask user for sandwich size
        System.out.println("Regular or Large Sandwich?: ");
        String sandwichSize = scanner.nextLine();

        // If/else statement for base sandwich price
        if (sandwichSize.equals("Regular")) {
            sandwichPrice = 5.45;
        }  else {
            sandwichPrice = 8.95;
        }
        // Ask user age
        System.out.println("Enter age: ");
        age = scanner.nextInt();

        // Conditional statements for discounts based on age,
        // Formats price to 2 decimal places before printing
        if (age <= 17) {
            sandwichPrice = (-sandwichPrice * .1) + sandwichPrice;
            String formattedPrice = String.format("%.2f", sandwichPrice);
            System.out.println("Your total for a " + sandwichSize + " is " + formattedPrice);

        } else if (age >= 65) {
            sandwichPrice = (-sandwichPrice * .2) + sandwichPrice;
            String formattedPrice = String.format("%.2f", sandwichPrice);
            System.out.println("Your total for a " + sandwichSize + " is " + formattedPrice);

        } else {
            System.out.println("Your total for a " + sandwichSize + " is " + sandwichPrice);
        }


    }
}
