/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.Reserva_Cliente_Mesa;

/**
 *
 * @author farvo
 */
public class Reserva {

    private String fecha;
    private String hora;
    private Cliente cliente; //Agregación 1:1
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
    }

    public String getInfo() {
        return "{" + fecha + ", " + hora + ", Cliente = " + mostrarCliente() + "}";
    }

    public String mostrarCliente() {

        return cliente.getInfo();

    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
        if (mesa != null && mesa.getReserva() != this) {
            mesa.setReserva(this);
        }
    }

    public Mesa getMesa() {
        return this.mesa;
    }

    public String mostrarMesa() {
        if (this.mesa != null) {
            return mesa.getInfo();
        }
        return "No hay mesa asignada";
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + mostrarCliente() + ", mesa=" + mostrarMesa() + '}';
    }

}
