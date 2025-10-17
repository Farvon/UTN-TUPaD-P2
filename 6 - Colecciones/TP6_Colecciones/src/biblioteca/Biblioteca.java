package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);

    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);

        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator();
        while (it.hasNext() && libroEncontrado == null) {
            Libro next = it.next();
            if (next.getIsbn().equalsIgnoreCase(isbn)) {
                libroEncontrado = next;
            }
        }
        return libroEncontrado;

    }

    public void filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnio() == anio) {
                librosFiltrados.add(libro);
            }
        }

        System.out.println("Libros publicados en " + anio + " : ");
        for (Libro librosFiltrado : librosFiltrados) {
            System.out.println(librosFiltrado);
        }
    }

    public void eliminarLibro(String isbn) {
        Libro libroBuscado = buscarLibroPorIsbn(isbn);
        if (libroBuscado == null) {
            System.out.println("No existe el libro");
        } else {
            libros.remove(libroBuscado);
            System.out.println("Libro Borrado");
        }

    }

    public void obtenerCantidadLibros() {
        System.out.println("Cantidad de libros en Biblioteca: " + libros.size());
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles");

        ArrayList<Autor> autoresDisponibles = new ArrayList<>();

        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresDisponibles.contains(autor)) {
                autoresDisponibles.add(autor);
            }
        }

        for (Autor autor : autoresDisponibles) {
            System.out.println(autor.getNombre());
        }
    }
}
