package matrixTanspose;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner oku = new Scanner(System.in);
		int s;
		int i, j;
		System.out.println("Enter the number of rows and columns to be created");
		 s = oku.nextInt();
		int[][] matris = new int[s][s];// creates a multidimensional array as many as the entered number.
		int[][] transpoz = new int[s][s];
		for (i = 0; i < s; i++) {
			for (j = 0; j < s; j++) {
				System.out.println((i + 1) + "x" + (j + 1) + "enter number");
				matris[i][j] = oku.nextInt();
				transpoz[i][j] = matris[i][j];
			}
		}
		for (i = 0; i < s; i++) { // untransposed state
			for (j = 0; j < s; j++) {
				System.out.print(matris[i][j] + "\t");

			}

			System.out.println("");

		}

		System.out.println("");
		for (i = 0; i < s; i++) {
			for (j = 0; j < s; j++) {
				System.out.print(transpoz[j][i] + "\t");// form taken traspoz
			}

			System.out.println("");

		}

	}

}
