package clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The table where the first ten numbers will be kept
		int firstTab[] = new int[10];
		
		//The table where the last 10 numbers will be kept
		int lastTab[] = new int[10];
		
		//The console waits for the user to introduce 20 numbers
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			
			//The first ten numbers introduced will be in a table; the rest, inside another
			if(i < 10) {
				firstTab[i] = num;
			} else {
				lastTab[i-10] = num;
			}
		}
		
		//We want to show if both tables are equals or not
		if (Arrays.equals(firstTab, lastTab)) {
			System.out.println("Las tablas son iguales");
		} else {
			System.out.println("Las tablas son distintas");
		}
		
		//Close Scanner
		sc.close();

	}

}
