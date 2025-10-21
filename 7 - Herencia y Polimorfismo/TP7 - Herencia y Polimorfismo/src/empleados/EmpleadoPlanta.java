package empleados;

public class EmpleadoPlanta extends Empleado {

    @Override
    public void calcularSueldo(double valorHora) {
        double sueldo = valorHora * 48;
        System.out.println("El sueldo es: " + sueldo);
    }

}
