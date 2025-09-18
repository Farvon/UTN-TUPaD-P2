/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.TarjetaDeCrédito_Cliente_Banco;

/**
 *
 * @author farvo
 */
public class Banco {

    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getInfo() {
        return "{" + nombre + ", " + cuit + "}";
    }

}
