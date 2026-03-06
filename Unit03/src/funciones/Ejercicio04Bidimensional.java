package funciones;

public class Ejercicio04Bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isMagical(int table[][]) {
		/*
		 * A magical arrays refers to an array where the sum of any column or row 
		 * have the same result
		 */
		// The sum of the numbers from a row or column
		int sum = 0;
		
		//The boolean that will indicate if the table is magical or not
		boolean isMagical = true;
		
		//The variable that will contain the result that all the rows and columns should give after summoning their numbers
		int result = 0;
		
		while(isMagical == true) {
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					sum += table[i][j];
				}
				if (result == sum) {
					isMagical = true;
				} 
				sum = 0;
			}
		}
		
		return isMagical;
	}

}
