package com.pluralsight;

import java.util.Scanner;

public class Calculators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: $");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in months): ");
        int loanTermMonths = scanner.nextInt();

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate the monthly payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        // Calculate the total amount paid and the total interest paid
        double totalAmountPaid = monthlyPayment * loanTermMonths;
        double totalInterestPaid = totalAmountPaid - loanAmount;

        System.out.print("Monthly Payment; $" + monthlyPayment);
        System.out.print("Total Amount Paid: $" + totalAmountPaid);
        System.out.print("Total Interest Paid: $" + totalInterestPaid);

        scanner.close();
    }
}