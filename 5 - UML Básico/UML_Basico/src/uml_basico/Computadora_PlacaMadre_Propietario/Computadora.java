/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.Computadora_PlacaMadre_Propietario;

/**
 *
 * @author farvo
 */
public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlacaMadre, String chipsetPlacaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlacaMadre, chipsetPlacaMadre);
    }

    public String getInfo() {
        return "{" + marca + ", " + numeroSerie + ", Placa Madre= " + placaMadre.getInfo() + "}";
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
            System.out.println("Se asigna Cliente a tarjeta");

        }
    }

    public Propietario getPropietario() {
        return this.propietario;
    }

    public String mostrarPropietario() {
        if (this.propietario != null) {
            return propietario.getInfo();
        }
        return "No tiene un propietario asignado";
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre.getInfo() + ", propietario=" + mostrarPropietario() + '}';
    }

}
