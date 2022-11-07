package manavKasa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double A,E,D,M,P;
		Scanner input=new Scanner(System.in);
		System.out.println("Armut Kaç Kilo ? : ");
		A=input.nextDouble();
		System.out.println("Elma Kaç Kilo ?: ");
		E=input.nextDouble();
		System.out.println("Domates Kaç Kilo: ");
		D=input.nextDouble();
		System.out.println("Muz Kaç Kilo ? : ");
		M=input.nextDouble();
		System.out.println("Patlıcan Kaç Kilo ? : ");
		P=input.nextDouble();
		double tutar=(2.14*A+3.67*E+1.11*D+0.95*M+5.0*P);
		System.out.println("Toplam Tutar: "+tutar);

	}

}
