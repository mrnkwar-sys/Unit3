package funciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {
		// The sum of the numbers is shown in the console
		System.out.println(Arrays.toString(sum(new int[6], 3)));

	}
	
	static int[] sum(int t[], int numElements) {
		//Create a Random
		Random rand = new Random();
		
		//The numbers that will be contained in the t table
		int num;
		
		//The table where the sums of the numbers will be kept
		int sumTable[] = new int[(t.length - numElements) + 1];
		
		//The sum of the numbers contained in the t table
		int sum = 0;
		
		//The index from where we are going to start the sum
		int index = 0;
		
		//The t table will be filled with random numbers
		for (int i = 0; i < t.length; i++) {
			num = rand.nextInt(1, 50);
			t[i] = num;
		}
		
		/*
		 * We fill the sumTable with the sums of the random numbers
		 * We calculate the number of times the sum will be done depending of the value of numElements
		 */
		for (int j = 0; j < (t.length - numElements) + 1; j++) {
			for (int k = 0; k < numElements; k++) {
				sum += t[index++];
			}
			index = j+1;
			sumTable[j] = sum;
			sum = 0;
		}
		
		return sumTable;
		
	}

}
