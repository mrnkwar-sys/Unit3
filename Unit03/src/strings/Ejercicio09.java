package strings;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The phrase introduced by the user
		String phrase;
		
		//The user has to introduce a phrase
		System.out.println("Introduzca una frase: ");
		phrase = sc.nextLine();
		
		/*
		 * Check if the phrase introduced is in Javalandia's language
		 * If it contains "Javalin, javalon  " at the beginning, or "  javalen, len, len" at the end
		 * They are talking in Javalandia's language
		 */
		if (phrase.startsWith("Javalín, javalón  ") || phrase.endsWith("  javalén, len, len")) {
			//If it have any of the fillers, we remove them
			phrase = phrase.replace("Javalín, javalón  ", "");
			phrase = phrase.replace("  javalén, len, len", "");
			
			//We also remove the blank spaces from the beginning or the end, in case it has them
			phrase = phrase.trim();
			
			//Through the console, we show the phrase without the fillers
			System.out.println("La frase introducida está escrita en el idioma de Javalandia");
			System.out.println("La frase sin muletillas sería: ");
			System.out.println(phrase);
		} else {
			System.out.println("La frase introducida no está en el idioma de Javalandia");
		}
		
		//Close Scanner
		sc.close();

	}

}
