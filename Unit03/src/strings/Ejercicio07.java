package strings;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String phrase;
		
		//The word that we are looking for in the phrase
		String word;
		
		//The user has to introduce a phrase and a word
		System.out.println("Introduzca una frase: ");
		phrase = sc.nextLine();
		
		System.out.println("Ahora introduzca una palabra: ");
		word = sc.nextLine();
		
		//We show in the console how many times has the word introduced appear in the phrase
		System.out.println("La palabra " + word + " aparece " + howManyTimes(phrase, word) + " veces");
		
		//Close Scanner
		sc.close();

	}
	
	public static int howManyTimes (String phrase, String word) {
		//The quantity of times the word appears in the phrase
		int quantity = 0;
		
		//We remove the blank spaces from the phrase introduced
		phrase = phrase.trim();
		
		//The table that will contain the phrase split 
		String splitPhrase[] = phrase.split(" ");
		
		//We search if any of the indexes from the table splitPhrase contains the word searched
		for(int i = 0; i < splitPhrase.length; i++) {
			if (splitPhrase[i].equalsIgnoreCase(word)) {
				quantity++;
			}
		}
		
		return quantity;
	}

}
