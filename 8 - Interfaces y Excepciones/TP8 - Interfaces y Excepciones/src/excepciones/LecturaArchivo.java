package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void leerArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            Scanner sc = new Scanner(archivo);

            System.out.println("Contenido del archivo:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe o la ruta es incorrecta.");
        }
    }
}
