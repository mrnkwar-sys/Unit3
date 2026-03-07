package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The password introduced by the first player
		String password;
		
		//The words that the second player introduces until they guess the password
		String triedWord;
		
		//The table that will contain the characters of the password
		char passwordTable[]; 
		
		//The array that will show how many characters have the second player guessed
		char triedTable[];
		
		//The first player have to introduce a password
		System.out.println("Primer jugador, introduzca la contraseña: ");
		password = sc.nextLine();
		
		//We will ask the user to keep trying to guess the password until they guess it
		do {
			System.out.println("Segundo jugador, intente adivinar la contraseña");
			triedWord = sc.nextLine();
			
			//Now we will treat the password and the triedWord as other tables to compare them
			passwordTable = password.toCharArray();
			triedTable = triedWord.toCharArray();
			
			//The guessed characters will last the same in the triedTable, but the wrong ones will turn into a '*'
			for (int j = 0; j < triedTable.length; j++) {
				if (passwordTable[j] != triedTable[j]) {
					triedTable[j] = '*';
				} else {
					triedTable[j] = passwordTable[j];
				}
			}
			
			//If both tables are the same, we will the second player that they finally won
			if(Arrays.equals(triedTable, passwordTable)) {
				System.out.println("Ha acertado, ¡¡FELICIDADES!!");
			} else {
				System.out.println(String.valueOf(triedTable));
			}
		} while (Arrays.equals(triedTable, passwordTable) == false);
		
//		do {
//			System.out.println("Segundo jugador, intente adivinar la contraseña");
//			triedWord = sc.nextLine();
//			
//			if(password.compareTo(triedWord) < 0) {
//				System.out.println("La palabra insertada es menor alfabéticamente que la contraseña");
//			} else if (password.compareTo(triedWord) == 0){
//				System.out.println("La palabra insertada es la contraseña. ¡¡FELICIDADES!!");
//			} else {
//				System.out.println("La palabra insertada es mayor alfabéticamente que la contraseña");
//			}
//		} while (password.compareTo(triedWord) != 0);
		
		//Close Scanner
		sc.close();

	}

}
