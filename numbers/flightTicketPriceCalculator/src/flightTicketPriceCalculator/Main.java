package flightTicketPriceCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // variable definition
		double km;
		int age, tripType;
		double pricePerKilometers = 0.1; // ticket price per kilometers
		double ageDiscount1 = 0.5; // Discount rate for under 12 years old
		double ageDiscount2 = 0.1; // Discount rate for 12 to 24 years old
		double ageDiscount3 = 0.3; // Discount rate for over 65 years old
		double roundDiscount = 0.2;

		Scanner input = new Scanner(System.in);

		System.out.println("How many km is the flight distance ? ");
		km = input.nextDouble();
		double totalCost = km * pricePerKilometers;// total cost calculate
		// login information check
		if (km < 0) {
			System.out.println("You entered wrong value !, km must be positive.Try again");

		} else {
			System.out.println("Flight price without discount: "+totalCost);
			System.out.println("How old are you ? ");
			age = input.nextInt();

			if (age < 0) {
				System.out.println("You entered wrong value !, age must be positive.Try again");
			} else {
				if (age <= 12) {
					totalCost = totalCost * (1 - ageDiscount1);
					System.out.println("Cost after applying the first age group discount " + totalCost);

				}

				else if (age > 12 && age < 24) {
					totalCost = totalCost * (1 - ageDiscount2);
					System.out.println("Cost after applying the second age group discount  " + totalCost);
				}

				else if (age > 65) {
					totalCost = totalCost * (1 - ageDiscount3);
					System.out.println("Cost after applying the third age group discount " + totalCost);
				}

				System.out.println("What is your trip type? ");
				System.out.println("1-One way trip\n2-Round Trip");
				tripType = input.nextInt();
				if (tripType == 1 || tripType == 2) {
					System.out.println("Please wait,You are directed to the payment page...");
					if (tripType == 2) {
						totalCost = 2 * (totalCost * (1 - roundDiscount)); // It is a round trip we multiply it by 2
						System.out.println("The cost after discount due to trip type: " + totalCost);
					}

				}
				else {
					System.out.println("Wrong value");
					
				}

			}

		}

		System.out.println("Total Cost: " + totalCost);
		System.out.println("*******HAVE A GOOD FLİGHT*******");

	}

}
