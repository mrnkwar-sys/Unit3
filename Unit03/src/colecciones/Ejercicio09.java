package colecciones;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// The tree map that will contain the numbers
		TreeMap <Integer, Integer> numbers = new TreeMap<>();
		TreeMap <Integer, Integer> stars = new TreeMap<>();
		
		//The number introduced
		int number;
		
		//The stars introduced
		int star;
		
		//The user introduces the number
		System.out.println("Introduzca los 5 números del sorteo: ");
		for (int i = 0; i < 5; i++) {
			number = sc.nextInt();
			updateFrequency(numbers, number);
		}
		
		//The user has to introduce the stars
		System.out.println("Introduzca las 2 estrellas: ");
		for (int i = 0; i < 2; i++) {
			star = sc.nextInt();
			updateFrequency(stars, star);
		}
		
		//Show results
		System.out.println("Frecuencia de lo números: " + numbers);
		System.out.println("Frecuencia de las estrellas: " + stars);
		
		//Close Scanner
		sc.close();

	}
	
	public static void updateFrequency(TreeMap <Integer, Integer> map, int key) {
	//The variable that tells the frequency of a star or a number
	int frequency;
	
		if (map.containsKey(key)) {
			frequency = map.get(key);
			map.put(key, frequency+1);
		} else {
			map.put(key, 1);
		}
	}

}
