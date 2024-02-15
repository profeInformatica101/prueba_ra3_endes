package es.prueba.ej3.biblioteca;
import java.util.ArrayList;
import java.util.List;


/**
 * Clase para gestionar una colección de libros en una biblioteca.
 * Permite realizar operaciones como agregar, buscar y eliminar libros de la colección.
 * 
 * @author ENDES
 * @version 1.0
 */
public class GestorBiblioteca {
    
    private List<Libro> biblioteca;

    /**
     * Constructor que inicializa la lista de libros.
     */
    public GestorBiblioteca() {
        biblioteca = new ArrayList<>();
    }

    /**
     * Agrega un libro a la biblioteca.
     * 
     * @param libro El libro a agregar.
     * @return true si el libro fue agregado con éxito, false si el libro ya existe.
     */
    public boolean agregarLibro(Libro libro) {
        // Lógica para agregar el libro, evitando duplicados
        // ... @TODO
    	return false;
    }

    /**
     * Busca un libro por su título.
     * 
     * @param titulo El título del libro a buscar.
     * @return Un objeto {@code Libro} si se encuentra, {@code null} en caso contrario.
     */
    public Libro buscarLibro(String titulo) {
        // Lógica para buscar el libro por título
        // ... @TODO
    	return null;
    }

    /**
     * Elimina un libro de la biblioteca.
     * 
     * @param libro El libro a eliminar.
     * @return true si el libro fue eliminado con éxito, false si el libro no se encuentra en la biblioteca.
     */
    public boolean eliminarLibro(Libro libro) {
        // Lógica para eliminar el libro
        // ... @TODO
    	return false;
    }

    /**
     * Obtiene la lista de todos los libros en la biblioteca.
     * 
     * @return La lista de libros.
     */
    public List<Libro> obtenerTodosLosLibros() {
        // Devuelve una copia de la lista para evitar la modificación externa
        // ... @TODO
    	return null;
    }
}