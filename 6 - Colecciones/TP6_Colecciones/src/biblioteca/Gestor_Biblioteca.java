package biblioteca;

public class Gestor_Biblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor marquez = new Autor("1", "Gabriel García Márquez", "Colombiano");
        Autor cortazar = new Autor("2", "Julio Cortazar", "Argentino");
        Autor borges = new Autor("3", "Jorge Lui Borges", "Argentino");

        biblioteca.agregarLibro("978-9500745093", "Cien años de soledad", 1967, marquez);
        biblioteca.agregarLibro("950-0708167", "El amor en los tiempos del cólera", 1985, marquez);
        biblioteca.agregarLibro("978-8402076939", "Crónica de una muerte anunciada", 1981, marquez);
        biblioteca.agregarLibro("84-487-0403-7", "Rayuela", 1985, cortazar);
        biblioteca.agregarLibro("978-8420633121", "Ficciones", 1944, borges);

        System.out.println("Listado de libros actuales ------------------");
        biblioteca.listarLibros();

        System.out.println("--------------------------------------------------------");
        System.out.println("Se busca libro por ISBN = 84-487-0403-7 ------------------");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("84-487-0403-7");
        if (libroBuscado == null) {
            System.out.println("No existe ese libro en la biblioteca");
        } else {
            System.out.println("Libro encontrado: ");
            System.out.println(libroBuscado);
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("Filtramos Libros según fecha ------------------");
        biblioteca.filtrarLibrosPorAnio(1985);

        System.out.println("--------------------------------------------------------");
        System.out.println("Se elimina libro por su ISBN : 84-487-0403-7");
        biblioteca.eliminarLibro("84-487-0403-7");

        System.out.println("--------------------------------------------------------");
        System.out.println("Listado de libros actuales ------------------");
        biblioteca.listarLibros();

        System.out.println("--------------------------------------------------------");
        biblioteca.obtenerCantidadLibros();

        System.out.println("--------------------------------------------------------");
        biblioteca.mostrarAutoresDisponibles();

    }

}
