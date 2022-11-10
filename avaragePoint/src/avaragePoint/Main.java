package avaragePoint;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int math,physics,chemical,turkish,music;
		double total = 0;//total course
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the grades for the courses ");
	        

	    System.out.print("Math:");
	    math = input.nextInt();
	    
	        if(math >0 && math<=100) {
	            total += math;
	        } else {
	            System.out.println("Wrong!");
	            System.exit(0);
	        } 
	        
	        
	        System.out.print("physics:");
	        physics = input.nextInt();
	        if(physics >0 && physics<=100) {
	            total+= physics;
	        } else {
	            System.out.println("Wrong!");
	            System.exit(0);
	        } 

	        System.out.print("turkish :");
	        turkish = input.nextInt();
	        if(turkish>0 && turkish<=100) {
	            total+=turkish;
	        } else {
	            System.out.println("Wrong!");
	            System.exit(0);
	        } 

	        System.out.print("chemical:");
	        chemical = input.nextInt();
	        if(chemical >0 && chemical<=100) {
	            total+= chemical;
	        } else {
	            System.out.println("Wrong!");
	            System.exit(0);
	        } 

	        System.out.print("Music :");
	        music= input.nextInt();
	        if(music>0 && music<=100) {
	            total += music;
	        } else {
	            System.out.println("Wrong!");
	            System.exit(0);
	        } 

	        double avrg = total / 5;
	        System.out.println("Your grade point average:  "+avrg);
			if(avrg>60.) 
			{
				System.out.println("You passed the class");
			}
			else {
				System.out.println("You failed the class");
			}
	    }
	}

	