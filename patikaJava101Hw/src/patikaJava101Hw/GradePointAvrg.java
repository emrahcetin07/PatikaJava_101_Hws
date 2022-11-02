package patikaJava101Hw;

import java.util.Scanner;

public class GradePointAvrg {

	public static void main(String[] args) {
		int math,physics,chemical,turkish,history,music;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter thr grades for the courses (0-100)");
		
		System.out.println("Math: ");
		math=input.nextInt();
		
		System.out.println("Physics: ");
		physics=input.nextInt();
		
		System.out.println("Chemical: ");
		chemical=input.nextInt();
		
		System.out.println("Turkish: ");
		turkish=input.nextInt();
		
		System.out.println("History: ");
		history=input.nextInt();
		
		
		System.out.println("Music: ");
		music=input.nextInt();
		
		
		int total=(math+physics+chemical+turkish+history+music);
		double avrg=total/6.0;
		
		
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




