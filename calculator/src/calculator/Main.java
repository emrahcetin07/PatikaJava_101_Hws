package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b;
		int select;
		
		Scanner input=new Scanner(System.in);
		System.out.println("first number: ");
		a=input.nextDouble();
		System.out.println("second number: ");
		b=input.nextDouble();
		System.out.println("1-Addition\n2-subtraction\n3-multiplication\n4-division");
		
		System.out.println("Select: ");
		select=input.nextInt();
		switch(select)
		{
		case 1:
			System.out.println("Addition: "+(a+b));
			
		case 2:
			System.out.println("subtraction: "+(a-b));
		case 3:
			System.out.println("multiplication: "+(a*b));
		case 4:
			if(b!=0)
			   {
				System.out.println("multiplication: "+(a/b));
			   }
			else
			   {
				System.out.println("second number musn't be zero");
			   }
		}
			
		

	}

}
