package ejercicioscleancode;

import java.util.Scanner;

public class CajaBuena {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final double IVA = 0.21;
		final double DESCUENTO_MAS_DE_100 = 0.10;
		final double DESCUENTO_POR_SOCIO = 0.05;
		final double UMBRAL_DESCUENTO = 100.0;

		// The capacity of the store's stock
		final int TAM_STOCK = 200;

		// The stock that the store has at the beginning of the day
		final int STOCK_INICIAL = 10;

		// The table that will contain all the store's stock
		int[] stock = new int[TAM_STOCK];

		// If the store will continue buying stock
		boolean seguirComprando = true;
		
		//The number of products bought by the store
		int numeroProductos = leerEnteroEnRango(scanner, "¿Cuántos productos vas a introducir?", 1, 50);
		
		//The price of all the products bought at the moment, prior to the total price
		double subtotal = 0.0;

		// The initial stock will change until the store's stock reaches its limit
		for (int i = 0; i < stock.length; i++) {
			stock[i] = STOCK_INICIAL;
		}

		/* As the store keeps buying products, the store will have to give informations
		 * about the products that it wants
		 */
		while (seguirComprando) {
			//The table that will contain the names of the products bought
			String[] nombresProducto = new String[numeroProductos];
			
			//The table that will contain the prices of the products bought
			double[] preciosProducto = new double[numeroProductos];
			
			//The table that will contain the quantity of products bought
			int[] unidadesProducto = new int[numeroProductos];

			//
			for (int i = 0; i < numeroProductos; i++) {
				//The store has to introduce the name of the product and its quantity
				System.out.println("Nombre del producto " + (i + 1) + ":");
				nombresProducto[i] = scanner.nextLine().trim();

				preciosProducto[i] = leerDoubleMin(scanner, "Precio del producto " + (i + 1) + ":", 0.0);
				unidadesProducto[i] = leerEnteroEnRango(scanner, "Unidades del producto " + (i + 1) + ":", 1, 100);

				subtotal += preciosProducto[i] * unidadesProducto[i];

				int indexStock = obtenerIndexStock(nombresProducto[i], i, TAM_STOCK);
				stock[indexStock] -= unidadesProducto[i];
				if (stock[indexStock] < 0)
					System.out.println("Aviso: stock negativo (simulación).");
			}

			boolean esSocio = leerSiNo(scanner, "¿Es socio?");

			double[] totales = calcularTotales(subtotal, esSocio, UMBRAL_DESCUENTO, DESCUENTO_MAS_DE_100,
					DESCUENTO_POR_SOCIO, IVA);

			double descuento1 = totales[0];
			double descuento2 = totales[1];
			double baseImponible = totales[2];
			double importeIva = totales[3];
			double total = totales[4];

			imprimirTicket(nombresProducto, preciosProducto, unidadesProducto, subtotal, descuento1, descuento2,
					baseImponible, importeIva, total);

			seguirComprando = leerSiNo(scanner, "¿Quieres registrar otra compra?");
		}
	}

	private static int leerEnteroEnRango(Scanner scanner, String mensaje, int min, int max) {
		int valor;
		
		//The program waits for the store to tell how much of a specific product they want to buy
		do {
			//The quantity of a specific product that has to be bought
			System.out.println(mensaje);
			
			//The store will tell how much of the product in question they want
			valor = scanner.nextInt();
			
			/*If the product is less than 1 and larger than 50,
			 *  the program will remind the store that it has to be a value between 1 and 50
			 */
			if (valor < min || valor > max)
				System.out.println("Valor inválido. Debe estar entre " + min + " y " + max + ".");
		} while (valor < min || valor > max);
		scanner.nextLine();
		return valor;
	}

	private static double leerDoubleMin(Scanner scanner, String mensaje, double min) {
		double valor;
		do {
			System.out.println(mensaje);
			valor = scanner.nextDouble();
			if (valor < min)
				System.out.println("Valor inválido. Debe ser >= " + min + ".");
		} while (valor < min);
		scanner.nextLine();
		return valor;
	}

	private static boolean leerSiNo(Scanner scanner, String mensaje) {
		String respuesta;
		do {
			System.out.println(mensaje + " (S/N)");
			respuesta = scanner.nextLine().trim();
			if (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")) {
				System.out.println("Respuesta inválida. Escribe S o N.");
			}
		} while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
		return respuesta.equalsIgnoreCase("S");
	}

	private static int obtenerIndexStock(String nombreProducto, int posicion, int tamStock) {
		return (nombreProducto.length() * 17 + posicion * 3) % tamStock;
	}

	private static double[] calcularTotales(double subtotal, boolean esSocio, double umbral, double descSubtotal,
			double descSocio, double iva) {
		double descuento1 = subtotal > umbral ? subtotal * descSubtotal : 0.0;
		double subtotalConDescuento = subtotal - descuento1;
		double descuento2 = esSocio ? subtotalConDescuento * descSocio : 0.0;

		double baseImponible = subtotalConDescuento - descuento2;
		double importeIva = baseImponible * iva;
		double total = baseImponible + importeIva;

		return new double[] { descuento1, descuento2, baseImponible, importeIva, total };
	}

	private static void imprimirTicket(String[] nombres, double[] precios, int[] unidades, double subtotal,
			double descuento1, double descuento2, double baseImponible, double iva, double total) {
		System.out.println("=========== TICKET ===========");
		for (int i = 0; i < nombres.length; i++) {
			double linea = precios[i] * unidades[i];
			System.out.println((i + 1) + ") " + nombres[i] + "  " + unidades[i] + " x " + precios[i] + " = " + linea);
		}
		System.out.println("------------------------------");
		System.out.println("SUBTOTAL: " + subtotal);
		System.out.println("DESC > 100: " + descuento1);
		System.out.println("DESC SOCIO: " + descuento2);
		System.out.println("BASE: " + baseImponible);
		System.out.println("IVA: " + iva);
		System.out.println("TOTAL: " + total);
		System.out.println("==============================");
	}
}
