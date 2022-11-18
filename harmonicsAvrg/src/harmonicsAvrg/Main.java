package harmonicsAvrg;

public class Main {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        double sum = 0.0;
	        for (int i = 0; i < numbers.length; i++) {
	        	double harmonics=(1.0/numbers[i]);
	            sum += harmonics;
	            System.out.println((i+1)+". harmonics: "+harmonics );
	        }

	        System.out.println(sum );
	 }

}
