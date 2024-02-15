package es.prueba.ej3.biblioteca;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GestorBibliotecaTest {

	 private GestorBiblioteca gestor;
	    private Libro libro1;
	    private Libro libro2;

	    @Before
	    public void setUp() {
	        gestor = new GestorBiblioteca();
	        libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "123456789", "1943");
	        libro2 = new Libro("1984", "George Orwell", "987654321", "1949");
	        gestor.agregarLibro(libro1);
	        gestor.agregarLibro(libro2);
	    }

	    @Test
	    public void testAgregarLibro() {
	        // Implementa la lógica de la prueba aquí
	    }

	    @Test
	    public void testBuscarLibro() {
	        // Implementa la lógica de la prueba aquí
	    }

	    @Test
	    public void testEliminarLibro() {
	        // Implementa la lógica de la prueba aquí
	    }

}
