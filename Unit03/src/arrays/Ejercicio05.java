package arrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The sum of all the numbers
		int sum;
		
		//The number to make the comparison
		int compNum;
		
		//The smallest number
		int small;
		
		//The largest number
		int big;
		
		//The table where the numbers will be kept
		int table[] = new int [10];
		
		//The console waits for the user to introduce 10 numbers, which will be kept in the table
		for (int i = 0; i < table.length; i++) {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			table[i] = i;
			sum += num;
			
			}
		}
		
		//We sum all the numbers of the table just made
		

	}

}
