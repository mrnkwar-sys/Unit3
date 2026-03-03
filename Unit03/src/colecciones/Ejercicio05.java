package colecciones;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a collection
		LinkedHashSet <String> nameMap = new LinkedHashSet<>();
		
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The names introduced by the user in the set
		String name = "";
		
		//The user has to fill the set with names until they write 'fin'
		do {
			System.out.println("Introduzca un nombre: ");
			name = sc.next();
			nameMap.add(name);
		} while (!(name.equals("fin")));
		
		nameMap.remove("fin");
		
		System.out.println(nameMap);
		
		//Close Scanner
		sc.close();

	}

}
