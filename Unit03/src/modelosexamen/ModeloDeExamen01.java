package modelosexamen;

import java.util.Arrays;
import java.util.Scanner;

public class ModeloDeExamen01 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The text introduced by the user and where is supposed to be a hidden message
		String text;
		
		//The hidden message the user is looking for
		String hiddenMessage;
		
		//The user introduces the text and the hidden message
		System.out.println("Introduzca el texto donde cree que se encuentra el mensaje oculto");
		text = sc.nextLine();
		
		System.out.println("Introduzca el mensaje oculto que busca: ");
		hiddenMessage = sc.nextLine();
		
		System.out.println("El mensaje aparece en las siguientes posiciones del texto: " + Arrays.toString(searchedMessage(textTable(normalizedText(text)), hiddenMessageTable(normalizedHiddenMessage(hiddenMessage)))));
		
		System.out.println("De todos los caracteres usados en el mensaje, un " + usedPercentage(textTable(normalizedText(text)), hiddenMessageTable(normalizedHiddenMessage(hiddenMessage))));
		
		//Close Scanner
		sc.close();
	}
	
	public static String normalizedText(String text) {
		/*
		 * In case the introduced text has any capital letters, we turn all of them into small letters
		 * On the other hand, we remove all the blank spaces from both phrases
		 */
		text = text.toLowerCase().trim().replace(" ", "");
		
		return text;
	}
	
	public static String normalizedHiddenMessage(String hiddenMessage) {
		//We remove the blank spaces and turn all the letters into small letters, just as in the function normalizedText
		hiddenMessage = hiddenMessage.toLowerCase().trim().replace(" ", "");
		
		return hiddenMessage;
	}
	
	public static char[] textTable(String text){
		//The table where we are going to keep the clean text
		char textTable[] = text.toCharArray();
		
		return textTable;
	}
	
	public static char[] hiddenMessageTable(String hiddenMessage) {
		//The table where we are going to keep the clean hidden message
		char hiddenMessageTable[] = hiddenMessage.toCharArray();
		
		return hiddenMessageTable;
	}
	
	public static String[] searchedMessage(char[] textTable, char[] hiddenMessageTable) {
		/*
		 * The table that contains the initials positions of the hidden message within the text
		 * We will first make it a String to turn it into a table later
		 */
		String initialPositions = "";
		String initialPositionTable[];
		
		//The position in the hiddenMessageTable that will tell which letter are we looking for in the text
		int position = 0;
		
		//The last position kept 
		int lastInitialPosition = 0;
		
		for (int i = 0; i < textTable.length; i++) {
			if (textTable[i] == hiddenMessageTable[position]) {
				if (position == 0) {
					initialPositions += " " + i;
					lastInitialPosition = i;
				}
				position++;
			}
			if (position == hiddenMessageTable.length - 1) {
				position = 0;
				
			}
			
			/*
			 * A lo mejor si, al salir del for position!=0, eso significa que ha vuelto a empezar a buscar, pero no ha terminado
			 * Quizas tenga que poner una condicion para que si, pasa eso, reemplace el ultimo valor añadido a la String por una cadena vacia
			 */
			if (position != 0 && i == textTable.length - 1) {
				initialPositions = initialPositions.replace(String.valueOf(lastInitialPosition), "");
			}
		}
		
		//Turn the String into a table
		initialPositionTable = initialPositions.split(" ");
		
		return initialPositionTable;
	}
	
	public static double usedPercentage(char[] textTable, char[] hiddenMessageTable) {
		//The position in the hiddenMessageTable that will tell which letter are we looking for in the text
		int position = 0;
		
		//The quantity of letters that appear in the text that are also contained in the hidden message
		int quantity = 0;
		
		//The percentage that represents, from the total of the characters from the text, how many of them are used in the hidden message
		double percentage;
		
		for (int i = 0; i < textTable.length; i++) {
			if (textTable[i] == hiddenMessageTable[position]) {
				position++;
				quantity++;
			}
			if (position == hiddenMessageTable.length - 1) {
				position = 0;
				
			}
		}
		
		//We calculate the percentage of use
		percentage = (double) quantity/textTable.length*100;
		
		return percentage;
	}

}
