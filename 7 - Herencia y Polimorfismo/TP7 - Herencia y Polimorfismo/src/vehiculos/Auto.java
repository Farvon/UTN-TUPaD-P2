package vehiculos;

public class Auto extends Vehiculo {

    int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de Puertas: " + cantidadPuertas + "]";
    }

}
