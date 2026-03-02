package funciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		//The console shows the table through the console
		System.out.println(Arrays.toString(rellenaPares(5, 100)));

	}
	
	static int[] rellenaPares(int length, int end) {
		//The table where the numbers will be kept
		int table[] = new int[length];
		
		//The numbers that are inside the table
		int num;
		
		// Create a Random
		Random rand = new Random();
		
		//The table will be filled with random pair numbers only
		for (int i = 0; i < length; i++) {
			num = rand.nextInt(2, end+1);
			if (num%2 == 0) {
				table[i] = num;
			} else {
				table[i] = num - 1;
			}
		}
		
		return table;
	}

}
