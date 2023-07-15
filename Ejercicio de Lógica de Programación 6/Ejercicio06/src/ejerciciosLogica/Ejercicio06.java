package ejerciciosLogica;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		System.out.println("Ingresa una palabra o una frase");
		Scanner scanner = new Scanner(System.in);
//		
		String palabra = String.valueOf(scanner.next());
		char[] caracteres = palabra.toCharArray();
		String[] palabraInvertida = {};
		
		System.out.println(palabra);
				
		for (int i = 0; i < palabra.length(); i++) {
		    palabraInvertida[i] = " ";
//			System.out.print(palabraInvertida[i]);
		}
		System.out.println( );
		
		
		for(int i =  caracteres.length; i > 0; i--) {
			palabraInvertida[caracteres.length - i] = caracteres.toString().charAt(i); 
		}
		System.out.println(palabra);
		
		scanner.close();
		
		
	}

}
