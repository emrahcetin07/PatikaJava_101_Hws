package loopPractices;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
       int a,b,fakt1 = 1,fakt2 = 1,fakt3 = 1,c;
		
		double result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("first number : ");
		a = scan.nextInt();
		
		System.out.print("second number : ");
		b = scan.nextInt();
		
		for(int i = 1; i<=a ;i++) {
			fakt1 *= i;
			
		}
		System.out.println(a + ". Fakttoriel: " + fakt1);
		
		for(int j = 1; j<=b; j++) {
			fakt2 *= j;
			
		}
		
		System.out.println(b + ". Faktoriel : " + fakt2);
		
		c = a - b;
		for(int z = 1; z<=c; z++) {
			fakt3 *= z;
			
		}
		
		System.out.println(c + ". Faktorieli : " + fakt3);
		
		result= fakt1 / (fakt2 * (fakt3));
		
		System.out.print("result : " + result);

	}

}
