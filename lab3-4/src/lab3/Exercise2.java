package lab3;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		
		for(int i = 0; i < 3; i++) {
			int number = in.nextInt();
			if (A < number && number < B) {
				System.out.println("Число " + number + " входит в заданный интервал.");
			}
		}
		
		System.out.println();
		

	}
}