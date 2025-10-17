package Academia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getId() {
        return this.id;
    }

    public Profesor getProfesor() {
        return this;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        } else {
            System.out.println("El profesor ya tiene asignado ese curso");
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.eliminarProfesor();
            }
        } else {
            System.out.println("El profesor no tiene asignado ese curso");
        }

    }

    public Curso buscarCurso(Curso c) {
        Curso cursoBuscado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoBuscado == null) {
            Curso next = it.next();
            if (next == c) {
                cursoBuscado = next;
            }
        }
        return cursoBuscado;
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso.getCodigo() + " - " + curso.getNombre());

        }
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cursos=" + cursos.size() + '}';
    }

}
