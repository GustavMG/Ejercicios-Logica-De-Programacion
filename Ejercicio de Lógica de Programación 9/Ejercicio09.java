package Ejercicio09;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//HashMap instanciado para agregar palabaras
		HashMap<String, String> diccionario = new HashMap<>();
		
		Scanner scanner = new Scanner(System.in);
		
		//Ingresmaos datos desde aqui, posible implementación futura para ingresar todo desde la consola
		diccionario.put("gato", "cat");
		diccionario.put("perro", "dog");
		diccionario.put("mesa", "table");
		diccionario.put("silla", "chair");
		diccionario.put("casa", "house");
		diccionario.put("hogar", "home");
		diccionario.put("ventana", "window");
		diccionario.put("dia", "day");
		diccionario.put("empleo", "job");
		diccionario.put("comer", "eat");
		diccionario.put("dormir", "sleep");
		diccionario.put("caliente", "hot");
		diccionario.put("peligro", "danger");
		diccionario.put("cuenta", "acount");
		diccionario.put("direccion", "address");
		diccionario.put("argumento", "argument");
		diccionario.put("cafe", "coffe");
		diccionario.put("disponible", "avaliable");
		diccionario.put("banco", "bank");
		diccionario.put("cama", "bed");
		
		String[] palabrasDisponibles = {
				"gato", "perro", "mesa", "silla", 
				"casa", "hogar", "ventana", "dia",
				"empleo", "comer", "dormir", "calient", 
				"peligro", "cuenta", "direccion", "argumento",
				"cafe", "disponible", "banco", "cama"
				};

		
		System.out.println("Lista de traducciones disponibles en el diccionario:");
		for(int i = 0; i < palabrasDisponibles.length; i++) {
			System.out.println(palabrasDisponibles[i] + " ");
		}
		System.out.println(" ");
		//Solicitud de info al usuario
		System.out.println("Ingresa tu palabra a traducir");
		String palabraIngresada = scanner.next();
		
		//Evaluación de palabra
		String palabraTraducida = diccionario.get(palabraIngresada);
		
		System.out.println(" ");
		if(palabraTraducida != null) {
			System.out.println("La traducción de tu palabra ingresada: " + palabraIngresada + " es: " + palabraTraducida);
		} else {
			System.out.println("Lo sentimos, la palabra: " + palabraIngresada + " no existe en el diccionario, estamos trabajando en ello...");
		}
		
		scanner.close();
	}

}
