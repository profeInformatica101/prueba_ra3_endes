package es.prueba.ej1.camino;

public class Main {

	/** ################
	 *  #   Pruebas  #
	 *  ################
	 */
	
	public static void main(String[] args) {
		// Casos de prueba para la función de búsqueda binaria
	    // @TODO: Crear un arreglo ordenado
	    int[] arregloOrdenado = {1, 3, 5, 7, 9, 11};
	    //Probar con un valor que se encuentra en el medio del arreglo
	    System.out.println(Funciones.busquedaBinaria(arregloOrdenado, 5) == 2 ? "Prueba exitosa" : "Prueba fallida");
	    //Probar con un arreglo vacío
	    System.out.println(Funciones.busquedaBinaria(new int[]{}, 3) == -1 ? "Prueba exitosa" : "Prueba fallida");

	    // Casos de prueba para la función de ordenación por burbuja
	    // Ordenar un arreglo desordenado
	    int[] arregloDesordenado = {4, 2, 5, 1, 3};
	    Funciones.ordenacionPorBurbuja(arregloDesordenado);
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
	    Funciones.ordenacionPorBurbuja(arregloYaOrdenado);
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
	    Funciones.ordenacionPorBurbuja(arregloUnElemento);
	    System.out.println(arregloUnElemento[0] == 1 ? "Prueba exitosa" : "Prueba fallida");

	    //  Probar con un arreglo vacío
	    int[] arregloVacio = {};
	    Funciones.ordenacionPorBurbuja(arregloVacio);
	    System.out.println(arregloVacio.length == 0 ? "Prueba exitosa" : "Prueba fallida");
		
	}

}
