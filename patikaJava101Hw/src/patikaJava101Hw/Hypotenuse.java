package patikaJava101Hw;

import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {
	public static void main(String[] args) 
	{
		
	double hypotenuse;
	double edge_1,edge_2;
	Scanner input =new Scanner(System.in);
	System.out.println("Enter the length of the sides of the triangle: ");
	edge_1=input.nextDouble();
	edge_2=input.nextDouble();
	hypotenuse= Math.sqrt(Math.pow(edge_1,2)+Math.pow(edge_2,2));
	System.out.println("Hypotenuse is : "+hypotenuse);
	
	
	
	
	
	}
	
	
	

}
