package thePerfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0;
		System.out.println("Enter number ");
		int x=input.nextInt();
		for(int i=1;i<x;i++) {
			if(x%i==0) { //If the number x is divided by i without remainder, then the number i is a multiplier of X. 
				total+=i; //multiplications are summed
			}	
		}
		
		if(total==x) {
			System.out.println(x+" is a perfect number ");
		}
		else {
			System.out.println(x+" is not a perfect number ");
			
		}

	}

}
