package clasearrays;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {
		// The table where numbers from 1 to 10 will be saved
		int table[] = new int[55];
		
		//The starting value
		int value = 0;
		
		//The table will save once the 1, twice the 2, three times the 3...
		for(int i = 1; i <= 10; i++) {
			Arrays.fill(table, value, value + i, i);
			value++;
		}
		
		//Show the table in the console
		System.out.println(Arrays.toString(table));

	}

}
