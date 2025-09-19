/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.Computadora_PlacaMadre_Propietario;

/**
 *
 * @author farvo
 */
public class Propietario {

    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getInfo() {
        return "{" + nombre + ", " + dni + "}";
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
            System.out.println("Se asigna Cliente a tarjeta");

        }
    }

    public Computadora getComputadora() {
        return this.computadora;
    }

    public String mostrarComputadora() {
        if (this.computadora != null) {
            return computadora.getInfo();
        }
        return "No tiene una computadora asignado";
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + mostrarComputadora() + '}';
    }

}
