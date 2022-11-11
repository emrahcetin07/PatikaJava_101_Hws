package loopPractices;
//We will write a program that finds the harmonic series of the number entered in Java.
import java.util.Scanner;

public class harmonics {
	public static void main(String[] args) {
		 int number;
	        
	        double total = 0.0;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter number : ");
	        number = input.nextInt();


	        for (int i=1;i<=number;i++) {
	        	total+=(1.0/i);
	        }
	        System.out.println(total);
	}


}
