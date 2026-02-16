package arraysbidimensionales;

import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Create a Random generator
		Random rand = new Random();
		
		//The sum of all the numbers of a row or column
		int lowerSum = 0;
		
		//The sum of all the random numbers generated
		int totalSum = 0;
		
		//The table that will contain all the random numbers
		int table[][] = new int[6][5];
		
		/* We fill the table with all the random numbers
		 * The last cell of each row and column will be the sum of all the numbers of that row or column
		 */
		for(int i=0; i < table.length - 1; i++) {
			for (int j=0; j < table[j].length - 1; j++) {
				table[i][j] = 100 + rand.nextInt(899);
			}
		}
		
		//We include the sum of all the numbers of a row inside the last cell of this one
		for (int k=0; k < table.length; k++) {
			for (int l=0; l < table[l].length; l++) {
				lowerSum += table[k][l];
			}
			table[k][4] = lowerSum;
			totalSum += lowerSum;
			lowerSum = 0;
		}
		
		
		//Just as before, we will follow the same process with the columns
		for (int m=0; m < 4; m++) {
			for (int n=0; n < 3; n++) {
				lowerSum += table[n][m];
			}
			table[5][m] = lowerSum;
			totalSum += lowerSum;
			lowerSum = 0;
		}
		
		//Inside the cell of the right lower corner, we will show the total sum of all the random numbers of the table
		table[5][4] = totalSum;
		
		//The table is shown through the console
		for(int o = 0; o < 6; o++) {
			for(int p = 0; p < 5; p++) {
				System.out.print(table[o][p] + "\t");
			}
			System.out.println();
		}

	}

}
