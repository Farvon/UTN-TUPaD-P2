package uml_basico.Computadora_PlacaMadre_Propietario;

public class PlacaMadre {

    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getInfo() {
        return "{" + modelo + ", " + chipset + "}";
    }
}
