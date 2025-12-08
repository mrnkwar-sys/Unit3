package clasearrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Create a Random
		Random rand = new Random();
		
		//The table that contains the winner combination
		int winTab[] = {14, 3, 5, 34, 25, 28};
		
		//The table that will contain a random combination of numbers
		int randTab[] = new int[6];
		
		//The numbers of the randTab that match the winTab
		int win = 0;
		
		//We fill one of the tables with random numbers
		for (int i = 0; i < randTab.length; i++) {
			randTab[i] = rand.nextInt(1, 49);
		}
		
		//If any of the random numbers matches any of the winner numbers, we will know it
		for (int j = 0; j < randTab.length; j++) {
			for(int match : winTab) {
				if (match == randTab[j]) {
					win++;
				}
			}
		}
		
		//The console shows both tables and all the matches
		System.out.println(Arrays.toString(winTab));
		System.out.println(Arrays.toString(randTab));
		System.out.println("Coinciden " + win + " números");

	}

}
