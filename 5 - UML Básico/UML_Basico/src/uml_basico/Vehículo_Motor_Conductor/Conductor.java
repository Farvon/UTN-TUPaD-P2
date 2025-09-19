/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.Vehículo_Motor_Conductor;

/**
 *
 * @author farvo
 */
public class Conductor {

    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getInfo() {
        return "{" + nombre + ", " + licencia + "}";
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }

    public String mostrarVehiculo() {
        if (this.vehiculo != null) {
            return vehiculo.getInfo();
        }
        return "No hay vehiculo asociado";
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + ", vehiculo=" + mostrarVehiculo() + '}';
    }

}
