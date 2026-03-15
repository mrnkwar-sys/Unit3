package modelosexamen;

import java.util.Scanner;

public class ModeloDeExamen02 {

	public static void main(String[] args) {
		//The table that contains all the messages recorded
		String recordedMessages[] = {
				"LA NIEBLA CUBRE EL PUENTE",
				"NO MIRES DETRÁS DE LA PUERTA",
				"EL RELOJ SUENA A MEDIANOCHE",
				"LAS SOMBRAS SABEN TU NOMBRE",
				"TODO MENSAJE DEJA UNA HUELLA",
				"EL ECO REPITE LA VERDAD",
				"ALGUIEN ESCONDE ALGO AQUÍ",
				"NUNCA APAGUES LA RADIO"
		};
		
		chooseAction(recordedMessages);

	}
	
	//This function will show all the messages in the console
	public static void showRecordedMessages(String recordedMessages[]) {
		for (int i = 0; i < recordedMessages.length; i++) {
			System.out.println(i + ". " + recordedMessages[i]);
		}
	}
	
	//This function tells if the index introduced in it is valid or not for the table recordedMessages
	public static boolean isValidIndex(String recordedMessages[], int index) {
		//The boolean that will indicate if the index introduced exists in the table
		boolean thisIndexExists;
		
		//If the index introduces exists in the table, thisIndexExists will be true
		if (index >= recordedMessages.length || index < 0) {
			thisIndexExists = false;
		} else {
			thisIndexExists = true;
		}
		
		return thisIndexExists;
	}
	
	//This function gives the number of times an specific letter has appeared in the message
	public static int countLetter(String message, char letter) {
		//The number of times that the letter introduced equals the searched letter
		int numberOfTimes = 0;
		
		//Remove all the blank spaces from the message and turn all the letters into small letters
		message = message.toLowerCase();
		
		//If the letter from the lettersFromMessage equals the searched letter, we increase the quantity
		for (int i = 0; i < message.length(); i++) {
			if (letter == message.charAt(i)) {
				numberOfTimes++;
			}
		}
		
		return numberOfTimes;
		
	}
	
	//Remove the spaces from the message introduced
	public static String removeSpaces(String message) {
		message = message.replace(" ", "");
		
		return message;
	}
	
	//This function gives a new String that contains the letters contained in the pair indexes of the message introduced
	public static String extractHiddenMessage(String message) {
		//The String that will contain the letters from the pair indexes of the message
		String pairLetters = "";
		
		//Look for the pair indexes and include their content in the pairLetters String
		for (int i = 0; i < removeSpaces(message).length(); i++) {
			if (i%2 == 0) {
				pairLetters += removeSpaces(message).charAt(i) + " ";
			}
		}
		
		return pairLetters;
	}
	
	//This function returns the numbers of messages from the table recordedMessages that contain the introduced word
	public static int searchMessagesWithWord(String recordedMessages[], String word) {
		//As the messages are all in capital letters, turn the word introduced into capital letters
		word = word.toUpperCase();
		
		//The number of messages that contain the searched word
		int messagesWithWord = 0;
		
		//The message from the table recordedMessage turned into a String
		String singleMessage;
		
		//If the message contains the word introduced, we increase the messagesWithWord
		for (int i = 0; i < recordedMessages.length; i++) {
			singleMessage = recordedMessages[i];
			if (singleMessage.contains(" " + word + " ") || singleMessage.contains(" " + word) || singleMessage.contains(word + " ")) {
				messagesWithWord++;
			}
		}
		
		return messagesWithWord;
	}
	
	//This function return if it was possible to alter the message or not
	public static boolean markAltered(String recordedMessages[], int index) {
		//The boolean that will tell if the index is valid and, therefore, the message could be altered
		boolean validAlteration;
		
		//Check if the index introduced is valid or not
		if (isValidIndex(recordedMessages, index)) {
			if (recordedMessages[index].startsWith("[ALTERADO]") == true) {
				validAlteration = false;
			} else {
				recordedMessages[index].startsWith("[ALTERADO]");
				validAlteration = true;
			}
		} else {
			validAlteration = false;
		}
		
		return validAlteration;
	}
	
	//This function returns the longest word from the message introduced
	public static String longestWord(String message) {
		//The String that contains the longest word
		String longestWord;
		
		//Remove the blank spaces from the beginning and the end of the message
		message = message.trim();
		
		//The table that contains the message split into its words
		String messageSplit[] = message.split(" ");
		
		longestWord = messageSplit[0];
		
		//Look for the longest word in the message introduced
		for (int i = 0; i < messageSplit.length; i++){
			if (i > 0 && longestWord.length() < messageSplit[i].length()) {
				longestWord = messageSplit[i];
			}
		}
		
		return longestWord;
	}
	
