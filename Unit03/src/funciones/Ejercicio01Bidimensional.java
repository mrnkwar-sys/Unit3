package funciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01Bidimensional {

	public static void main(String[] args) {
		// The result is shown through the console
		System.out.println(Arrays.toString(maximumAndMinimum(new int[6][10])));

	}
	
	public static int[] maximumAndMinimum(int[][] table) {
		//Create a Random
		Random rand = new Random();
		
		//The numbers that will be contained in the bidimensional table
		int num;
		
		//The smallest number from the table
		int min = Integer.MAX_VALUE;
		
		//The largest number from the table
		int max = Integer.MIN_VALUE;
		
		//Fill the table with all the random numbers
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				num = rand.nextInt(0, 1001);
				table[i][j] = num;
				
				/*
				 * Every time we add a new number to the table, we check if it bigger or smaller 
				 * than the ones introduced before
				 */
				if (num < min) {
					min = num;
				} else if (num > max){
					max = num;
				}
			}
		}
		
		//The table that contains the smallest and the largest number from the table
		int[] minimumAndMaximum = {min, max};
				
		//The function returns the table that contains the largest and smallest numbers
		return minimumAndMaximum;
		
	}

}
