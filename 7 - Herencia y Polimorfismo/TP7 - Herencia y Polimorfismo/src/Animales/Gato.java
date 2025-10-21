package Animales;

public class Gato extends Animal {

    @Override
    public void describirAnimal() {
        System.out.println("Soy un gato!");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau!!...");
    }

}
