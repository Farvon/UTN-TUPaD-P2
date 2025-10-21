package Animales;

public class Perro extends Animal {

    @Override
    public void describirAnimal() {
        System.out.println("Soy un perro!");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau!!...");
    }

}
