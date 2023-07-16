package Ejercicio10;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
	
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
						"empleo", "comer", "dormir", "caliente", 
						"peligro", "cuenta", "direccion", "argumento",
						"cafe", "disponible", "banco", "cama"
						};
				String[] cincoPalabras = new String[5];	
				String[] palabrasTraducidas = new String[5];
				
				int contadorCorrectas = 0;
				int contadorIncorrectas = 0;
				
				//Escogemos aleatoriamente 5 palabras del arreglo total y lo ponemos en uno pequeño
				//TODO: Pendiente ver como hacer que los numeros aleatorios NO se repitan
				for(int i = 0; i < cincoPalabras.length; i++) {
					int indiceDiccionario = (int)(Math.random()*19+1);
					cincoPalabras[i] = palabrasDisponibles[indiceDiccionario];
				}//for para seleccionar 5 palabras random del arreglo

				
				System.out.println("Traduce al ingles las siguiente palabras:");
				for(int i = 0; i < cincoPalabras.length; i++) {
					System.out.println(cincoPalabras[i] + " ");
				}//for para mostrar esas 5 palabras
				System.out.println(" ");
				
				//Solicitud de info al usuario en forma de ciclo
				System.out.println("Ingresa a partir de aqui la traducciones y presiona enter");
				for(int i = 0; i < palabrasTraducidas.length; i++) {
					palabrasTraducidas[i] = scanner.next();
				}

				
				//Evaluación de palabras
				for(int i = 0; i < palabrasTraducidas.length; i++) {
					//Palabra del diccionario
					String palabraEspaniol = cincoPalabras[i];
					
					//Traduccion del diccionario
					String palabraTraducida = diccionario.get(palabraEspaniol);
					
					//Palabra de las 5 a evaluar
					String palabraEvaluada = palabrasTraducidas[i];
					
					//Para comparar realmente cadenas de textoy no si son o no la misma instancia, se usa el método equals() NO el COMPARDOR de ==
					if(palabraTraducida.equals(palabraEvaluada)) {
						System.out.println("Correcto, la traducción de: " + palabraEspaniol + " es: " + palabraTraducida);
						contadorCorrectas++;
					} else {
						System.out.println("Incorecto, la traducción de: " + palabraEspaniol + " no es: " + palabraEvaluada + " es: " + palabraTraducida);
						contadorIncorrectas++;
					}
				}//for para evaluación
				System.out.println(" ");
				System.out.println("Respuestas correctas: " + contadorCorrectas);
				System.out.println("Respuestas incorrectas: " + contadorIncorrectas);
				
				scanner.close();

	}

}
