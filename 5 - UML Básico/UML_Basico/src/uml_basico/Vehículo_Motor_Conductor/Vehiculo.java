package uml_basico.Vehículo_Motor_Conductor;

public class Vehiculo {

    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getInfo() {
        return "{" + patente + ", " + modelo + ", Motor=" + motor.getInfo() + "}";
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public String mostrarConductor() {
        if (this.conductor != null) {
            return conductor.getInfo();
        }
        return "No hay conductor asociado";
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor.getInfo() + ", Conductor=" + mostrarConductor() + '}';
    }

}
