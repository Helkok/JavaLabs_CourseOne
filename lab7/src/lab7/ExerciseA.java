package lab7;
import java.util.Scanner;
public class ExerciseA {
	public static void main(String[] args) {
		System.out.println("Введите строку ");

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println("Изначальная строка: " + str);
		str = str.replace("*", "");
		str = str.replace("!", "!!");
		System.out.println("Получившаяся строка: " + str);
	}
}
