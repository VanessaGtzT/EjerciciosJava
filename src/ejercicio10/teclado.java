package ejercicio10;

import java.util.Scanner;



/**
 * Permite lectura desde teclado
 * 
 * @author Francisco Javier Frías Serrano
 * @author Rafale Miguel Cruz Álvarez
 * @version 1.0
 */
public class teclado {

	static Scanner entrada = new Scanner(System.in);

	
	public static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		return leerCadena();
	}

	
	public static String leerCadena() {
	  return entrada.nextLine().toLowerCase();

	}


}

