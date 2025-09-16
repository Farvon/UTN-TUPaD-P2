package uml_basico;

import uml_basico.Pasaporte_Foto_Titular.*;

public class Foto {

    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getFoto() {
        return this.imagen + "." + this.formato;
    }

}
