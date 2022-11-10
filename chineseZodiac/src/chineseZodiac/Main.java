package chineseZodiac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yearOfBirth;
		String animal = "";
        int zodiac;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your birthday year ? ");
		yearOfBirth=input.nextInt();
		
		  zodiac = yearOfBirth % 12;
		  //We take the mode of year according to 12 and find the remainder,this will be the values
		  //... that we will assign to our zodiac variable

	        switch (zodiac) {
	            case 0:
	                animal = "Monkey";
	                break;
	            case 1:
	                animal = "Cockerel";
	                break;
	            case 2:
	                animal = "Dog";
	                break;
	            case 3:
	                animal = "Pig";
	                break;
	            case 4:
	                animal = "Mouse";
	                break;
	            case 5:
	                animal = "Bull";
	                break;
	            case 6:
	                animal = "Tiger";
	                break;
	            case 7:
	                animal = "Rabbit";
	                break;
	            case 8:
	                animal = "Dragon";
	                break;
	            case 9:
	                animal = "Snake";
	                break;
	            case 10:
	                animal = "Horse";
	                break;
	            case 11:
	                animal = "Sheep";
	                break;   
	        }
	        
	   
	            System.out.println("Your Chinese Zodiac Sign : " + animal);
	        
		
		
		

	}

}
