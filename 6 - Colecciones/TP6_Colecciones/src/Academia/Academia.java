package Academia;

public class Academia {

    public static void main(String[] args) {
        Universidad universidad = new Universidad();

        Profesor facu = new Profesor("1", "Facundo", "Computación");
        Profesor cris = new Profesor("2", "Cristian", "Matemática");
        Profesor ana = new Profesor("3", "Anahí", "RRHH");

        Curso programacion = new Curso("1-0020", "Programación 1");
        Curso organizacion = new Curso("3-0010", "Organización Empresarial");
        Curso ecuaciones = new Curso("2-0220", "Ecuaciones Lineales");
        Curso bbdd = new Curso("1-0025", "Base de Datos");
        Curso liquidaciones = new Curso("3-0005", "Liquidaciones");

        universidad.agregarProfesor(facu);
        universidad.agregarProfesor(cris);
        universidad.agregarProfesor(ana);

        universidad.agregarCurso(programacion);
        universidad.agregarCurso(organizacion);
        universidad.agregarCurso(ecuaciones);
        universidad.agregarCurso(bbdd);
        universidad.agregarCurso(liquidaciones);

        System.out.println("Lista de Profesores ------------------");
        universidad.listarProfesores();

        System.out.println("Lista de Cursos ------------------");
        universidad.listarCursos();

        System.out.println("-----------------------------");
        System.out.println("Se asignan Profesores a Cursos ");
        universidad.asignarProfesorACurso("1-0020", "1");
        universidad.asignarProfesorACurso("3-0010", "3");
        universidad.asignarProfesorACurso("2-0220", "2");
        universidad.asignarProfesorACurso("1-0025", "1");
        universidad.asignarProfesorACurso("3-0005", "3");
        System.out.println("-----------------------------");

        System.out.println("Lista de Profesores ------------------");
        universidad.listarProfesores();

        System.out.println("Lista de Cursos ------------------");
        universidad.listarCursos();

        System.out.println("-----------------------------");
        System.out.println("Se cambia curso 3-0010 a Profesor 2");
        universidad.asignarProfesorACurso("3-0010", "2");
        System.out.println("-----------------------------");

        System.out.println("Lista de Profesores ------------------");
        universidad.listarProfesores();

        System.out.println("Lista de Cursos ------------------");
        universidad.listarCursos();

        System.out.println("-----------------------------");
        System.out.println("Se elimina Profesor 2");
        universidad.eliminarProfesor("2");
        System.out.println("-----------------------------");

        System.out.println("Lista de Profesores ------------------");
        universidad.listarProfesores();

        System.out.println("Lista de Cursos ------------------");
        universidad.listarCursos();

    }

}
