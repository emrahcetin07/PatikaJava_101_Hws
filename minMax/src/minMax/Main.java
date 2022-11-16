package minMax;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int temp;
		System.out.println("How much elemnts are in numbers ");
		int x=input.nextInt();
		int[] numbers= new int[x];//  x indicates how many elements the array will have
		
		for(int i=0; i<x;i++) {
			System.out.println("Enter "+(i+1)+". number: ");
			numbers[i]=input.nextInt();
		}
		
		
		//Sort numbers from largest to smallest
		for (int a=0;a<(x-1);a++) 
		{
			for(int j=a+1;j<x;j++) 
			{
				if(numbers[j] > numbers[a]) {
                    temp= numbers[a];
                    numbers[a] = numbers[j];
                    numbers[j] = temp;
                }
			}
			
		}
		//the array sorts all the numbers from large to small and 
		//is 0. the term is the largest number,and the last term is the smallest number.
			
		System.out.println("Maximum number: "+ numbers[0]);
		System.out.println("Minimum number: "+ numbers[x-1]);
		
		}
				
		

	

}