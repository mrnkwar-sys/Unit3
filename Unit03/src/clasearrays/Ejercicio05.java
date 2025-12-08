package clasearrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//Create a Random Generator
		Random rand = new Random();
		
		//The number introduced by the user
		int num;
		
		//The position where the number introduced by the user has been saved
		int place;
		
		//The number of times that the number introduced by the user has been saved
		int times = 0;
		
		//The table where the random numbers will be saved
		int table[] = new int[1000];
		
		//Fill the table with random numbers
		for (int i = 0; i < table.length; i++) {
			table[i] = rand.nextInt(1, 100);
		}
		
		//The console waits for the user to introduce the number they are looking for
		System.out.println("Introduzca un número entre 1 y 99:");
		num = sc.nextInt();
		
		//Order the table
		Arrays.sort(table);
		
		//Look for the number introduced by the user
		place = Arrays.binarySearch(table, num);
		
		//We want to know how many times has the number been saved
		for (int many : table) {
			if (many == num) {
				times++;
			}
		}
		
		//In the console, we show if the value searched exists in the table and all the times it has been saved
		if (place > 0) {
			System.out.println("El valor está en la tabla " + times + " veces");
		} else {
			System.out.println("El valor introducido no existe en la tabla");
		}
		
		//Close Scanner
		sc.close();

	}

}
