package loopPractices;

import java.util.Scanner;

//Make the program that calculates exponential numbers with the values 
//entered by the user in Java using the "For Loop".
public class exponential {

	public static void main(String[] args) 
	{
	    int n, k, i, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("floor : ");
        n = input.nextInt();
        System.out.print("ceil : ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {
            total *= n;
            if(i < k){
                continue;
            }else{
                System.out.println("result: " + total);
            }
        }

	}

}
