package colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//Create the TreeMap Set
		TreeMap <String, String> miniDictionary = new TreeMap<>();
		
		//The option chose by the user
		int option;
		
		//The english word introduced by the user
		String englishWord;
		
		//The spanish traduction introduced 
		String spanishWord;
		
		//Fill the map with words
		createMap(miniDictionary);
		
		do {
			//The user will have to choose an option from the menu
			System.out.println();
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("3. Salir");
			System.out.println();
			System.out.println("Elija una de las opciones del menú: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 -> {
				System.out.println("Escriba la palabra en español: ");
				spanishWord = sc.next();
				
				System.out.println("Ahora escriba su traducción al inglés: ");
				englishWord = sc.next();
				
				addWord(miniDictionary, spanishWord, englishWord);
			}
			
			case 2 -> {
				System.out.println("¿Cuál es la palabra en español que está buscando?");
				spanishWord = sc.next();
				
				searchWord(miniDictionary, spanishWord);
			}
			
			case 3 -> System.out.println("Gracias por utilizar nuestro diccionario :)");
			
			default -> System.out.println("Esa opción no es elegible");
			}
		} while (option != 3);
		
		//Close Scanner
		sc.close();
		

	}
	
	public static void createMap(TreeMap <String, String> miniDictionary) {
		miniDictionary.put("Desertar", "To desert");
		miniDictionary.put("Lavadora", "Washer");
		miniDictionary.put("Patrullero", "Patrol");
		miniDictionary.put("Volcar", "To knock over");
		miniDictionary.put("Masa", "Dough");
		miniDictionary.put("Espuma", "Foam");
		miniDictionary.put("Tragaluz", "Skylight");
		miniDictionary.put("Secundaria", "Secondary education");
		miniDictionary.put("Mediano", "Medium-sized");
		miniDictionary.put("Registrar", "To register");
		miniDictionary.put("Migaja", "Crumb");
		miniDictionary.put("Envolver", "To wrap (up)");
		miniDictionary.put("Flauta", "Flute");
		miniDictionary.put("Gota", "Drop");
		miniDictionary.put("Abuelo", "Grandfather");
		miniDictionary.put("Gacela", "Gazelle");
		miniDictionary.put("Acusado", "Person accused");
		miniDictionary.put("Desafiar", "To challenge");
		miniDictionary.put("Oxidado", "Rusty");
		miniDictionary.put("Peso", "Weight");
	}
	
	public static void addWord(TreeMap <String, String> miniDictionary, String spanishWord, String englishWord) {
		miniDictionary.put(spanishWord, englishWord);
		
		System.out.println("La palabra ha sido añadida con éxito");
	}
	
	public static void searchWord(TreeMap <String, String> miniDictionary, String spanishWord) {
		if (miniDictionary.containsKey(spanishWord)) {
			System.out.println("Su traducción al inglés es " + miniDictionary.get(spanishWord));
		} else {
			System.out.println("La palabra no se encuentra en el diccionario");
		}
	}

}
