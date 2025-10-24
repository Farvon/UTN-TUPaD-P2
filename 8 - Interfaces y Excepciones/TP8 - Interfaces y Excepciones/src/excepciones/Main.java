package excepciones;

public class Main {

    public static void main(String[] args) {

        System.out.println("---- División segura ----");
        DivisionSegura.dividir();

        System.out.println("---- Conversión de cadena a número ----");
        ConversionCadenaNumero.convertir();

        System.out.println("---- Lectura de archivo ----");
        LecturaArchivo.leerArchivo("D:\\Users\\c.fchia\\TUP\\P2\\practica\\UTN-TUPaD-P2\\8 - Interfaces y Excepciones\\TP8 - Interfaces y Excepciones\\src\\excepciones\\archivo.txt");

        System.out.println("---- Verificación de edad ----");
        VerificacionEdad.verificarEdad();

        System.out.println("---- Lectura con try-with-resources ----");
        // Se escribe mal el nombre del archivo para forzar el error
        LecturaConTryWithResources.leerArchivo("D:\\Users\\c.fchia\\TUP\\P2\\practica\\UTN-TUPaD-P2\\8 - Interfaces y Excepciones\\TP8 - Interfaces y Excepciones\\src\\excepciones\\archivoz.txt");
    }
}
