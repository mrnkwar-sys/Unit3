package funciones;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Show the table with the indices in the console
		System.out.println("El número buscado se encuentra en los siguientes índices: " + Arrays.toString(searchAll(new int[10], 22)));

	}
	
	static int[] searchAll(int t[], int value) {
		//Create a Random
		Random rand = new Random();
		
		int table[] = new int[0];
		
		//The index of the table that contains the places of the searched value
		int index = 0;
		
		//The searched value
		int keyIndex = 0;
		
		//The values that will fill the table
		int num;
		
		//We fill the table with random numbers from 1 to 100, for example
		for (int i = 0; i < t.length; i++) {
			num = rand.nextInt(1, 101);
			t[i] = num;
		}
		
		//We will check if the searched value is contained in the table t and, if it is, we will keep its index
		while (keyIndex < t.length) {
			if (value == t[keyIndex]) {
				table = new int[index+1];
				table[index] = keyIndex;
				index++;
			}
			
			keyIndex++; 
		}
		
		return table;
	}

}
