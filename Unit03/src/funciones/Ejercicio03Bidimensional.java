package funciones;

public class Ejercicio03Bidimensional {

	public static void main(String[] args) {
		//Create a bidimensional table
		int bidimensionalTable[][] = {
				{1, 2, 3},
				{3, 5, 0},
				{3, 0, 5}
		};
		
		System.out.println(symmetricalTable(bidimensionalTable));

	}
	
	public static boolean symmetricalTable(int[][] bidimensionalTable){
		//The boolean that will tell if the table introduced is symmetrical or not
		boolean symmetrical = true;
		
		//The reversed table that will help the program to check if the table is symmetrical or not
		int[][] reversedTable = new int[bidimensionalTable[0].length][bidimensionalTable.length];
		
		//We fill the reversed table with the values of the bidimensional one
		for (int i = 0; i < bidimensionalTable.length; i++) {
			for (int j = 0; j < bidimensionalTable[i].length; j++) {
				reversedTable[j][i] = bidimensionalTable[i][j];
			}
		}
		
		//Now, we will compare both tables and check if the original one is symmetrical
		while (symmetrical == true) {
			for (int k = 0; k < bidimensionalTable.length; k++) {
				for (int l = 0; l < bidimensionalTable[k].length; l++) {
					if (reversedTable[k][l] != bidimensionalTable[k][l]) {
						symmetrical = false;
					} 
				}
			}
		}
		
		return symmetrical;
	}

}
