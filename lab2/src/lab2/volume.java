package lab2;

//Создать программу, вычисляющую объем цилиндра (V) по формуле
//V = piR2H; pi=3,14.


import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int H = in.nextInt();
		double pi = 3.14;
		double V = pi * (Math.pow(R, 2)) * H;
		
		System.out.println(V);
		

	}
}
