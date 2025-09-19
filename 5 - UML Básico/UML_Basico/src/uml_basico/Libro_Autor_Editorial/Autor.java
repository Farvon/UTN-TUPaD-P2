package uml_basico.Libro_Autor_Editorial;

public class Autor {

    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getAutor() {
        return nombre + " de nacionalidad " + nacionalidad;
    }

}
