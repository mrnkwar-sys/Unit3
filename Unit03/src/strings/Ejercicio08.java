package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String phrase;
		
		//The table that will contain the words from the phrase
		String phraseTable[];
		
		//The user has to introduce a phrase
		System.out.println("Introduzca una frase: ");
		phrase = sc.nextLine();
		
		//We turn the phrase into an array
		phraseTable = phrase.split(" ");
		
		//We order the table alphabetically
		Arrays.sort(phraseTable, String.CASE_INSENSITIVE_ORDER);
		
		//Show the ordered phrase through the console
		System.out.println(Arrays.toString(phraseTable));
		
		//Close Scanner
		sc.close();

	}

}
