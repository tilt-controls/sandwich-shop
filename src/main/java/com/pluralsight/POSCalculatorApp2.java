package com.pluralsight;

import java.util.Scanner;

public class POSCalculatorApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sandwichPrice = 0;
        int age;
        int regSandwich = 0;
        int largeSandwich = 1;


        // Ask user for sandwich size
        System.out.println("Regular or Large Sandwich?: ");
        System.out.println("Enter 0 for Regular sandwich or 1 for Large: ");
        int sandwichSize = scanner.nextInt();

        System.out.println();
        System.out.println("Would you like the sandwich loaded?: (y/n");
        String answer = scanner.nextLine();
        boolean isLoaded = answer.equals("y");


        if (isLoaded) {
            if (sandwichSize == 0) {
                sandwichPrice += 1.00;
        } else if (sandwichSize == 1) {
                sandwichPrice += 1.75;
        } else {

                System.out.println("Sandwich will not be loaded :(");
            }




        // If/else statement for base sandwich price
        if (sandwichSize == 1) {
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
