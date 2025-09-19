package uml_basico.CuentaBancaria_ClaveSeguridad_Titular;

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
