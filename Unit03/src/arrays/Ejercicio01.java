package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Initialize the random
		Random rand = new Random();
		
		// The table's name
		int randomNum[] = new int [10];
		
		//We fill the table with random numbers from 1 until 100
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = rand.nextInt(1, 101);
		}
		
		//The console shows the result
		System.out.println(Arrays.toString(randomNum));

	}

}
