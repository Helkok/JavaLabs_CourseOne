package lab5;

import java.util.Scanner;
public class Exercise1b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		for(int Z1 = 5;Z1 < 7; Z1 += 1){
			if(count == 0) {System.out.println("Z1 = " + Z1);}
			for(double Z2 = 0.5;Z2 < 0.7; Z2 += 0.01) {
				if(count == 0) {System.out.println("Z2 = " + Z2);}
				double P =(Math.pow(Z1,2) + Math.pow(Z2,2)) / Z1 * Z2;
				count += 1;
				System.out.println("P = " + P);
				
			}
		}
		System.out.println("Количество повторений цикла = " + count);
	}
}
