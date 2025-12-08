package clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The value introduced by the user
		int value;
		
		//The size introduced by the user
		int size;
		
		//The console waits for the user to introduce the size and the value
		System.out.println("Introduzca un tamaño:");
		size = sc.nextInt();
		
		System.out.println("Introduzca un valor:");
		value = sc.nextInt();
		
		//We will create a table which size will be the size introduced by the user
		int table[] = new int[size];
		
		//We fill all the table with the value introduced by the user
		Arrays.fill(table, value);
		
		//The console shows the table
		System.out.println(Arrays.toString(table));
		
		//Close Scanner
		sc.close();

	}

}
