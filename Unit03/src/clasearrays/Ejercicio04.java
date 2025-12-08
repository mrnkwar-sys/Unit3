package clasearrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The scores of every participant
		int score;
		
		//The table where the scores will be saved
		int table[] = new int[8];
		
		//The same table but with the scores ordered from the largest one to the smallest
		int ordTab[] = new int[8];
		
		//The console waits for the user to introduce all the scores (8)
		for (int i = 0; i < table.length; i++) {
			System.out.println("Introduzca la puntuación conseguida:");
			score = sc.nextInt();
			
			//The score will be saved in the table
			table[i] = score;
		}
		
		//We order the table
		Arrays.sort(table);
		
		//We create another table with the same scores of the first one, but ordered from the largest to the smallest
		for (int j = 0; j < ordTab.length; j++) {
			ordTab[j] = table[7-j];
		}
		
		//The scores will be shown in the console from the larger to the smallest
		System.out.println(Arrays.toString(ordTab));
		
		//Close Scanner
		sc.close();

	}

}
