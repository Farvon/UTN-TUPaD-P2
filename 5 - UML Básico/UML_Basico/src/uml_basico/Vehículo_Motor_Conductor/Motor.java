/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.Vehículo_Motor_Conductor;

/**
 *
 * @author farvo
 */
public class Motor {

    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getInfo() {
        return "{" + tipo + ", " + numeroSerie + "}";
    }

}
