package uml_basico.TarjetaDeCrédito_Cliente_Banco;

public class Cliente {

    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;

    }

    public String getInfo() {
        return "{" + nombre + ", " + dni + "}";
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
            System.out.println("Se asigna Cliente a tarjeta");

        }
    }

    public TarjetaDeCredito getTarjeta() {
        return this.tarjeta;
    }

    public String mostrarTarjeta() {
        if (this.tarjeta != null) {
            return tarjeta.getInfo();
        }
        return "No tiene una tarjeta asignado";
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + mostrarTarjeta() + '}';
    }

}
