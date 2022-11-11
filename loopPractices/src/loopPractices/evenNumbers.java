package loopPractices;

import java.util.Scanner;

public class evenNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;

        System.out.print("Enter number : ");
        number = input.nextInt();

        int sum=0,counter=0;

        for(int i=1; i<=number; i++){
            if(i%3==0 && i%4==0){
                sum += i;
                counter++;
            }
            
            	
            
        }

        double average = sum / counter;
       
            System.out.println("average : "+average);
        
    }
		

	

}
