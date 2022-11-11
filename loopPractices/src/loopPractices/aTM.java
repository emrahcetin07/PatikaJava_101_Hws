package loopPractices;

import java.util.Scanner;

public class aTM {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int i=1000,total=0,q=3;
	        System.out.print("Name: ");
	        String t=scanner.nextLine();
	        System.out.print("password: ");
	        String k=scanner.nextLine();

	        if(t.equals("Emrah") && k.equals("**12**")) {
	            System.out.print("Türkiye bankasına hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
	            System.out.println("1-Para yatırma\n2-Para çekmek\n3-Bakiye sorgulama\n4-Çıkış");

	            int a =scanner.nextInt();
	            switch (a){
	                case 1:
	                    System.out.println("Para miktarı: ");
	                    int b=scanner.nextInt();
	                    i+=b;
	                    System.out.print("Bakiyeniz "+i);break;
	                case 2:
	                    System.out.println("Çekme istediğiniz tutar: ");
	                    int h=scanner.nextInt();
	                    if(h>i){
	                        System.out.println("Yetersiz bakiye");
	                    break;}
	                    else {
	                        i -= h;
	                        System.out.println("Bakiyeniz: " + i);
	                    }break;

	                    case 3:
	                        System.out.println("Mevcut Bakiyeniz: "+i);break;
	                case 4:
	                    System.out.println("İyi günler. Yine bekleriz...");break;
	            }

	        }
	           else {
	            q--;
	            
	        }
	 }

}
