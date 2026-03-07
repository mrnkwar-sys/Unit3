package strings;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String normalPhrase;
		
		//The console wits for the user to introduce a phrase
		System.out.println("Introduzca una frase: ");
		normalPhrase = sc.nextLine();
		
		//The function palindromePhrase tells if the phrase introduced is palindrome or not
		System.out.println(palindromePhrase(normalPhrase));
		
		//Close Scanner
		sc.close();
	}
	
	public static String palindromePhrase(String normalPhrase) {
		//We need to remove all the blank spaces from the phrase introduced by the user
		normalPhrase = normalPhrase.trim().replace(" ", "");
		
		//The table where we are going to keep the reversed phrase
		char reversedPhrase[] = new char[normalPhrase.length()];
		
		//The reversed phrase
		String reversed;
		
		//The message that will tell if the phrase introduced is palindrome or not
		String palindromePhrase;
		
		//We fill the reversedTable with the values from the normalTable, but starting from the end of the table
		for (int i = normalPhrase.length() - 1; i >= 0; i--) {
			reversedPhrase[(normalPhrase.length() - 1) - i] = normalPhrase.charAt(i);
		}
		
		//We turn the table reversedPhrase into a String
		reversed = String.valueOf(reversedPhrase);
		
		//We check if both tables are identical
		if (reversed.equalsIgnoreCase(normalPhrase)) {
			palindromePhrase = "La frase introducida es una frase palíndroma";
		} else {
			palindromePhrase = "La frase introducia no es palíndroma";
		}
		
		return palindromePhrase;
	}

}
