package senanoche;

public class senanoche {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        
        int i = 0;
        // 1. Iterar por todos los elementos dentro del arreglo utilizando while y mostrarlos en pantalla.
        while (i < numeros.length) {
            System.out.println("Bucle while: " + numeros[i]);
            i++;
        }
        
        // 2. Iterar por todos los elementos dentro del arreglo utilizando el ciclo “for” y mostrarlos en pantalla.
        for (int i1 = 0; i1 < numeros.length; i1++) {
            System.out.println("Bucle for: " + numeros[i1]);
        }
        
        // 3. Iterar por todos los elementos dentro del arreglo utilizando el ciclo “foreach” y mostrarlos en pantalla.
        for (int numero : numeros) {
            System.out.println("Bucle foreach: " + numero);
        }
        
        // 4. Mostrar todos los elementos dentro del arreglo sumándole uno a cada uno.
        for (int numero1 : numeros) {
            System.out.println("Arreglo sumando 1: " + (numero1 + 1));
        }
        
        // 5. Crear una copia del arreglo usando el ciclo “for” pero con todos los elementos incrementados en 1.
        int[] copia = new int[numeros.length]; // arreglo copia del mismo tamaño
        
        // Copiamos cada elemento incrementado en 1
        for (int i2 = 0; i2 < numeros.length; i2++) {
            copia[i2] = numeros[i2] + 1;
        }
        
        for (int i3 = 0; i3 < copia.length; i3++) {
            System.out.println("Arreglo copia: " + copia[i3]);
        }
        
        // 6. Calcular el promedio de todos los elementos del arreglo
        int suma = 0;
        
        // Sumamos todos los elementos
        for (int numero2 : numeros) {
            suma += numero2;
        }

        // Calculamos el promedio (nota: hacer casting para obtener decimales)
        double promedio = (double) suma / numeros.length;

        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}