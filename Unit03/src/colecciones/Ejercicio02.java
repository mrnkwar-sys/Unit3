package colecciones;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Create a List
		ArrayList <Integer> randomNum = new ArrayList<>();
		
		//Create a Random
		Random rand = new Random();
		
		//The size of the list
		int size;
		
		//The numbers added to the list of random numbers
		int num;
		
		//The sum of all the numbers from the list
		int sum = 0;
		
		//The average of all the numbers from the list
		int average;
		
		//The largest number from the list
		int big = Integer.MIN_VALUE;
		
		//The smallest number of the list
		int small = Integer.MAX_VALUE;
		
		//The size of the list with the random numbers will be random
		size = rand.nextInt(5, 11);
		
		//We fill the list with random numbers
		for (int i = 0; i < size; i++) {
			num = rand.nextInt(0, 101);
			randomNum.add(num);
			
			//We need the sum of all the numbers that will be part of the list
			sum += randomNum.get(i);
			
			//We want to know the biggest and the smallest number from the list
			if(num > big) {
				big = num;
			}
			
			if (num < small) {
				small = num;
			}
		}
		
		//We also want to know the average of all the numbers from the list
		average = sum/size;
		
		//We show the results in the console
		System.out.println(randomNum);
		System.out.println(sum);
		System.out.println(average);
		System.out.println(big);
		System.out.println(small);
	}

}
