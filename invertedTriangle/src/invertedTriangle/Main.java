package invertedTriangle;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        int x = 0;
	        Scanner input = new Scanner(System.in);
	        do {
	            System.out.println("Enter a number:");
	            x = input.nextInt();
	        }while (x < 0);

	        for(int i = 1; i <= x; i++) {
	            for(int j = 1 ; j <= i - 1 ; j++) {
	                System.out.print(" ");
	            }
	            for(int k = (2 * x) - 1; k >= (2*i) - 1 ; k--) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
