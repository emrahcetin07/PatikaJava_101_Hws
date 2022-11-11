package loopPractices;

import java.util.Scanner;

public class numberOfDigits {

	public static void main(String[] args) {
		 int number;
	        int value;
	        int total = 0;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter number : ");
	        number = input.nextInt();


	        while (number != 0) {
	            value = number % 10;
	            System.out.println(value);
	            total += value;
	            number /= 10;
	        }
	        System.out.println(total);
	}

}
