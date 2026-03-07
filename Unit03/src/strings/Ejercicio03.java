package strings;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String anyPhrase;
		
		//The user has to introduce a phrase
		System.out.println("Introduzca una frase");
		anyPhrase = sc.nextLine();
		
		//The program shows how many blank spaces there are in the phrase
		System.out.println("La frase contiene " + blankSpaces(anyPhrase) + " espacios blancos");
		
		//Close Scanner
		sc.close();
	}
	
	public static int blankSpaces(String anyPhrase) {
		//If the phrase contains a any blank space at the very beginning or at the end, we will remove them
		anyPhrase = anyPhrase.trim();
		
		//The table that will contain the phrase introduced by the user
		char phraseTable[];
		
		//The quantity of blank spaces in the phrase
		int blankSpace = 0;
		
		//We turn the phrase introduced into a table
		phraseTable = anyPhrase.toCharArray();
		
		//We check if any of the characters from the phrase contained in the phraseTable is a blank space
		for (int i = 0; i < phraseTable.length; i++) {
			//If it is, we count it
			if (phraseTable[i] == ' ') {
				blankSpace++;
			}
		}
		
		return blankSpace;
		
	}

}
