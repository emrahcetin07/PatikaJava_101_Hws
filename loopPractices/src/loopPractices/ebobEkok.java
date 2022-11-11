package loopPractices;

import java.util.Scanner;

//Write the EBOB and EKOK values of two numbers in Java using the "While Loop".
public class ebobEkok {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int n1, n2;
	        boolean a = false;
	        do {
	            System.out.print("n1 sayisini giriniz : ");
	            n1 = input.nextInt();
	            System.out.print("n2 sayisini giriniz : ");
	            n2 = input.nextInt();
	            if (n1 <= 0 || n2 <= 0) {
	                System.out.println("Pozitif Sayilar Giriniz.");
	            } else {
	                a = true;
	            }
	        } while (!a);
	        if (n2 < n1) {
	            int tempN2 = n2;
	            n2 = n1;
	            n1 = tempN2;
	        }
	        int i = n1;
	        while (i >= 1) {
	            if ((n1 % i == 0) && (n2 % i == 0)) {
	                System.out.println("ebob : " + i);
	                break;
	            } else {
	                i--;
	            }
	        }
	        int j = n2;
	        while (j <= (n1 * n2)) {
	            if ((j % n1 == 0) && (j % n2 == 0)) {
	                System.out.println("ekok : " + j);
	                break;
	            } else {
	                j++;
	            }
	        }
	    }
	

}
