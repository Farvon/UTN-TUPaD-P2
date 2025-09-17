package uml_basico.Pasaporte_Foto_Titular;

public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return this.pasaporte;
    }

    public String getNumeroPasaporte() {
        if (pasaporte == null) {
            return "No tiene titular asignado";
        }
        return pasaporte.getNumero();
    }

    public String getNombre() {
        if (pasaporte == null) {
            return "No tiene titular asignado";
        }
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + getNumeroPasaporte() + '}';
    }

}
