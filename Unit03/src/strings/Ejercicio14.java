package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String phrase;
		
		//The table where we are going to keep the characters from the phrase
		char phraseCharacters[];
		
		//The number of times a letter appears in the phrase
		int times = 0;
		
		//The letter shown in the console
		char letter;
		
		//The user has to introduce a phrase
		System.out.println("Introduzca una frase: ");
		phrase = sc.nextLine();
		
		//We remove all the blank spaces from the phrase and turn all the letters into small letters
		phrase = phrase.trim().replace(" ", "").toLowerCase();
		
		//Fill the phraseCharacters table with the characters from the phrase
		phraseCharacters = phrase.toCharArray();
		
		//Order the phraseCharacters table alphabetically
		Arrays.sort(phraseCharacters);
		
//		for (int i = phraseCharacters.length - 1; i >= 0 ; i--) {
//			if (i < phraseCharacters.length - 1 && phraseCharacters[i] != phraseCharacters[i+1]) {
//				letter = phraseCharacters[i+1];
//				System.out.println(letter + ": " + times + " veces");
//				times = 0;
//			}
//			times++;
//		}
		
		for (int i = 0; i < phraseCharacters.length; i++) {
			if (i > 0 && phraseCharacters[i] != phraseCharacters[i-1]) {
				letter = phraseCharacters[i-1];
				System.out.println(letter + ": " + times + " veces");
				times = 0;
			}
			if (i == phraseCharacters.length -1) {
				times++;
				letter = phraseCharacters[i];
				System.out.println(letter + ": " + times + " veces");
			}
			times++;
		}
		
		//Close Scanner
		sc.close();

	}

}
