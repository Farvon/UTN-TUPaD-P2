package interfaces;

public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println("Se notifica a " + this.getNombre() + ": " + mensaje);
    }

}
