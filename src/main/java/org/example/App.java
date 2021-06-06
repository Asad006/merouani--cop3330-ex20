package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        double amount;
        double tax;
        String answer;

        System.out.println("What is the order amount?");
        amount = Integer.parseInt(scanner.nextLine());
        System.out.println("What state do you live in?");
        answer = scanner.nextLine();
        if (answer.equals("Wisconsin")) {
            System.out.println("What county do you live in?");
            answer = scanner.nextLine();
            if (answer.equals("Eau Claire")) {
                tax = amount * 0.05005;
                amount += tax;
                displayResuts(amount, tax);

            } else if (answer.equals("Dunn")) {
                tax = amount * 0.05004;
                amount += tax;

            } else {

                tax = amount * 0.05;
                amount += tax;
                displayResuts(amount, tax);
            }
        } else if (answer.equals("Illinois")) {
            tax = amount * 0.08;
            amount += amount * 0.08;
            displayResuts(amount, tax);
        }else {
            displayResuts(amount,0);
        }

    }

    private static void displayResuts(double amount, double tax) {
        System.out.printf("The tax is $%.2f\nThe total is $%.2f.", tax, amount);
    }
}
