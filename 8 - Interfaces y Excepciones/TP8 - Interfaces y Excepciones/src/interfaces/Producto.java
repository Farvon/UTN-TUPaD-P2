package tp8.interfaces.y.excepciones;

public class Producto implements Pagable {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public double calcularTotal() {

        return getPrecio();
    }

}
