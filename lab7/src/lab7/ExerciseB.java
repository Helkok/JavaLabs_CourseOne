//В заданном предложении имеются два слова, одно из которых является
//обращением другого ( т.е. "перевертышем" -> "нос" - "сон" ). 
//Найти эту пару слов.

package lab7;

import java.util.Scanner;

public class ExerciseB {
	public static String reverseString(String str) {
	      char[] array = str.toCharArray();
	      String result = "";
	      for (int i = array.length - 1; i >= 0; i--) {
	         result = result + array[i];
	      }
	      return result;
	    }
	

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		System.out.println("Введите строку со словами перевертышами:");

		String str = in.nextLine();
        String[] ds = str.split(" ");
        int flag = 1;
        for(int i = 0 ; i<ds.length-1; i++) {
            for(int z = i+1; z<ds.length; z++) {
                if(ds[i].length() == ds[z].length()) {
                    if(ds[i].equalsIgnoreCase(reverseString(ds[z]))) {
                		System.out.println("Слова перевертыши  в данной строке:");

                        System.out.print(ds[i] + " " + ds[z]);
                    }
                    
                }
            }
            }
        
        }

}