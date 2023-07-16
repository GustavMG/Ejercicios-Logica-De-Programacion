package Ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numerosUsuario = new int[10];
		int[] numerosOrdenados = new int[10];	
		
		//Solicitud de numero al usuario
		System.out.println("Ingresarás 10 numero de 1 en 1");
		
		for(int i = 0; i < numerosUsuario.length; i++)
        {
            System.out.printf("introduce el número: ", i + 1);
            numerosUsuario[i] = scanner.nextInt();
        }
		System.out.println(" ");
		
		//Impresión del array original
		System.out.println("El array original es el siguiente:");
		for(int i = 0; i < numerosUsuario.length; i++)
        {
            System.out.println("Posición[" + i + "] valor: " + numerosUsuario[i] + " ");
        }
		
		//Evaluación de num primos
		boolean primo = false;
		
		int x = 9;
		int y = 0;
		System.out.println("Evlación cilo primos:");
		//Iteramos en el arreglo
		for(int i = 0; i < numerosUsuario.length; i++)
        {
			//Suponemos que el numero a evaluar es primo
			primo = true;
			//Almacenamos el num actual en una variable, esto esta demas pero se ve mejoricito asi
			int numTemp = numerosUsuario[i];
			//Evaluamos que el numero sea mayor que 3 pq el 1 no es primp y el 2 es el UNICCO numero primo PAR
			if (numTemp < 2) {
			    primo = false;
			} else {
				//Creamos un divisor que se iniciará en 2 en cada iteración
				int divisor = 2;
				//Evaluamos que el numero a evaluar sea MENOR que el dividor
				//Ademas de que dividimos el num a la mitad para no tener que evaluar completamente
				//Si el numero es divisible entre 2(el inicio del divisir) se intuye que es par o sea NO es primo
				//Se coloca un boolean para podeer finalizar el cicl
			while((divisor <= (numTemp/2)) && primo) {
            	if (numTemp % divisor == 0 ) {
            		primo = false;
            	}
            	divisor++;
		}
			}
			//Asiganción de posiciones en el arreglo
			//No conseguí como moverlo en el mismo arregló :(
			//Se tuvo que hacer uno nuevo e ir anexando al principio los que cumplen con la condición
			//o sea que son primos y el indice es ina variable que SOLO cambiamos cuando se cumple esta condición
			if(primo) {
				numerosOrdenados[y] = numerosUsuario[i];
				y++;
				//Imprimimos nomas para verificar que efectivamente sea o no primo
				System.out.println("Es primo:" + numTemp);
			} else {
				//Lo mismo que arriba solo que lo hacemos a la inversa, colocamos desde el final pq ya sabemos la longitud
				//del arreglo desde un principio(10) y colocamos de a tras hacia adelante por eso
				//x inicia en el ultimo indice(9) del arreglo y va disminuyendo
				numerosOrdenados[x] = numTemp;
				x--;
				System.out.println("No es primo:" + numTemp);
			}
			
        }
		//TODO: Pendiente la inmplementación de ejecutar esto con n cantidad de numeros de entrada
		
		//Impresión del array ordenado
		System.out.println("El array ordenado es el siguiente:");
		for(int i = 0; i < numerosOrdenados.length; i++)
        {
            System.out.println("Posición[" + i + "] valor: " + numerosOrdenados[i] + " ");
        }
		
		
		scanner.close();

	}

}
