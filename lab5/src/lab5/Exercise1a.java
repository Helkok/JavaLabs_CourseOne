package lab5;

import java.util.Scanner;
public class Exercise1a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double Z1 = in.nextDouble();
		int count = 0;
		double Z2 = 0.5;
		System.out.println("Z1 = " + Z1);
		System.out.println("Z2 = " + Z2);
		for (;Z2 < 0.7; Z2 += 0.01) {
			double P =(Math.pow(Z1,2) + Math.pow(Z2,2)) / Z1 * Z2;
			System.out.println("P = " + P);
			count += 1;
		}
		System.out.println("Количество повторений цикла = " + count);
	}
}
