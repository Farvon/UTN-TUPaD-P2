package figurasGeometricas;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = 2 * Math.PI + radio;
        System.out.println("El área es: " + area);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "radio=" + radio + '}';
    }

}
