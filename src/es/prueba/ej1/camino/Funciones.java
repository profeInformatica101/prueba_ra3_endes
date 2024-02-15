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
	public static int busquedaBinaria(int[] arr, int objetivo) {
	    int inicio = 0;
	    int fin = arr.length - 1;

	    while (inicio <= fin) {
	        int mitad = inicio + (fin - inicio) / 2; // Para evitar la posibilidad de overflow

	        if (arr[mitad] == objetivo) {
	            return mitad; // Elemento encontrado
	        } else if (arr[mitad] < objetivo) {
	            inicio = mitad + 1;
	        } else {
	            fin = mitad - 1;
	        }
	    }

	    return -1; // Elemento no encontrado
	}

	/**
	 * Dado un array de enteros devuelve un array ordenado
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
	public static int busquedaSecuencial(int[] arr, int objetivo) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == objetivo) {
	            return i; // Elemento encontrado
	        }
	    }
	    return -1; // Elemento no encontrado
	}
	
	

}
