package arrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// The table where the numbers will be kept
		int num[] = new int [12];
		
		//We give to some index a value and leave empty the others
		num[0] = 39;
		
		num[1] = -2;
		
		num[4] = 0;
		
		num[6] = 14;
		
		num[8] = 5;
		
		num[9] = 120;
		
		//We show the table in the console
		System.out.println(Arrays.toString(num));
		
		//The numbers that hasn't been initialized show a 0

	}

}
