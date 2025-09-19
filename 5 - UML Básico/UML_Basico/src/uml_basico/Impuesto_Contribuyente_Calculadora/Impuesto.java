package uml_basico.Impuesto_Contribuyente_Calculadora;

public class Impuesto {

    private Double monto;
    private Contribuyente contribuyente;

    public Impuesto(Double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }

}
