package boksGame;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

 

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
    
    public Fighter first() {
    	  Random r=new Random(); //random sınıfı
    	   int a=r.nextInt(3);
    	   
    	   if(a==0) {
    		   
    		   return f1;}
    	   else {
    		   return f2;
    	   }
    	
    }

	 void run() {
		Fighter ilk = first();
	     Fighter ikinci = ilk == f1 ? f2 :f1;
        if (checkWeight()) {
            while (ilk.health > 0 && ikinci.health > 0) {
            	System.out.println("ilk "+ilk.name+" başladı.");
                System.out.println("======== YENİ ROUND ===========");
                ikinci.health = ilk.hit(ilk);
                if (isWin()){
                    break;
                }
                ilk.health = ikinci.hit(ilk);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
        


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
