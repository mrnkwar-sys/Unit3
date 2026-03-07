package strings;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String normalString;
						
		//The user has to introduce a phrase
		System.out.println("Introduzca una frase: ");
		normalString = sc.nextLine();
				
		//The reversed phrase is shown through the console
		System.out.println(reversedString(normalString));
		
		//Close Scanner
		sc.close();

	}
	
	public static String reversedString (String normalString) {
		//If the String contains any blank spaces at the beginning or at the end, we will remove it
		normalString = normalString.trim();
		
		//The phrase introduced by the user but reversed
		String reversedPhrase;
		
		//The table that will contain the reversed String
		char reversedTable[] = new char[normalString.length()];
		
		//We fill the reversedTable with the characters from the normalString, but we will start from the end
		for (int i = normalString.length() - 1; i >= 0; i--) {
			reversedTable[(normalString.length()-1) - i] = normalString.charAt(i);
		}
		
		//We turn the reversedTable into a String
		reversedPhrase = String.valueOf(reversedTable);
		
		return reversedPhrase;
		
	}

}
