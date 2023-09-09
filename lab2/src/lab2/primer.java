package lab2;

//A = ( R + B + L ) / ( Z1 ^2 + Z2 ) ; где Z1 = B * cos(L^2) ; Z2 = sin(L) / B .



import java.util.Scanner;

public class primer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int B = in.nextInt();
		int L = in.nextInt();
		double Z1 = B * (Math.cos(Math.pow(L, 2)));
		double Z2 = Math.sin(L) / B;

		double A = (R + B + L) / (Math.pow(Z1, 2) + Z2);
		
		System.out.println(A);
		

	}
}
