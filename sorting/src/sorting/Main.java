package sorting;

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
				if(numbers[j] < numbers[a]) {
                    temp= numbers[a];
                    numbers[a] = numbers[j];
                    numbers[j] = temp;
                }
			}
			
		}
			
		for (int i : numbers) {
			  System.out.println(i);
			}	
		

	}

}