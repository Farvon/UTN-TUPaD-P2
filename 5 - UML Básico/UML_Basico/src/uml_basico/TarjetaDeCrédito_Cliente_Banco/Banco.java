package uml_basico.TarjetaDeCrédito_Cliente_Banco;

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
