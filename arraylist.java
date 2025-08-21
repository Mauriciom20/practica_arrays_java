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
		
		System.out.println("3. El carácter " + caracterObjetivo + " aparece " + contador + " veces en la lista.");
		
		contador = 0;
		for(char letra: conteoDeOcurrencias) {
			if (letra == caracterObjetivo1) {
			contador++;
			}
		}
		
		System.out.println("3. El carácter " + caracterObjetivo1 + " aparece " + contador + " veces en la lista.");
		
		contador = 0;
		for(char letra: conteoDeOcurrencias) {
			if (letra == caracterObjetivo2) {
			contador++;
			}
		}

		System.out.println("3. El carácter " + caracterObjetivo2 + " aparece " + contador + " veces en la lista.");
		
	// Nivel Intermedio

	// Encontrar el Número Mayor: A partir de un ArrayList de Integer no vacío, 
	// el programa debe encontrar y mostrar el número más grande contenido en la lista sin utilizar métodos de ordenamiento.
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		
		listaNumeros.add(12);
		listaNumeros.add(45);
		listaNumeros.add(7);
		listaNumeros.add(89);
		listaNumeros.add(23);
		
		int mayor = listaNumeros.get(0);
		for (int num : listaNumeros) {
		    if (num > mayor) {
		        mayor = num;
		    }
		}
		
		System.out.println("4. El número mayor es: " + mayor);
		
	// Creación de una Sublista de Pares: Dado un ArrayList de Integer, el programa debe generar un nuevo ArrayList que contenga únicamente los números pares del ArrayList original. Al finalizar, debe imprimir la nueva lista de pares.
		ArrayList<Integer> listaOriginal = new ArrayList<>();
		
		listaOriginal.add(10);
		listaOriginal.add(15);
		listaOriginal.add(22);
		listaOriginal.add(33);
		listaOriginal.add(40);
		
		ArrayList<Integer> listaPares = new ArrayList<>();
		for (int num : listaOriginal) {
		    if (num % 2 == 0) {
		        listaPares.add(num);
		    }
		}
		
		System.out.println("5. Sublista de pares: " + listaPares);
		
	// Concatenación de Cadenas: Se proporciona un ArrayList de String. El programa debe concatenar todas las cadenas de la lista en una sola, separadas por un espacio, y mostrar la cadena resultante.
		ArrayList<String> listaStrings = new ArrayList<>();
		
		listaStrings.add("Hola");
		listaStrings.add("mundo");
		listaStrings.add("desde");
		listaStrings.add("Java");
		
		String resultado = "";
		for (String palabra : listaStrings) {
		    resultado += palabra + " ";
		}
		
		System.out.println("6. Concatenación de cadenas: " + resultado.trim());
		
	//Nivel Avanzado

	// Inversión de una Lista: Dado un ArrayList, el programa debe invertir el orden de sus elementos. Por ejemplo, si la lista original es [1, 2, 3, 4], la lista invertida debe ser [4, 3, 2, 1]. Esta operación debe realizarse modificando la lista original o creando una nueva.
		ArrayList<Integer> listaInvertir = new ArrayList<>();
		
		listaInvertir.add(1);
		listaInvertir.add(2);
		listaInvertir.add(3);
		listaInvertir.add(4);
		
		ArrayList<Integer> listaInvertida = new ArrayList<>();
		for (int i = listaInvertir.size() - 1; i >= 0; i--) {
		    listaInvertida.add(listaInvertir.get(i));
		}
		
		System.out.println("7. Lista invertida: " + listaInvertida);
		
	// Eliminación de Elementos Duplicados: Se tiene un ArrayList con elementos que pueden estar duplicados. El programa debe generar un nuevo ArrayList que contenga los elementos del original pero sin duplicados, conservando el orden de la primera aparición de cada elemento.
		ArrayList<String> listaDuplicados = new ArrayList<>();
		
		listaDuplicados.add("A");
		listaDuplicados.add("B");
		listaDuplicados.add("A");
		listaDuplicados.add("C");
		listaDuplicados.add("B");
		
		ArrayList<String> listaSinDuplicados = new ArrayList<>();
		for (String elemento : listaDuplicados) {
		    if (!listaSinDuplicados.contains(elemento)) {
		        listaSinDuplicados.add(elemento);
		    }
		}
		
		System.out.println("8. Lista sin duplicados: " + listaSinDuplicados);
		
	// Reemplazo de Elementos: Dado un ArrayList de String, un elemento a buscar y un elemento de reemplazo, el programa debe sustituir todas las ocurrencias del elemento a buscar por el elemento de reemplazo.
		ArrayList<String> listaReemplazo = new ArrayList<>();
		
		listaReemplazo.add("rojo");
		listaReemplazo.add("verde");
		listaReemplazo.add("rojo");
		listaReemplazo.add("azul");
		
		String buscar = "rojo";
		String reemplazo = "amarillo";
		
		for (int i = 0; i < listaReemplazo.size(); i++) {
		    if (listaReemplazo.get(i).equals(buscar)) {
		        listaReemplazo.set(i, reemplazo);
		    }
		}
		
		System.out.println("9. Lista con reemplazos: " + listaReemplazo);
		
	//Verificación de Palíndromo: Se le entrega un ArrayList de Character que representa una secuencia de letras. El programa debe determinar si la secuencia forma un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda), devolviendo un valor booleano o un mensaje que lo indique.
		ArrayList<Character> listaPalindromo = new ArrayList<>();
		
		listaPalindromo.add('r');
		listaPalindromo.add('a');
		listaPalindromo.add('d');
		listaPalindromo.add('a');
		listaPalindromo.add('r');
		
		boolean esPalindromo = true;
		int izquierda = 0, derecha = listaPalindromo.size() - 1;
		
		while (izquierda < derecha) {
		    if (listaPalindromo.get(izquierda) != listaPalindromo.get(derecha)) {
		        esPalindromo = false;
		        break;
		    }
		    izquierda++;
		    derecha--;
		}

		System.out.println("10. ¿La lista es palíndromo?: " + esPalindromo);
		
	}
}
