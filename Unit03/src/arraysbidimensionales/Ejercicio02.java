package arraysbidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		

	}
	
	//Shows the marks' table with the students inside rows and the marks inside columns
	private static void fillMark (Scanner sc, double[][] mark) {
		
		//The number of students
		final int STUDENT = 4;
				
		//The number of subjects
		final int SUBJECT = 5;
		
		//The table with all the marks
		double[][] marks = new double [STUDENT][SUBJECT];
		
		//The function to fill the table with the students' grades
		fillMark (sc, mark);
		
		for (int studentIndex = 0; studentIndex < STUDENT; studentIndex++) {
			System.out.println("Introduce las notas del alumno " + (studentIndex + 1));
			
			for (int subjectIndex = 0; subjectIndex < SUBJECT; subjectIndex++) {
				System.out.println("Asignatura " + (subjectIndex + 1) + ":");
				
			}
		}
	}

}
