package es.prueba.ej2.biblioteca;
import java.util.Objects;

/**
 * Clase que representa un libro con sus detalles principales.
 * Incluye información como el título, autor, ISBN y fecha de publicación.
 * 
 * @author ENDES
 * @version 1.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String fechaPublicacion;


/**
 * 
 * @param titulo El título del libro.
 * @param autor  El autor del libro.
 * @param iSBN El ISBN del libro.
 * @param fechaPublicacion  La fecha de publicación del libro
 */
	public Libro(String titulo, String autor, String iSBN, String fechaPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = iSBN;
		this.fechaPublicacion = fechaPublicacion;
	}



	/**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo El título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el ISBN del libro.
     *
     * @return El ISBN del libro.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Establece el ISBN del libro.
     *
     * @param iSBN El ISBN único del libro.
     */
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    /**
     * Obtiene la fecha de publicación del libro.
     *
     * @return La fecha de publicación del libro.
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Establece la fecha de publicación del libro.
     *
     * @param fechaPublicacion La fecha de publicación del libro.
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Genera un código hash basado en los atributos del libro.
     *
     * @return Un código hash para el libro.
     */
    @Override
    public int hashCode() {
        return Objects.hash(ISBN, autor, fechaPublicacion, titulo);
    }

    /**
     * Compara este libro con otro objeto para verificar si son iguales.
     *
     * @param obj El objeto con el que comparar.
     * @return {@code true} si este libro es igual al objeto proporcionado; {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        return Objects.equals(ISBN, other.ISBN) && Objects.equals(autor, other.autor)
                && Objects.equals(fechaPublicacion, other.fechaPublicacion) && Objects.equals(titulo, other.titulo);
    }

    /**
     * Proporciona una representación en forma de cadena de texto de un libro.
     *
     * @return Una cadena de texto que representa el libro.
     */
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", fechaPublicacion=" + fechaPublicacion + "]";
    }
}
