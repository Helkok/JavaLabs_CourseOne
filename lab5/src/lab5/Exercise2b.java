package lab5;

import java.util.Scanner;
public class Exercise2b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double X1 = in.nextDouble();
		double X2 = in.nextDouble();
		double P = in.nextDouble();
		int count = 0;
		double X = 2;
		System.out.println("X1 = " + X1);
		System.out.println("X2 = " + X2);
		System.out.println("P = " + P);
		do {
			double B =(X1 / X - P * X2)* X * (Math.sqrt(X1 - X2));
			System.out.println("B = " + B);
			count += 1;
			X++;
		} while (X<6);
		System.out.println("Количество повторений цикла = " + count);
	}
}