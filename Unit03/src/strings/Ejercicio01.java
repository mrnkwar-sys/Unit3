package strings;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The first phrase introduced by the user
		String firstPhrase;
		
		//The second phrase introduced by the user
		String secondPhrase;
		
		//The user introduces the first phrase
		System.out.println("Introduzca una frase: ");
		firstPhrase = sc.nextLine();
		
		//The user introduces another phrase
		System.out.println("Introduzca otra frase");
		secondPhrase = sc.nextLine();
		
		//We check hoe long is each phrase
		if (firstPhrase.length() > secondPhrase.length()) {
			System.out.println("La primera frase es la más larga");
		} else {
			System.out.println("La segunda frase es la más larga");
		}
		
		//Close Scanner
		sc.close();
	}

}
