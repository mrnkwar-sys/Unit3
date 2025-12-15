package funciones;

public class Ejercicio02 {

	public static void main(String[] args) {
		// The table from which we want to get the largest number
		int t[] = {1, 4, -3, 10, 22, 5, -5};
		
		//The largest number from the "t" table
		int max = maxNum(t);
		
		//The console shows the result
		System.out.println("El número más grande de la tabla es " + max);

	}
	
	//This function looks for the largest number of the table "t"
	public static int maxNum(int t[]) {
		if (t == null || t.length == 0) {
			throw new IllegalArgumentException("La tabla no puede ser nula");
		}
		
		//The first number of the table with which we are going to work first
		int max = t[0];
		
		//Compare all the values of the table to see which one is the largest
		for (int i = 1; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}
		
		return max;
		
	}

}
