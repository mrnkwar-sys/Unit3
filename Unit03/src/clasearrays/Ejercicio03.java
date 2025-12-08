package clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Random Generator
		Random rand = new Random();
		
		//The table where the random numbers will be kept
		int table[] = new int[30];
		
		//Fill the table with random numbers
		for (int i = 0; i < table.length; i++) {
			table[i] = rand.nextInt(1, 10);
		}
		
		//We order the values of the table
		Arrays.sort(table);
		
		//The table is shown in the console
		System.out.println(Arrays.toString(table));

	}

}
