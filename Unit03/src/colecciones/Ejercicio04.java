package colecciones;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Random
		Random rand = new Random();
		
		//Create a list
		Set <Integer> orderedList = new TreeSet<>();
		
		//The numbers that are contained in the list
		int num;
		
		//We create the list, whose numbers have to be ordered as they compose the list
		for (int i = 0; i < 20; i++) {
			num = rand.nextInt(1, 100);
			orderedList.add(num);
		}
		
		System.out.println(orderedList);
		
	}

}
