package uml_basico.Vehículo_Motor_Conductor;

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
