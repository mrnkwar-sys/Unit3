package funciones;

import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Show the searched index in the console
		System.out.println("El valor clave se encuentra en el indice " + search(new int[7], 10));

	}
	
	static int search(int t[], int key) {
		//Create a Random 
		Random rand = new Random();
		
		//The values of the table
		int value;
		
		//The index where the key value is supposed to be
		int searchedIndex = 0;
		
		//We fill the table with random values from 1 to 100, for example
		for (int i = 0; i < t.length; i++) {
			value = rand.nextInt(1, 101);
			t[i] = value;
		}
		
		/*
		 * If the key value is inside the table t, the function will tell its position in the table
		 * If not, the function will show a -1 instead
		 */
		while(searchedIndex < t.length && key != t[searchedIndex]) {
			searchedIndex++;
		}
		
		if(searchedIndex < t.length) {
			return searchedIndex;
		} else {
			searchedIndex = -1;
			return searchedIndex;
		}
	}

}
