package numberPattern;

import java.util.Scanner;

public class Main{
    static void des(int a,int b,int c){
            if (b<=-5) {
                c = 1;
                b+=10;
            }
            if (c==1){
                System.out.print(b + " ");
                if (a==b){
                    System.out.println("");
               }else {
                    des(a, b + 5, c);
                }
            }else {
                System.out.print(b + " ");
                des(a,b-5,c);
            }

    }
    public static void main(String[] args) {
        int n1,n2,count=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        n1 = input.nextInt();
        n2=n1;
        des(n1,n2,count);
    }
}

