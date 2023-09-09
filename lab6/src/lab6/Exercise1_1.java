//В массиве С1, С2, ... , Сn найти сумму чисел, больших единицы.

package lab6;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество элементвов в массиве = ");
		int len = in.nextInt();
		int firstArray[] = new int[len];
		int sum = 0;
		System.out.println("Введите элементы массива ");
		
		for (int i=0; i<len; i++) {
			firstArray[i]= in.nextInt();
		}
		System.out.println("First array = " + Arrays.toString(firstArray));
		for (int i = 0; i < len; i++) {
			if (firstArray[i] > 1) sum += firstArray[i];
		}
		System.out.print("Сумма чисел, больших единицы == " + sum);
	}
}



