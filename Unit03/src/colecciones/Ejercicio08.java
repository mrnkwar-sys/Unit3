package colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {
	
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		//The HashMap
		HashMap <String, String> accessControl = new HashMap<>();
		
		//The profile/user introduced
		String userName;
		
		//The password introduced
		String password;
		
		//The option chose by the user
		int option;
		
		do {
			//The user has to choose one of the options below
			System.out.println();
			System.out.println("1. Registro");
			System.out.println("2. Login");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Elija una de las opciones anteriores: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 -> {
				System.out.println("Introduzca su nombre de usuario: ");
				userName = sc.next();
				
				System.out.println("Introduzca su contraseña: ");
				password = sc.next();
				
				registerUser(accessControl, userName, password);
			}
			
			case 2 -> {
				for (int i = 0; i < 3; i++) {
					System.out.println("Introduzca su nombre de usuario: ");
					userName = sc.next();
					
					System.out.println("Introduzca su contraseña: ");
					password = sc.next();
					
					if (loginUser(accessControl, userName, password)) {
						break;
					} else if (i == 2) {
						System.out.println("Lo siento, no tiene acceso al área restringida");
					}
				}
			}
			
			case 0 -> System.out.println("Gracias por utilizar el programa");
			}
		} while (option != 0);

	}
	
	public static void registerUser(HashMap <String, String> accessControl, String userName, String password) {
		accessControl.put(userName, password);
	}
	
	public static boolean loginUser(HashMap <String, String> accessControl, String userName, String password) {
	//The boolean that will indicate if the userName and password are correct
	boolean correctLogin = false;
		
		if (accessControl.containsKey(userName) && accessControl.get(userName).equals(password)) {
			System.out.println("Ha accedido al área restringida");
			correctLogin = true;
		} else {
			System.out.println("Inténtelo de nuevo");
		}
		
		return correctLogin;
	}

}
