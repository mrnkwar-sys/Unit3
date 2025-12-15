package arraysbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The table with the data from the students (4 students and 5 subjects)
		double table[][] = new double[4][5];
		
		//The console waits for the user to introduce all the grades
		for (int i = 0; i < table[i].length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.println("Introduzca una nota: ");
				table [j][i] = sc.nextDouble();
			}
		}
		
		//The console shows the table
		System.out.println(Arrays.deepToString(table));
		
		//Close Scanner
		sc.close();
	}

}
