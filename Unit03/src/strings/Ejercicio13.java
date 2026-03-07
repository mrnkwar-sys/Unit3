package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The first word introduced by the user
		String firstWord;
		
		//The second word introduced by the user
		String secondWord;
		
		//The user has to introduce two words
		System.out.println("Introduzca una primera palabra:");
		firstWord = sc.nextLine();
		
		System.out.println("Introduzca otra palabra:");
		secondWord = sc.nextLine();
		
		//The result is shown through the console
		System.out.println(isAnagram(firstWord, secondWord));
		
		//Close Scanner
		sc.close();

	}
	
	public static String isAnagram (String firstWord, String secondWord) {
		//The message that will tell if the words could be an anagram or not
		String anagram = "";
		
		/*
		 * We remove the blank spaces from the beginning and the end of the words, in case they have them
		 * And, if they have capital letters, we turn them into small ones
		 */
		firstWord = firstWord.trim().toLowerCase();
		secondWord = secondWord.trim().toLowerCase();
		
		//We turn both words into a table where we are going to keep their characters separated
		char firstWordTable[] = firstWord.toCharArray();
		char secondWordTable[] = secondWord.toCharArray();
		
		//First, we are going to check if both arrays have the same length
		if (firstWordTable.length == secondWordTable.length) {
			//If they have the same length, we will order them alphabetically
			Arrays.sort(firstWordTable);
			Arrays.sort(secondWordTable);
			
			//If they contain the same characters, then they will be an anagram
			if (Arrays.equals(firstWordTable, secondWordTable)) {
				anagram = "Las palabras introducidas forman un anagrama";
			} else {
				anagram = "Las palabras introducidas no pueden formar un anagrama";
			}
		} else {
			anagram = "Las palabras introducidas no pueden formar un anagrama";
		}
		
		return anagram;
	}

}
