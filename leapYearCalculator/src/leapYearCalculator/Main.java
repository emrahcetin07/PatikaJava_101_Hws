package leapYearCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year ? ");
		year=input.nextInt();
		 //For a year to be a leap year, it must be divisible by both 4 and 400 without a remainder.
		if (year % 4 == 0 && !(year % 100 == 0) || (year & 400) ==0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }


	}

}
