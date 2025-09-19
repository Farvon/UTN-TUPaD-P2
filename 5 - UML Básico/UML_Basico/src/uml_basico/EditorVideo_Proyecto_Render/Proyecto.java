package uml_basico.EditorVideo_Proyecto_Render;

public class Proyecto {

    private String nombre;
    private Double duracion;

    public Proyecto(String nombre, Double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracion=" + duracion + '}';
    }

}
