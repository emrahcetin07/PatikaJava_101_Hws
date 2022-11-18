package nearstMinMax;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number ");
		int x=input.nextInt();
		int[] list = {155,122,1780,10,-10,-778,-2,100,-45,150};
        Arrays.sort(list);//sorting from min to max
        System.out.println(Arrays.toString(list));

        int min = list[0];
        int max = list[list.length - 1];
       //finding max,min number
        for (int i : list) {
            if (i < max && i >x) {
                max = i;
            }
            if (i > min && i < x) {
                min = i;
            }
        }
        if(x<max && x>min) 
        {
        System.out.println("The closest number to "+ x+" on the list is greater than "+ x+" is "+ max);
        System.out.println("The closest number to "+ x+" on the list is smaller than "+ x+" is "+ min);
        }
        else {
        	System.out.println("Numbers not found");
        	
        }

    }
}
