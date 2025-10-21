package figurasGeometricas;

public class Rectangulo extends Figura {

    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public void calcularArea() {
        double area = 2 * lado1 + 2 * lado2;
        System.out.println("El área es: " + area);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }

}
