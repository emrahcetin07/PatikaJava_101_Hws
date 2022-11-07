package daireAlanCevre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int r;
		double pi=3.14;
		int acı;
		Scanner input=new Scanner(System.in);
		System.out.println("Yarıcapı giriniz: ");
		r=input.nextInt();
		System.out.println("Açı değerinini giriniz: ");
		acı=input.nextInt();
		double alan=(pi*r*r*acı)/360;
		
		System.out.println("Dairenin alanı: "+alan);
		 
		
	}

}
