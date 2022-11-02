package patikaJava101Hw;

import java.util.Scanner;

public class AmountKDV {

	public static void main(String[] args) {
		double amount,kdvAmount,amountWithKDV;
		double kdv1=0.18;
		double kdv2=0.08;

		Scanner input =new Scanner(System.in);
		
		System.out.println("Amount values:");
		amount=input.nextDouble();
		
		 kdvAmount = amount < 1000 ? (amount * kdv1) : (amount*kdv2);
		 amountWithKDV = amount+kdvAmount;
		
		
		System.out.println("KDV free amont:"+amount);
		System.out.println("KDV with amount Rate:"+amountWithKDV);
		System.out.println("KDV amount:"+kdvAmount);
	

	}

}
