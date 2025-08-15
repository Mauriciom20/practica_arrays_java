package senanoche;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
	// Nivel Básico

	// Suma de Elementos: Se le proporciona un ArrayList de tipo Integer. El programa debe calcular la suma de todos los números presentes en la lista y mostrar el resultado total.
		ArrayList<Integer> listaDeElementos = new ArrayList<>();
		System.out.println("1.listaDeElemetos: " + listaDeElementos);
		
		listaDeElementos.add(1);
        listaDeElementos.add(2);
        listaDeElementos.add(3);
        listaDeElementos.add(4);
        listaDeElementos.add(5);
        listaDeElementos.add(6);
        
        System.out.println("1.listaDeElemetos: " + listaDeElementos);
        
		int sumaDeElementos = 0;
		
		for(int suma: listaDeElementos) {
			sumaDeElementos += suma;
		}
		
		System.out.println("1.sumaDeElemetos: " + sumaDeElementos);
		
	/* Búsqueda de un Elemento: Dado un ArrayList de String y un String específico, el programa debe determinar si el elemento buscado existe dentro de la lista. Deberá imprimir un mensaje indicando si fue encontrado o no.*/

		ArrayList<String> busquedaDeElementos = new ArrayList<>();
		
		busquedaDeElementos.add("mensaje 1");
		busquedaDeElementos.add("mensaje 2");
		busquedaDeElementos.add("mensaje 3");
		busquedaDeElementos.add("mensaje 4");
		busquedaDeElementos.add("mensaje 5");
		
		//determinar si el elemento buscado existe dentro de la lista
		// Forma 1 con get y equals
		String elementoBuscado = "mensaje 0";
		
        boolean encontrado = false;

		for (int i = 0; i < busquedaDeElementos.size(); i++) {
            if (busquedaDeElementos.get(i).equalsIgnoreCase(elementoBuscado)) {
                encontrado = true;
                break;
            } else {
            	encontrado = false;
            }
        }

		System.out.println("2.1 ¿El mensaje fue encontrado?: " + encontrado);
		
		// Forma 2 con contains
		boolean validacion = busquedaDeElementos.contains("mensaje 1");
		System.out.print("2.2 El mensaje fue encontrado: " + validacion);
		
		validacion = busquedaDeElementos.contains("mensaje 0");
		System.out.println("2.2 El mensaje fue encontrado: " + validacion);
		
	// Conteo de Ocurrencias: Se tiene un ArrayList de Character y un carácter objetivo. El programa debe contar cuántas veces aparece el carácter objetivo en la lista e imprimir dicho conteo.

		ArrayList<Character> conteoDeOcurrencias = new ArrayList<>();
		
		conteoDeOcurrencias.add('a');
		conteoDeOcurrencias.add('b');
		conteoDeOcurrencias.add('b');
		conteoDeOcurrencias.add('c');
		conteoDeOcurrencias.add('c');
		conteoDeOcurrencias.add('c');
		
		char caracterObjetivo = 'a';
		char caracterObjetivo1 = 'b';
		char caracterObjetivo2 = 'c';
		
		int contador = 0;
		for(char letra: conteoDeOcurrencias) {
			if (letra == caracterObjetivo) {
			contador++;
			}
		}
		
		System.out.println("El carácter " + caracterObjetivo + " aparece " + contador + " veces en la lista.");
		
		contador = 0;
		for(char letra: conteoDeOcurrencias) {
			if (letra == caracterObjetivo1) {
			contador++;
			}
		}
		
		System.out.println("El carácter " + caracterObjetivo1 + " aparece " + contador + " veces en la lista.");
		
		contador = 0;
		for(char letra: conteoDeOcurrencias) {
			if (letra == caracterObjetivo2) {
			contador++;
			}
		}

		System.out.println("El carácter " + caracterObjetivo2 + " aparece " + contador + " veces en la lista.");
		
	// Nivel Intermedio

	// Encontrar el Número Mayor: A partir de un ArrayList de Integer no vacío, 
	// el programa debe encontrar y mostrar el número más grande contenido en la lista sin utilizar métodos de ordenamiento.

	// Creación de una Sublista de Pares: Dado un ArrayList de Integer, el programa debe generar un nuevo ArrayList que contenga únicamente los números pares del ArrayList original. Al finalizar, debe imprimir la nueva lista de pares.

	// Concatenación de Cadenas: Se proporciona un ArrayList de String. El programa debe concatenar todas las cadenas de la lista en una sola, separadas por un espacio, y mostrar la cadena resultante.

	//Nivel Avanzado

	// Inversión de una Lista: Dado un ArrayList, el programa debe invertir el orden de sus elementos. Por ejemplo, si la lista original es [1, 2, 3, 4], la lista invertida debe ser [4, 3, 2, 1]. Esta operación debe realizarse modificando la lista original o creando una nueva.

	// Eliminación de Elementos Duplicados: Se tiene un ArrayList con elementos que pueden estar duplicados. El programa debe generar un nuevo ArrayList que contenga los elementos del original pero sin duplicados, conservando el orden de la primera aparición de cada elemento.

	// Reemplazo de Elementos: Dado un ArrayList de String, un elemento a buscar y un elemento de reemplazo, el programa debe sustituir todas las ocurrencias del elemento a buscar por el elemento de reemplazo.
	
	//Verificación de Palíndromo: Se le entrega un ArrayList de Character que representa una secuencia de letras. El programa debe determinar si la secuencia forma un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda), devolviendo un valor booleano o un mensaje que lo indique.

	}
}