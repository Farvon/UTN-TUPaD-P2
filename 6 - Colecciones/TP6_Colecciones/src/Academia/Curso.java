package Academia;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setProfesor(Profesor p) {
        this.profesor = p;
        Curso curso = p.buscarCurso(this);
        if (curso == null) {
            profesor.agregarCurso(this);
        }

    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void eliminarProfesor() {
        this.profesor = null;
    }

    public Curso getCurso() {
        return this;
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    public String mostrarProfesor() {
        if (this.profesor == null) {
            return "";
        } else {
            return ", profesor= " + this.profesor.getNombre();
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + mostrarProfesor() + "}";
    }

}
