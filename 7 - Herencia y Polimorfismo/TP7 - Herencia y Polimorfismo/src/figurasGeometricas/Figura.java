package figurasGeometricas;

public abstract class Figura {

    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularArea();

    public void mostrarInfo() {
    }

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", ";
    }

}
