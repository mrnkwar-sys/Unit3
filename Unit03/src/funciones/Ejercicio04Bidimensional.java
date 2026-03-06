package funciones;

import java.util.Arrays;

public class Ejercicio04Bidimensional {

	public static void main(String[] args) {
		//The supposed magical matrix
		int table[][] = {
				{4, 9, 2},
				{3, 5, 7},
				{8, 1, 6}
		};
		
		//We show the result through the console
		System.out.println(isMagical(table));

	}
	
	public static boolean isMagical(int table[][]) {
		/*
		 * A magical arrays refers to an array where the sum of any column or row 
		 * have the same result
		 */
		// The sum of the numbers from a row or column
		int sum = 0;
		
		//The boolean that will indicate if the table is magical or not
		boolean isMagical;
		
		//The table that will keep the sum of each row
		int rowTable[] = new int[table.length];
		
		//The table that will keep the sum of each column
		int columnTable[] = new int[table[0].length];
		
		//This for will fill the table columnTable with the result of the sum of each column
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				sum += table[j][i];
			}
			columnTable[i] = sum;
			sum = 0;
		}
		
		//This loop will fill the rowTable with the result of the sum of each row
		for(int k = 0; k < table.length; k++) {
			for (int l = 0; l < table[k].length; l++) {
				sum += table[k][l];
			}
			rowTable[k] = sum;
			sum = 0;
		}
		
		/*
		 * Now we compare both tables: columnTable and rowTable
		 * If the contain the same results, the boolean will be true
		 */
		isMagical = Arrays.equals(columnTable, rowTable);
		
		return isMagical;
	}

}
