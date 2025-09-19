package uml_basico.Documento_FirmaDigital_Usuario;

public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getInfo() {
        return "{ CodigoHash= " + codigoHash + ", fecha= " + fecha + ", Usuario= " + usuario.getInfo() + "}";
    }

}
