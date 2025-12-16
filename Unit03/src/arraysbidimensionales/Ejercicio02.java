package arraysbidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The table with the data from the all the students (4 students and 5 subjects)
		double marks[][] = new double [4][5];
		
		//The grades introduced by the user
		double grade;
		
		//The number of the student
		int num = 0;
		
		//The largest grade of the student
		double max = 0;
		
		//The smallest grade of the student
		double min = 0;
		
		//The console waits for the user to introduce all the grades for each student
		for (int i = 0; i < 4; i++) { //Examine the row
			for (int j = 0; j < 5; j++) {
				System.out.println("Introduzca la nota del Alumno " + (i+1) + ":");
				grade = sc.nextDouble();
				marks[i][j] = grade;
			}
		}
		
		System.out.println();
		
		//We examine the table to look for the largest mark, the smallest one and to calculate the average
		for (int k = 0; k < marks.length; k++) {
			max = marks[k][0];
			min = marks[k][0];
			System.out.print("Alumno " + (++num));
			for (int l = 0; l < marks[k].length; l++) {
				System.out.print("\t" + marks[k][l] + "\t");
			}
			System.out.println();
		}
		
		//Close Scanner
		sc.close();
	}

}
