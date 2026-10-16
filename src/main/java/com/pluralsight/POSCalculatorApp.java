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

        // Discount based on age,
        // Formats price to 2 decimal places before printing
        if (age <= 17) {
            sandwichPrice *= .9;
            String formattedPrice = String.format("%.2f", sandwichPrice);
            System.out.println("Your total for a " + sandwichSize + " sandwich is " + formattedPrice); // 17 or under discount

        } else if (age >= 65) {
            sandwichPrice *= .8;
            String formattedPrice = String.format("%.2f", sandwichPrice);
            System.out.println("Your total for a " + sandwichSize + " sandwich is " + formattedPrice); // Over 65 discount

        } else {
            System.out.println("Your total for a " + sandwichSize + " sandwich is " + sandwichPrice); // No discount
        }


    }
}
