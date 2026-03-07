package strings;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String phrase;
		
		//The table where we are going to keep all the words from the phrase introduced
		String phraseTable[];
		
		//The length of the words from the phrase
		int length = 0;
		
		//The largest word from the phrase
		String largestWord = "";
		
		//The user has to introduce a phrase
		System.out.println("Introduzca un frase: ");
		phrase = sc.nextLine();
		
		//Once we know how many words has the phrase, we fill the phraseTable
		phraseTable = phrase.split(" ");
		
		//We search in the table which is the largest word from the phrase
		for (int i = 0; i < phraseTable.length; i++) {
			if (length < phraseTable[i].length()) {
				length = phraseTable[i].length();
				largestWord = phraseTable[i];
			}
		}
		
		//Through the console, we show both the largest word and how many characters it has
		System.out.println("La palabra de mayor longitud introducida es " + largestWord);
		System.out.println("Esta palabra tiene " + length + " letras");
		
		//Close Scanner
		sc.close();
		

	}

}
