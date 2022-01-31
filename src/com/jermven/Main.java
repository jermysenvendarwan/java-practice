package com.jermven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// mortgage = P * r * (1 + r) ^ n / (1 + r) ^n  - 1

        double mortgage = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        int annualInterestRate = scanner.nextInt();
        System.out.println("Period (Years): ");
        int period = scanner.nextInt();

        calculateMortgage();

        System.out.println("Mortgage: $" + mortgage);


    }

    public static void calculateMortgage() {
        System.out.println("From calculate Mortgage");;
    }
}
