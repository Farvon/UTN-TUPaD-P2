/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.TarjetaDeCrédito_Cliente_Banco;

/**
 *
 * @author farvo
 */
public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getInfo() {
        return "{" + numero + ", " + fechaVencimiento + ", " + banco.getInfo() + "}";
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
            System.out.println("Se asigna Tarjeta a cliente");
        }
    }

    public String mostrarCliente() {
        if (this.cliente != null) {
            return cliente.getInfo();
        }
        return "No tiene un cliente asignado";
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + mostrarCliente() + ", banco=" + banco.getInfo() + '}';
    }

}
