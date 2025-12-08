package arrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The temperature introduced by the user
		int temp;
		
		//The table where all the temperatures will be kept
		int table[] = new int[12];
		
		//The console waits for the user to introduce the temperature of every month
		for (int i = 0; i < table.length; i++) {
			System.out.println("Introduzca la temperatura media del mes " + (i+1) + ":");
			temp = sc.nextInt();
			
			//Every data will occupy a place in the table
			table[i] = temp;
		}
		
		//We want to paint the temperature as asterisks
		System.out.println("TEMPERATURAS DE CADA MES");
		
		//For the first month
		System.out.println("ENERO:");
		for (int e = 0; e < table[0]; e++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the second month
		System.out.println("FEBRERO:");
		for (int f = 0; f < table[1]; f++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the third month
		System.out.println("MARZO:");
		for (int m = 0; m < table[2]; m++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the fourth month
		System.out.println("ABRIL:");
		for (int a = 0; a < table[3]; a++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the fifth month
		System.out.println("MAYO:");
		for (int ma = 0; ma < table[4]; ma++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the sixth month
		System.out.println("JUNIO:");
		for (int j = 0; j < table[5]; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the seventh month
		System.out.println("JULIO:");
		for (int ju = 0; ju < table[6]; ju++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the eighth month
		System.out.println("AGOSTO:");
		for (int ag = 0; ag < table[7]; ag++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the ninth month
		System.out.println("SEPTIEMBRE:");
		for (int s = 0; s < table[8]; s++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the tenth month
		System.out.println("OCTUBRE:");
		for (int o = 0; o < table[9]; o++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the eleventh month
		System.out.println("NOVIEMBRE:");
		for (int n = 0; n < table[10]; n++) {
			System.out.print("*");
		}
		System.out.println();
		
		//For the twelfth month
		System.out.println("DICIEMBRE:");
		for (int d = 0; d < table[11]; d++) {
			System.out.print("*");
		}
		System.out.println();
		
		//Close Scanner
		sc.close();

	}

}
