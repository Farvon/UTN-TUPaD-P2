package tp7.herencia.y.polimorfismo;

import java.util.ArrayList;

import vehiculos.*;
import figurasGeometricas.*;
import empleados.*;
import Animales.*;

public class TP7HerenciaYPolimorfismo {

    public static void main(String[] args) {

        System.out.println("------ Vehículos y herencia ------");
        Vehiculo a1 = new Auto("Dodge", "1500", 4);
        a1.mostrarInfo();

        System.out.println("------ Figuras Geométricas ------");
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo("Rectangulo 1", 2, 5));
        figuras.add(new Circulo("Circulo 1", 5));
        figuras.add(new Rectangulo("Rectangulo 2", 3, 9));
        figuras.add(new Circulo("Circulo 2", 8));

        for (Figura figura : figuras) {
            figura.mostrarInfo();
            figura.calcularArea();
        }

        System.out.println("------ Empleados ------");
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoTemporal());
        empleados.add(new EmpleadoPlanta());

        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoTemporal) {
                empleado.calcularSueldo(300);
            } else {
                empleado.calcularSueldo(500);
            }
        }

        System.out.println("------ Animales ------");
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
        }

    }

}
