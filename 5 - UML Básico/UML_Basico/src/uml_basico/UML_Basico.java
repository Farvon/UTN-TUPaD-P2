package uml_basico;

/* IMPORTACIONES de clases -----  */
import uml_basico.Pasaporte_Foto_Titular.*;
import uml_basico.Celular_Bateria_Usuario.*;
import uml_basico.Libro_Autor_Editorial.*;
//import uml_basico.TarjetaDeCrédito_Cliente_Banco.*;
//import uml_basico.Computadora_PlacaMadre_Propietario.*;
//import uml_basico.Reserva_Cliente_Mesa.*;
//import uml_basico.Vehículo_Motor_Conductor.*;
//import uml_basico.Documento_FirmaDigital_Usuario.*;
//import uml_basico.CitaMedica_Paciente_Profesional.*;
//import uml_basico.CuentaBancaria_ClaveSeguridad_Titular.*;
//import uml_basico.Reproductor_Cancion_Artista.*;
//import uml_basico.Impuesto_Contribuyente_Calculadora.*;
//import uml_basico.GeneradorQR_Usuario_CodigoQR.*;
//import uml_basico.EditorVideo_Proyecto_Render.*;
/* ---------- */
public class UML_Basico {

    public static void Pasaporte_Foto_Titular() {

        Pasaporte pasaporte = new Pasaporte("321F", "15-2-25", "Foto Perfil", "png");
        Titular titular = new Titular("Facu", "asd123");

        System.out.println("Datos guardados al iniciar los objetos----");
        System.out.println(pasaporte);
        System.out.println(titular);
        pasaporte.setTitular(titular);
        System.out.println("Datos guardados al setear un nuevo titular----");
        System.out.println(pasaporte);
        System.out.println(titular);

    }

    public static void Celular_Bateria_Usuario() {
        Bateria bateria = new Bateria("AJ32", 50);
        Celular celular = new Celular("imei123", "Motorola", "G20", bateria); //Paso Bateria como parámetro
        Usuario facu = new Usuario("Facu", "32325454");

        System.out.println("Datos iniciales ---------");
        System.out.println(celular);
        System.out.println(facu);
        celular.setUsuario(facu); //Se asigna el usuario al celular
        System.out.println("Datos asociados ---------");
        System.out.println(celular);
        System.out.println(facu);

    }

    public static void Libro_Autor_Editorial() {

        Autor autor = new Autor("Edgar Alan Poe", "Ingles");
        Editorial editorial = new Editorial("Saturno", "Siempre vivas 123");
        Libro libro = new Libro("Sherlock Holmes", "9801", editorial);
        System.out.println(libro);
        libro.mostrarAutor();
        libro.setAutor(autor);
        System.out.println(libro);
        libro.mostrarAutor();

    }

    public static void TarjetaDeCrédito_Cliente_Banco() {
    }

    public static void Computadora_PlacaMadre_Propietario() {
    }

    public static void Reserva_Cliente_Mesa() {
    }

    public static void Vehiculo_Motor_Conductor() {
    }

    public static void Documento_FirmaDigital_Usuario() {
    }

    public static void CitaMedica_Paciente_Profesional() {
    }

    public static void CuentaBancaria_ClaveSeguridad_Titular() {
    }

    public static void Reproductor_Cancion_Artista() {
    }

    public static void Impuesto_Contribuyente_Calculadora() {
    }

    public static void GeneradorQR_Usuario_CodigoQR() {
    }

    public static void EditorVideo_Proyecto_Render() {
    }

    public static void main(String[] args) {

        //Pasaporte_Foto_Titular();
        //Celular_Bateria_Usuario();
        //Libro_Autor_Editorial();
        TarjetaDeCrédito_Cliente_Banco();
        /*Computadora_PlacaMadre_Propietario();
        Reserva_Cliente_Mesa();
        Vehiculo_Motor_Conductor();
        Documento_FirmaDigital_Usuario();
        CitaMedica_Paciente_Profesional();
        CuentaBancaria_ClaveSeguridad_Titular();
        Reproductor_Cancion_Artista();
        Impuesto_Contribuyente_Calculadora();
        GeneradorQR_Usuario_CodigoQR();
        EditorVideo_Proyecto_Render();
         */
    }

}
