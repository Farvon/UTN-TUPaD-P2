package uml_basico;

import uml_basico.Pasaporte_Foto_Titular.*;

public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return this.pasaporte;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return super.toString("Nombre de titular: "+this.nombre+" DNI: "+this.dni+" y pasaporte numero "+pasaporte.getNumero());
    }
}
