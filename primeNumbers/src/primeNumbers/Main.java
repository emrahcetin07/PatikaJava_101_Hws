package primeNumbers;

public class Main {

	public static void main(String[] args) {
		

			    int count=0;

			        for (int i = 2; i < 100; i++) {
			            for (int j = 2; j < i; j++) {
			                if (i % j == 0) {
			                    count++;
			                }
			            }
			            if (count == 0) {
			                System.out.print(i+" ");
			            }
			       count = 0;
			        }

			        
			  


	}

}
