package uml_basico;

/* IMPORTACIONES de clases -----  */
//import uml_basico.Pasaporte_Foto_Titular.*;
//import uml_basico.Celular_Bateria_Usuario.*;
//import uml_basico.Libro_Autor_Editorial.*;
//import uml_basico.TarjetaDeCrédito_Cliente_Banco.*;
//import uml_basico.Computadora_PlacaMadre_Propietario.*;
//import uml_basico.Reserva_Cliente_Mesa.*;
import uml_basico.Vehículo_Motor_Conductor.*;
import uml_basico.Documento_FirmaDigital_Usuario.*;
import uml_basico.CitaMedica_Paciente_Profesional.*;
import uml_basico.CuentaBancaria_ClaveSeguridad_Titular.*;
import uml_basico.Reproductor_Cancion_Artista.*;
import uml_basico.Impuesto_Contribuyente_Calculadora.*;
//import uml_basico.GeneradorQR_Usuario_CodigoQR.*;
import uml_basico.EditorVideo_Proyecto_Render.*;

/* ---------- */
public class UML_Basico {

    /*
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

        Cliente cliente = new Cliente("Facundo", "32324545");
        Banco banco = new Banco("ICBC", "123333411");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1122", "12-12-22", banco);

        System.out.println(tarjeta);
        System.out.println(cliente);
        tarjeta.setCliente(cliente);
        System.out.println(tarjeta);
        System.out.println(cliente);

    }

    public static void Computadora_PlacaMadre_Propietario() {

        Computadora computadora = new Computadora("HP", "232425T", "A520M Pro", "Intel I5");
        Propietario propietario = new Propietario("Joaquin", "45121212");

        System.out.println(computadora);
        System.out.println(propietario);
        propietario.setComputadora(computadora);
        System.out.println("Se asigna computadora a propietario");
        System.out.println(computadora);
        System.out.println(propietario);

    }

    public static void Reserva_Cliente_Mesa() {

        Cliente cliente = new Cliente("Pedro", "11225544");
        Reserva reserva = new Reserva("12-12-25", "14:00", cliente);
        Mesa mesa = new Mesa(5, 2);

        System.out.println(reserva);
        System.out.println(mesa);
        System.out.println("Se asigna reserva a Mesa");
        mesa.setReserva(reserva);
        System.out.println(reserva);
        System.out.println(mesa);

    }
     */
    public static void Vehiculo_Motor_Conductor() {

        Motor v8 = new Motor("V8", "2222F");
        Vehiculo vehiculo = new Vehiculo("12AA23", "Nissan", v8);
        Conductor conductor = new Conductor("Rodrigo", "124578");

        System.out.println(vehiculo);
        System.out.println(conductor);
        System.out.println("Asigno vehiculo a Conductor");
        conductor.setVehiculo(vehiculo);
        System.out.println(vehiculo);
        System.out.println(conductor);

    }

    public static void Documento_FirmaDigital_Usuario() {

        Usuario usuario = new Usuario("Jaime", "jaimito@gmail.com");
        Documento documento = new Documento("Contrato de Venta", "Contenido del contrato", "#225", "25/9/25", usuario);

        System.out.println(documento);

    }

    public static void CitaMedica_Paciente_Profesional() {

        Profecional profecional = new Profecional("Dr. Ricardo", "Odontologo");
        Paciente paciente = new Paciente("Carlos", "Galeno");
        CitaMedica citaMedica = new CitaMedica("12-4-25", "11:00hs");
        System.out.println(citaMedica);
        System.out.println(paciente);
        System.out.println(profecional);
        System.out.println("Se asignan paciente y profecional a cita medica");
        citaMedica.setPaciente(paciente);
        citaMedica.setProfecional(profecional);
        System.out.println(citaMedica);

    }

    public static void CuentaBancaria_ClaveSeguridad_Titular() {

        CuentaBancaria cuentaBancaria = new CuentaBancaria("11225454", 500.00, "1234", "20/9/2025");
        Titular titular = new Titular("Facundo", "32111111");

        System.out.println(cuentaBancaria);
        System.out.println(titular);
        cuentaBancaria.setTitular(titular);
        System.out.println("Se compone la cuenta bancaria con el titular");
        System.out.println(cuentaBancaria);
        System.out.println(titular);

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
        //TarjetaDeCrédito_Cliente_Banco();
        //Computadora_PlacaMadre_Propietario();
        //Reserva_Cliente_Mesa();
        //Vehiculo_Motor_Conductor();
        //Documento_FirmaDigital_Usuario();
        //CitaMedica_Paciente_Profesional();
        //CuentaBancaria_ClaveSeguridad_Titular();
        Reproductor_Cancion_Artista();
        /*Impuesto_Contribuyente_Calculadora();
        GeneradorQR_Usuario_CodigoQR();
        EditorVideo_Proyecto_Render();
         */
    }

}
