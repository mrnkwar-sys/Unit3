package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Random 
		Random rand = new Random();
		
		//Create a List
		ArrayList <Integer> randomList = new ArrayList<>();
		
		//The numbers contained in the list
		int num;
		
		//We want to fill the list with random numbers from 1 to 10 (included)
		for (int i = 0; i < 30; i++) {
			num = rand.nextInt(1, 11);
			randomList.add(num);
		}
		
		Collections.sort(randomList);
		
		System.out.println(randomList);
	}

}
