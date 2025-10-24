package interfaces;

public class TarjetaCredito implements Pago {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        //Simula error
        System.out.println("No se realizó el pago de $" + monto + ". Error en sistema.");
        return false;
    }

}
