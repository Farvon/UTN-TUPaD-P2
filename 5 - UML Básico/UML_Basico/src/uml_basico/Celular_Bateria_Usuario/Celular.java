package uml_basico.Celular_Bateria_Usuario;

public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public String getInfo() {
        return marca + " " + modelo;
    }

    public String getInfoUsuario() {
        if (this.usuario == null) {
            return "No tiene un usuario asignado";
        }
        return usuario.getInfo();
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", usuario=" + getInfoUsuario() + ", bateria= " + bateria.getInfoBateria() + '}';
    }

}
