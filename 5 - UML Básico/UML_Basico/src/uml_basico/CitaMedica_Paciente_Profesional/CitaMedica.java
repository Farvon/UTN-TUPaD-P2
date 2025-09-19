package uml_basico.CitaMedica_Paciente_Profesional;

public class CitaMedica {

    private String fecha;
    private String hora;
    private Profecional profecional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setProfecional(Profecional profecional) {
        this.profecional = profecional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", profecional=" + profecional + ", paciente=" + paciente + '}';
    }

}
