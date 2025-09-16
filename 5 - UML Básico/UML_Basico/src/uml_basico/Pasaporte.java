package uml_basico;

import uml_basico.Pasaporte_Foto_Titular.*;
import java.util.Date;

public class Pasaporte {

    private String numero;
    private String fechaEmicion;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmicion, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmicion = fechaEmicion;
        this.foto = new Foto("imagen/imagen.png", "png");
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return this.titular;
    }

    public String getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return super.toString("Pasaporte numero " + numero + " con fecha " + fechaEmicion + " con foto: " + this.foto.getFoto() + " y titular: " + this.titular.getNombre()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
