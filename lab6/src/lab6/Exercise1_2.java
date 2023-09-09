package lab6;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество элементвов в массиве = ");
		int len = in.nextInt();
		double c[] = new double[len];
		double x[] = new double[len];
		System.out.println("Введите элементы массива ");
		for (int i=0; i<len; i++) {
			c[i]= in.nextInt();
		}
		System.out.println("Array X = " + Arrays.toString(c));
		
		for (int i=0; i < len / 2; i++) {
			x[i] = c[i * 2];
			x[len / 2] = c[len % 2 == 0 ? len - 1 : len / 2];
		}
		for (int i = len / 2 + 1; i < len; i++) {
			x[i] = c[(len - i) * 2 -1];
		}
		
		
		System.out.println("Array C = " + Arrays.toString(x));

		
		
		
	}
}

