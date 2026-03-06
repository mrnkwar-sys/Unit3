package funciones;

import java.util.Arrays;

public class Ejercicio05Bidimensional {

	public static void main(String[] args) {
		//The initial Table
		int InitialTable[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		// Show the result in the console
		System.out.println(Arrays.deepToString(turn90(InitialTable)));

	}
	
	public static int[][] turn90(int InitialTable[][]){
		//The InitialTable but turned 190 degrees
		int turnedTable[][] = new int[InitialTable.length][InitialTable[0].length];
		
		//We fill the table with the numbers from the InitialTable
		for (int i = turnedTable.length - 1; i > -1; i--) {
			for  (int j = 0; j < turnedTable[i].length; j++) {
				turnedTable[j][(turnedTable.length-1) - i] = InitialTable[i][j];
			}
		}
		
		return turnedTable;
	}

}
