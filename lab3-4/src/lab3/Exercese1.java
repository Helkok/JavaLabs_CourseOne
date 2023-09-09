package lab3;

import java.util.Scanner;

public class Exercese1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double Y = in.nextDouble();
		
		if (Y < 20.5){
			double Z = Y * 101;
			System.out.println(Z);
		}		
		else if (Y > 20.5){
			double Z = Y - 101;
			System.out.println(Z);
		}	
		else {
			double Z = 0;
			System.out.println(Z);
		}	
		System.out.println();
		

	}
}