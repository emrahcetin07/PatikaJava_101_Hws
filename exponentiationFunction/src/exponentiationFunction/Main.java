package exponentiationFunction;

import java.util.Scanner;

public class Main {
	static int power(int base, int a) {
	    if (a != 0)
	        return (base * power(base, a - 1));
	    else
	        return 1;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter base number ");
        int a = input.nextInt();
        System.out.print("Enter power number(positive integer): ");
        int b = input.nextInt();
        System.out.println("Result: " + power(a,b));

	}

}