	public static void showStatistics(String[] recordedMessages) {
		//The quantity of messages in the table introduced
		int totalMessages = recordedMessages.length;
		
		//The quantity of messages marked with the word "[ALTERADO]"
		int alteredMessages = 0;
		
		//The longest message
		String longestMessage = recordedMessages[0].replace(" ", "");
		
		//The index of the longest message
		int indexLongestMessage = 0;
		
		//The number of times the letter 'a' appears in all the messages from the table
		int numberOfAs = 0;
		
		//The String where we are going to keep all the letters from all the messages
		String allTheLetters = "";
		
		//If the message contains the word "[ALTERADO]", the alteredMessages increases
		for (int i = 0; i < recordedMessages.length; i++) {
			if (recordedMessages[i].contains("[ALTERADO]")) {
				alteredMessages++;
			}
			
			//Remove the blank spaces from the message
			recordedMessages[i] = recordedMessages[i].replace(" ", "");
			
			//Once that is done, keep the length of the message and compare it to next one
			if (i > 0 && longestMessage.length() < recordedMessages[i].length()) {
				longestMessage = recordedMessages[i];
				indexLongestMessage = i;
			}
			
			//Keep all the letters from each message in a String
			allTheLetters += recordedMessages[i];
		}
		
		//We look for the letter A in the String allTheLetters
		for (int j = 0; j < allTheLetters.length(); j++) {
			if (allTheLetters.charAt(j) == 'A') {
				numberOfAs++;
			}
		}
		
		//We print all the statistics
		System.out.println("Total de mensajes: " + totalMessages);
		System.out.println("Mensajes marcados como alterados: " + alteredMessages);
		System.out.println("Mensaje de mayor longitud: " + indexLongestMessage);
		System.out.println("El número total de veces que aparece la letra 'A': " + numberOfAs);
		
	}
	
	public static void chooseAction(String recordedMessages[]) {
		Scanner sc = new Scanner(System.in);
		
		//The message that the user has chosen
		int index;
		
		//The letter that the user is looking for
		char letter;
		
		//The word introduced by the user
		String word;
		
		//The option chose by the user
		int option;
		
		//If the message is altered or not
		String altered;
		
		do {
			//The user has to introduce an option from the next menu
			System.out.println();
			System.out.println("ARCHIVO DE LOS ECOS");
			System.out.println();
			System.out.println("1. Mostrar mensajes");
			System.out.println("2. Contar letra en un mensaje");
			System.out.println("3. Extraer mensaje oculto");
			System.out.println("4. Buscar palabra en todos los mensajes");
			System.out.println("5. Marcar mensaje como alterado");
			System.out.println("6. Mostrar palabra más larga de un mensaje");
			System.out.println("7. Mostrar estadísticas generales");
			System.out.println("8. Salir");
			
			System.out.println();
		
			System.out.println("Antes de elegir una opcion del menu, indique el número del mensaje con el que le gustaría tratar");
			index = sc.nextInt();
		
			if (isValidIndex(recordedMessages, index) == false) {
				System.out.println("El índice introducido no es válido");
			}
		
			System.out.println("Ahora indique la letra que le gustaria buscar, en caso de que asi fuera");
			letter = sc.next().charAt(0);
		
			System.out.println("Por ultimo, indique la palabra qeu querria buscar, si asi lo quisiera: ");
			word = sc.next();
		
		
			System.out.println("Elija una de las opciones del menú: ");
			option = sc.nextInt();
			
			if(markAltered(recordedMessages, index)) {
				altered = "El mensaje ya ha sido alterado";
			} else {
				altered = "No se puede alterar el mensaje";
			}
		
			switch(option) {
			case 1 -> showRecordedMessages(recordedMessages);
			case 2 -> System.out.println("La letra " + letter + " aparece " + countLetter(recordedMessages[index], letter) + " veces");
			case 3 -> System.out.println("El mensaje oculto es " + extractHiddenMessage(recordedMessages[index]));
			case 4 -> System.out.println("De todos los mensajes, " + searchMessagesWithWord(recordedMessages, word) + " contienen esa palabra");
			case 5 -> System.out.println(altered); 
			case 6 -> System.out.println("La palabra más larga del mensaje es " + longestWord(recordedMessages[index]));
			case 7 -> showStatistics(recordedMessages);
			case 8 -> System.out.println("Gracias por utilizar el programa :)");
			default -> System.out.println("Elija una de las opciones del menu, por favor");
			}
			
		} while(option != 8);
		
		//Close Scanner
		sc.close();
		
		
	}
}
