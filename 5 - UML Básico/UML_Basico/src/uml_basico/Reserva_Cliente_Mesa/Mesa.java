package uml_basico.Reserva_Cliente_Mesa;

public class Mesa {

    private Integer numero;
    private Integer capacidad;
    private Reserva reserva;

    public Mesa(Integer numero, Integer capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getInfo() {
        return "{" + numero + ", " + capacidad + "}";
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
        if (reserva != null && reserva.getMesa() != this) {
            reserva.setMesa(this);
        }
    }

    public Reserva getReserva() {
        return this.reserva;
    }

    public String mostrarReserva() {
        if (this.reserva != null) {
            return reserva.getInfo();
        }
        return "No hay reserva asignada";
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + ", reserva=" + mostrarReserva() + '}';
    }

}
