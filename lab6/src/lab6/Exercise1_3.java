package lab6;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество элементвов в массиве = ");

		int len = in.nextInt();
		int array[] = new int[len];
		
		int indexOfMax = 0;
		int indexOfMin = 0;
		
		int sum = 0;
		int sum2 = 0;
		System.out.println("Введите элементы массива ");

		for (int i=0; i<len; i++) {
			array[i]= in.nextInt();
		}
		System.out.println("Array = " + Arrays.toString(array));
		
		for (int i = 1; i < len; i++)
		{
		    if (array[i] > array[indexOfMax])
		    {
		        indexOfMax = i;
		    }
		}
		
		for (int i = 0; i < len; i++) {
			if (i < indexOfMax) {
				sum += array[i];
			}
			else if (i > indexOfMax) {
				sum2 += array[i];
			}
		}
		
		System.out.println("Сумма чисел до максимального элемента == " + sum);
		System.out.println("Сумма чисел после максимального элемента == " + sum2);
	}

}