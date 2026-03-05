package funciones;

import java.util.Arrays;

public class Ejercicio02Bidimensional {

	public static void main(String[] args) {
		//The reversed table is shown through the console
		System.out.println(Arrays.deepToString(reversedTable(new int[4][4])));

	}
	
	public static int[][] reversedTable(int[][] normalTable){
		//The numbers that will fill the normal table
		int num = 0;
		
		//The reversed table that will contain the same numbers as the normal one, but in contrary positions
		int[][] reversedTable = new int[normalTable[0].length][normalTable.length];
		
		//We fill the normalTable with numbers that will go from 1 to whatever number
		for (int i = 0; i < normalTable.length; i++) {
			for (int j = 0; j < normalTable[i].length; j++) {
				num++;
				normalTable[i][j] = num;
				reversedTable[j][i] = num;
			}
		}
		
		//The function returns the reversed table
		return reversedTable;
	}

}
