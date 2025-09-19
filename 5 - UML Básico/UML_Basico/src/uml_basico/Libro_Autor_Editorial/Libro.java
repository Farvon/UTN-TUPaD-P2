package uml_basico.Libro_Autor_Editorial;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarAutor() {
        if (this.autor != null) {
            System.out.println("El autor es: " + this.autor.getAutor());
        } else {
            System.out.println("Este libro no tiene asignado un autor aun");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", Autor= " + autor + '}';
    }

}
