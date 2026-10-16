package com.pluralsight;

import java.util.Scanner;

public class POSCalculatorApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sandwichPrice;
        int age;


        // Ask user for sandwich size
        System.out.println("Hi! Welcome to Shop Sandwich.");
        System.out.println();
        System.out.println("""
        Enter 0 for Regular or..
        1 for Large:""");

        int sandwicSize = scanner.nextInt();
        scanner.nextLine();

        // Input if sandwich is loaded
        System.out.println();
        System.out.println("Would you like the sandwich loaded?: (y/n)");
        String answer = scanner.nextLine();
        System.out.println();

        boolean isLoaded = answer.equals("y");

        // Updates sandwich price based on size and if loaded
        if ((isLoaded) && sandwicSize == 0) {
            sandwichPrice = 6.45;
        } else if ((isLoaded) && sandwicSize == 1) {
            sandwichPrice = 10.7;
        } else if (sandwicSize == 0) {
            sandwichPrice = 5.45;
        } else {
            sandwichPrice = 8.95;
        }



        // Age input
        System.out.println("Enter age: ");
        age = scanner.nextInt();
        System.out.println();

        // Finalizes total with or without discount
        if (age <= 17) {
            sandwichPrice *= .9;
            String formattedPrice = String.format("%.2f", sandwichPrice);
            System.out.println("Your total for the sandwich is $" + formattedPrice); // 17 or under discount

        } else if (age >= 65) {
            sandwichPrice *= .8;
            String formattedPrice = String.format("%.2f", sandwichPrice);
            System.out.println("Your total for the sandwich is $" + formattedPrice); // Over 65 discount

        } else {
            System.out.println("Your total for the sandwich is $" + sandwichPrice); // No discount
        }


    }
}
