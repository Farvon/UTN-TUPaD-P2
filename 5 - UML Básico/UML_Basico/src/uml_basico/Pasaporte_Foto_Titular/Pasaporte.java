package uml_basico.Pasaporte_Foto_Titular;

public class Pasaporte {

    private String numero;
    private String fechaEmicion;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmicion, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmicion = fechaEmicion;
        this.foto = new Foto(imagen, formato);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return this.titular;
    }

    public String getNombreTitular() {
        if (titular == null) {
            return "No tiene titular asignado";
        }
        return titular.getNombre();
    }

    public String getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmicion=" + fechaEmicion + ", foto=" + foto.getFoto() + ", titular=" + getNombreTitular() + '}';
    }

}
