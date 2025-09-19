/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml_basico.CuentaBancaria_ClaveSeguridad_Titular;

/**
 *
 * @author farvo
 */
public class ClaveSeguridad {

    private String codigo;
    private String ultimaModificación;

    public ClaveSeguridad(String codigo, String ultimaModificación) {
        this.codigo = codigo;
        this.ultimaModificación = ultimaModificación;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificaci\u00f3n=" + ultimaModificación + '}';
    }

}
