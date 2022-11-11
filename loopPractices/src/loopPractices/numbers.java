package loopPractices;

import java.util.Scanner;

/**
 * We are writing the program that accepts 
inputs from the user until a single number 
is entered with Java loops and adds up the 
numbers that are even and multiples of 4 from the
entered values and presses the screen.
 *
 */
public class numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int total=0;
		
		do{
			System.out.print("Enter number : ");
	        number = input.nextInt();
if(number%2==0 && number%4==0) {
	total+=number;
	
}	
		}while(number%2==0);

		System.out.print("total: "+total);

	}

}
