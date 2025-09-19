package uml_basico.CitaMedica_Paciente_Profesional;

public class Profecional {

    private String nombre;
    private String especialidad;

    public Profecional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profecional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }

    
    
}
