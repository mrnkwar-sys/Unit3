package arraysbidimensionales;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		// The table which we are going to work with
		int table[][] = new int[6][3];
		
		//We fill the table with values
		table[0][0] = 0;
		
		table[1][0] = 30;
		
		table[2][0] = 2;
		
		table[5][0] = 5;
		
		table[0][1] = 75;
		
		table[2][2] = -2;
		
		table[3][2] = 9;
		
		table[5][2] = 11;
		
		//We show the table through the console
		for(int i = 0; i < table[i].length; i++) {
			for(int j = 0; j < table.length; j++) {
				System.out.print(table[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
