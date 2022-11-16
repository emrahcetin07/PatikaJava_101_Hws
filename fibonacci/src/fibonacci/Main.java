package fibonacci;

import java.util.Scanner;

public class Main {
	
             //recursive method
		    static int fib(int n) {
		    if(n==1 || n==2){
		        return 1;
		    }

		    return fib(n-1)+fib(n-2);//Each digit is summed with the previous digit.

		}
		    public static void main(String[] args) {
		    	Scanner input=new Scanner(System.in);
				System.out.println("How many Fibonacci sequences do you want? ");
				int x=input.nextInt();
		    	for(int i=1;i<=x;i++) {
		        System.out.println(fib(i));
		    	}
		    }
		

	

}
