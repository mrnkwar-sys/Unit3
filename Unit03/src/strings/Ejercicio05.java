package strings;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The words introduced by the user that will end up shaping a whole phrase
		String finalPhrase;
		
		//The user has to introduces at least one word
		System.out.println("Introduzca una palabra");
		finalPhrase = sc.nextLine();
		
		//The user will be introducing words until the introduce "fin"
		do {
			System.out.println("Introduzca otra palabra: ");
			finalPhrase += " " + sc.nextLine();
		} while (!(finalPhrase.contains("fin")));
		
		//We remove the word "fin" from the phrase
		finalPhrase = finalPhrase.replace("fin", "");
		
		//Show the whole phrase through the console
		System.out.println(finalPhrase);
		
		//Close Scanner
		sc.close();

	}

}
