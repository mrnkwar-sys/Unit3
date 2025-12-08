package arrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The table where the numbers introduced would be kept
		int table[] = new int [8];
		
		//The console waits for the user to introduce eight numbers
		for (int i = 0; i < table.length; i++) {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			
			//Each number will occupy a place in a table
			table[i] = num;
		}
		
		//Now we want to show each number of the table and indicate if it is pair or impair
		for (int j = 0; j < table.length; j++) {
			System.out.print(table[j]);
			if (table[j]%2 == 0){
				System.out.println(" Es par");
			} else {
				System.out.println(" Es impar");
			}
		}
		
		//Close Scanner
		sc.close();

	}

}
