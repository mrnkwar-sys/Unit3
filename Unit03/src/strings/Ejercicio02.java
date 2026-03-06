package strings;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The password introduced by the first player
		String password;
		
		//The words that the second player introduces until they guess the password
		String triedWord;
		
		//
		
		//The first player have to introduce a password
		System.out.println("Primer jugador, introduzca la contraseña: ");
		password = sc.nextLine();
		
		do {
			System.out.println("Segundo jugador, intente adivinar la contraseña");
			triedWord = sc.nextLine();
			
			
			
		} while (triedWord.compareTo(String password));

	}

}
