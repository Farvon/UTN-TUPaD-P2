package uml_basico.Reserva_Cliente_Mesa;

public class Cliente {

    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getInfo() {
        return "{" + nombre + ", " + telefono + "}";
    }

}
