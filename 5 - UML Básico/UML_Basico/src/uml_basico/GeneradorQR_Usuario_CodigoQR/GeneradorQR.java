package uml_basico.GeneradorQR_Usuario_CodigoQR;

public class GeneradorQR {

    private CodigoQR codigoQR;

    public void generar(String valor, Usuario usuario) {
        this.codigoQR = new CodigoQR(valor);
        System.out.println("Se crea codigoQR: " + codigoQR);
        this.codigoQR.setUsuario(usuario);
        System.out.println("Se asocia usuario: " + codigoQR);
    }

}
