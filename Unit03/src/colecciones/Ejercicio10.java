package colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
	
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Create the HashMap
		HashMap <String, Double> productsMap = new HashMap<>();
		HashMap <String, Integer> productsStock = new HashMap<>();
		
		//The product's name
		String productName;
		
		//The product's price
		double productPrice;
		
		//The stock available
		int stock;
		
		//The option chose by the user
		int option;
		
		do {
			//The user has to choose one of the options below
			System.out.println();
			System.out.println("PRODUCTOS");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("3. Listar existencias");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Elija una de las opciones del menú:");
			option = sc.nextInt();
			
			switch(option) {
			case 1 -> {
				System.out.println("Introduzca el nombre del producto: ");
				productName = sc.next();
				
				System.out.println("Introduzca el precio del producto: ");
				productPrice = sc.nextDouble();
				
				addProduct(productsMap, productName, productPrice);
				
				System.out.println(productsMap);
			}
			
			case 2 -> {
				System.out.println("Introduzca el nombre del producto: ");
				productName = sc.next();
				
				removeProduct(productsMap, productName);
				System.out.println(productsMap);
			}
			
			case 3 -> {
				System.out.println("Introduzca el nombre del producto: ");
				productName = sc.next();
				
				System.out.println("Introduzca el número de existencias disponibles: ");
				stock = sc.nextInt();
				
				listStock(productsMap, productsStock, productName, stock);
				System.out.println(productsStock);
			}
			
			case 0 -> System.out.println("Gracias por utilizar el programa");
			
			default -> System.out.println("La opción que ha elegido no existe");
			}

		} while (option != 0);
		
	}
	
	public static void addProduct(HashMap <String, Double> productsMap, String product, double price) {
		productsMap.put(product, price);
		
		System.out.println("El producto ha sido añadido sin problema alguno");
	}
	
	public static void removeProduct(HashMap <String, Double> productsMap, String product) {
		if (productsMap.containsKey(product)) {
			productsMap.remove(product);
			
			System.out.println("El producto se ha eliminado sin problema alguno");
		} else {
			System.out.println("El producto que busca eliminar no está registrado");
		}
	}
	
	public static void listStock(HashMap <String, Double> productsMap, HashMap <String, Integer> productsStock, String product, int stock) {
		if (productsMap.containsKey(product)) {
			if (productsStock.containsKey(product)) {
				productsStock.replace(product, stock);
			} else {
				productsStock.put(product, stock);
			}
		} else {
			System.out.println("Ese producto no está registrado");
		}
	}

}
