package es.prueba.ej1.camino;

public class Funciones {
	
	
/** ################
 *  #   FUNCIONES  #
 *  ################
 */
	/**
	 * Función que realiza la busqueda binaria. Devuelve el indice si se encuentra el elemento y -1 en caso contrario.
	 * @param arr   Elementos
	 * @param clave  Elemento que se busca
	 * @return
	 */
	public static int busquedaBinaria(int[] arr, int clave) {
	    int izquierda = 0;
	    int derecha = arr.length - 1;
	    
	    while (izquierda <= derecha) {
	        int medio = izquierda + (derecha - izquierda) / 2;
	        
	        // Verifica si la clave está presente en el medio
	        if (arr[medio] == clave) {
	            return medio;
	        }
	        
	        // Si la clave es mayor, ignora la mitad izquierda
	        if (arr[medio] < clave) {
	            izquierda = medio + 1;
	        }
	        // Si la clave es menor, ignora la mitad derecha
	        else {
	            derecha = medio - 1;
	        }
	    }
	    
	    // Si llegamos aquí, la clave no estaba presente
	    return -1;
	}

	/**
	 * Daddo un array de enteros devuelve un array ordenado
	 * @param arreglo
	 */
	public static void ordenacionPorBurbuja(int[] arreglo) {
	    boolean intercambiado;
	    do {
	        intercambiado = false;
	        for (int i = 0; i < arreglo.length - 1; i++) {
	            if (arreglo[i] > arreglo[i + 1]) {
	                // Intercambia elementos
	                int temp = arreglo[i];
	                arreglo[i] = arreglo[i + 1];
	                arreglo[i + 1] = temp;
	                intercambiado = true;
	            }
	        }
	    } while (intercambiado);
	}
	/**
	 * Busqueda secuencial si encuentra el elmento devuelve el indice en caso contrario -1
	 * @param arr
	 * @param objetivo
	 * @return
	 */
	public int busquedaSecuencial(int[] arr, int objetivo) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == objetivo) {
	            return i; // Elemento encontrado
	        }
	    }
	    return -1; // Elemento no encontrado
	}
	
	/** ################
	 *  #   Pruebas  #
	 *  ################
	 */
	
	public static void main(String[] args) {
		// Casos de prueba para la función de búsqueda binaria
	    // @TODO: Crear un arreglo ordenado
	    int[] arregloOrdenado = {1, 3, 5, 7, 9, 11};
	    //Probar con un valor que se encuentra en el medio del arreglo
	    System.out.println(busquedaBinaria(arregloOrdenado, 5) == 2 ? "Prueba exitosa" : "Prueba fallida");
	    //Probar con un arreglo vacío
	    System.out.println(busquedaBinaria(new int[]{}, 3) == -1 ? "Prueba exitosa" : "Prueba fallida");

	    // Casos de prueba para la función de ordenación por burbuja
	    // Ordenar un arreglo desordenado
	    int[] arregloDesordenado = {4, 2, 5, 1, 3};
	    ordenacionPorBurbuja(arregloDesordenado);
	    // Verificar que el arreglo esté ordenado
	    boolean ordenado = true;
	    for (int i = 0; i < arregloDesordenado.length - 1; i++) {
	        if (arregloDesordenado[i] > arregloDesordenado[i + 1]) {
	            ordenado = false;
	            break;
	        }
	    }
	    System.out.println(ordenado ? "Prueba exitosa" : "Prueba fallida");

	    // Probar la ordenación de un arreglo ya ordenado
	    int[] arregloYaOrdenado = {1, 2, 3, 4, 5};
	    ordenacionPorBurbuja(arregloYaOrdenado);
	    ordenado = true;
	    for (int i = 0; i < arregloYaOrdenado.length - 1; i++) {
	        if (arregloYaOrdenado[i] > arregloYaOrdenado[i + 1]) {
	            ordenado = false;
	            break;
	        }
	    }
	    System.out.println(ordenado ? "Prueba exitosa" : "Prueba fallida");

	    //  Probar con un arreglo de un solo elemento
	    int[] arregloUnElemento = {1};
	    ordenacionPorBurbuja(arregloUnElemento);
	    System.out.println(arregloUnElemento[0] == 1 ? "Prueba exitosa" : "Prueba fallida");

	    //  Probar con un arreglo vacío
	    int[] arregloVacio = {};
	    ordenacionPorBurbuja(arregloVacio);
	    System.out.println(arregloVacio.length == 0 ? "Prueba exitosa" : "Prueba fallida");
		
	}

}
