package arraysbidimensionales;

public class Ejercicio04 {

	public static void main(String[] args) {
		//The table where the multiplication tables will be shown
		int mult[][] = new int[10][10];
		
		//The table will shown the multiplication tables (each one in a different row)
		for (int i=0; i < mult.length; i++) {
			for (int j=0; j < mult.length; j++) {
				mult[i][j] = (++i)*(++j);
				i--;
				j--;
			}
		}
		
		//The table will appear in the console
		for(int k = 0; k < mult.length; k++) {
			for(int l = 0; l < mult.length; l++) {
				System.out.print(mult[k][l] + "\t");
			}
			System.out.println();
		}

	}

}
