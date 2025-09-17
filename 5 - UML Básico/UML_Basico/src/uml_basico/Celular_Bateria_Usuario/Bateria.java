package uml_basico.Celular_Bateria_Usuario;

public class Bateria {

    private String modelo;
    private Integer capacidad;

    public Bateria(String modelo, Integer capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getInfoBateria() {
        return modelo + " con capacidad de " + capacidad.toString();
    }

}
