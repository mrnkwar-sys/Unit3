package strings;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
				
		//The word introduced by the user
		String word;
				
		//The first set of characters, that is to say, the ones that appear in the word introduced
		char secondSet[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
				
		//The second set of characters, that is to say, the ones that are going to replace some of the characters from the word introduced
		char firstSet[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
			
		//The table that will contain all the characters from the word introduced 
		char wordSet[];
				
		//The user has to introduce a word
		System.out.println("Introduzca una palabra: ");
		word = sc.nextLine();
				
		//We turn, in case the word has them, the capital letters into small letters
		word = word.toLowerCase();
				
		//We turn the word introduced into a table of characters
		wordSet = word.toCharArray();
				
		//In a loop, we change every character from the table wordSet into another one from the secondSet
		for (int i = 0; i < word.length(); i++) {
			wordSet[i] = code(firstSet, secondSet, wordSet[i]);
		}
				
		//Through the console we show the word encoded
		System.out.println(String.valueOf(wordSet));
				
		//Close Scanner
		sc.close();

	}
			
	public static char code (char firstSet[], char secondSet[], char c) {
		//The index of the place where the searched character is
		int searchedIndex = 0;
				
		//We search the value of the char c in the firstSet
		while (searchedIndex < firstSet.length && c != firstSet[searchedIndex]) {
			searchedIndex++;
		}
				
		//If searchedIndex is smallest than the table length, then the character is in the firstSet and we have to replace it
		if (searchedIndex < firstSet.length) {
			c = secondSet[searchedIndex];
		}
				
				
		return c;
	}

}
