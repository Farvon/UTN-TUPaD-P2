package tp8.interfaces.y.excepciones;

public class TarjetaCredito implements Pago {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Se realizó el pago de $" + monto + " de manera exitosa con tarjeta de credito");
        return true;
    }

}
