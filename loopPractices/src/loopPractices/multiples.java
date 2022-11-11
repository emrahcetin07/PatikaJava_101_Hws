package loopPractices;

import java.util.Scanner;
//We are writing the program that prints the powers of 4 and 5 up to 
//...the number entered with Java loops on the screen.
public class multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;

        System.out.print("Enter number : ");
        number = input.nextInt();
        //in order for it to be a multiple of 4 and 5, it must be a multiple of 20.
        for (int i=1;i<=number;i*=20)
        {
        	

                System.out.println(i);

        	
        }


	}

}
