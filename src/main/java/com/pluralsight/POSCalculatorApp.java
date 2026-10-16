package com.pluralsight;
import java.util.*;

public class POSCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sandwichPrice = 0;

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
        int age = scanner.nextInt();

        if (age <= 17) {
            sandwichPrice *= .1;
        } else if (age >= 65) {
            sandwichPrice *= .2;
        } else {
            System.out.println("Your total for a " + sandwichSize + " is " + sandwichPrice);
        }


    }
}
