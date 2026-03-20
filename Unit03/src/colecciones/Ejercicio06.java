package colecciones;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create the list 
		TreeSet <String> nameSet = new TreeSet<>();
		
		//The name introduced by the user
		String name;
		
		//As long as the user does not type “end,” names will continue to be added to the list
		do {
			//The user introduces the name
			System.out.println("Introduzca un nombre: ");
			name = sc.next();
			
			//The name is added to the list
			nameSet.add(name);
		} while (!(name.equalsIgnoreCase("fin")));
		
		//Remove the word 'fin' from the Set
		nameSet.remove("fin");
		
		//Show the list through the console
		System.out.println(nameSet);
		
		//Close Scanner
		sc.close();
	}

}
