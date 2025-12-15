package funciones;

public class Ejercicio01 {

	public static void main(String[] args) {
		//The table with all the numbers
		int table[] = {10, 1, 5};
		
		//The sum of all the numbers
		int total = sumTable (table);
		
		//The console shows the result of summing all the numbers from the table
		System.out.println("El resultado de sumar todos los números es " + total);

	}
	
	//This function sums all the values from the table "table"
	public static int sumTable(int[] table) {
		if (table == null) {
			throw new IllegalArgumentException("La tabla no puede ser nula");
		}
		
		//The sum of all the numbers from the table
		int total = 0;
		
		//One by one, we sum the numbers from the table
		for (int i = 0; i < table.length; i++) {
			total += table[i];
		}
		
		//The final result of the function
		return total;
	}

}
