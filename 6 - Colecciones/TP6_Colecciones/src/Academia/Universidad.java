package Academia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public void agregarProfesor(Profesor p) {
        if (p != null) {
            profesores.add(p);
        } else {
            System.out.println("Debe proporcionar un valor válido");
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null) {
            cursos.add(c);
        } else {
            System.out.println("Debe proporcionar un valor válido");
        }
    }

    // Usa setProfesor del curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = buscarProfesorPorId(idProfesor);
        Curso curso = buscarCursoPorCodigo(codigoCurso);

        Profesor profeViejo = curso.getProfesor();
        if (profeViejo != null) {
            profeViejo.eliminarCurso(curso);
        }

        curso.setProfesor(profesor);

    }

    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorBuscado = null;
        Iterator<Profesor> it = this.profesores.iterator();
        while (it.hasNext() && profesorBuscado == null) {
            Profesor next = it.next();
            if (next.getId().equalsIgnoreCase(id)) {
                profesorBuscado = next;
            }
        }
        return profesorBuscado;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoBuscado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoBuscado == null) {
            Curso next = it.next();
            if (next.getCodigo().equalsIgnoreCase(codigo)) {
                cursoBuscado = next;
            }
        }
        return cursoBuscado;
    }

    //Debe romper la relación con su profesor si la hubiera.
    public void eliminarCurso(String codigo) {
        Curso cursoBuscado = buscarCursoPorCodigo(codigo);
        Profesor profesor = cursoBuscado.getProfesor();

        if (profesor != null) {
            profesor.eliminarCurso(cursoBuscado);
        }

    }

    //Antes de remover, dejar null los cursos que dictaba.
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        for (Curso curso : cursos) {
            if (curso.getProfesor() == profesor) {
                curso.eliminarProfesor();
            }
        }
        profesores.remove(profesor);

    }
}
