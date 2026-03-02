package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//Create a list
		ArrayList <Integer> wholeList = new ArrayList<>();
		
		ArrayList <Integer> pairList = new ArrayList<>();
		
		//The numbers introduced by the user
		int num;
		
		//If the number introduced by the user is negative, the list will stop adding those values
		do {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			wholeList.add(num);
			
			//The only numbers that we will keep in the list are the pair numbers
			if (num%2 == 0) {
				pairList.add(wholeList.indexOf(num));
			}
		} while (num >= 0);
		
		//The list will be shown through the console
		System.out.println(pairList);
		
		//Close Scanner
		sc.close();
	}

}
