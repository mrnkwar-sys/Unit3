package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The table where the numbers introduced will be kept
		int table[] = new int [5];
		
		//The user has to introduce a number five times and these will be kept in a table
		for (int i = 0; i < table.length; i++) {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			
			table[i] = num;
		}
		
		//The table is shown in the console
		System.out.println(Arrays.toString(table));
		
		//Close Scanner
		sc.close();

	}

}
