package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The sum of all the numbers
		int sum = 0;
		
		//The table where the numbers will be kept
		int table[] = new int [10];
		
		//The console waits for the user to introduce 10 numbers, which will be kept in the table
		for (int i = 0; i < table.length; i++) {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			table[i] = num;
			
			//The sum of all the numbers
			sum += num;
		}
		
		//To know which number is the largest and which one is the smallest, we order the list
		Arrays.sort(table);
		
		//We show the results in the console
		System.out.println("La suma de todos los números es " + sum);
		System.out.println("El número más pequeño es " + table[0] + ", mientras que el más grande es " + table[9]);
		
		//Close Scanner
		sc.close();
		
		
	}

}
