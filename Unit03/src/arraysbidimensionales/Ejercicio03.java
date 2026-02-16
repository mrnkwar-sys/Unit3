package arraysbidimensionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The table that will contain all the data
		int table[][];
		
		//The number of rows asked to the user
		int rows;
		
		//The number of columns asked to the user
		int col;
		
		//The console waits for the user to introduce the number of rows and columns that the table will have
		System.out.println("Introduzca el número de filas de su tabla: ");
		rows = sc.nextInt();
		
		System.out.println("Introduzca el número de columnas de su tabla: ");
		col = sc.nextInt();
		
		//Now that the user has told us how is the table they want, we establish it
		table = new int [rows][col];
		
		//The content of the cell [i][j] must be 10*(i+j)
		for (int i=0; i < table.length; i++) {
			for (int j=0; j < col; j++) {
				table[i][j] = 10*(i+j);
			}
		}
		
		//The table appears in the console
		for(int i=0; i < table.length; i++) {
			for(int j=0; j < col; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Close Scanner
		sc.close();

	}

}
