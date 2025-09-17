package uml_basico.Celular_Bateria_Usuario;

public class Usuario {

    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return this.celular;
    }

    public String getInfo() {
        return nombre + " " + dni;
    }

    public String getInfoCelular() {
        if (this.celular == null) {
            return "No tiene un celular asignado";
        }
        return celular.getInfo();
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + getInfoCelular() + '}';
    }

}
