package interfaces;

public class PayPal implements PagoConDescuento {

    private String email;
    private static final double DESCUENTO_PERCENTAJE = 0.10;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago aprovado a travez de Paypal");
        return true;
    }

    @Override
    public double aplicarDescuento(double total) {
        double descuento = total * DESCUENTO_PERCENTAJE;
        System.out.println("Descuento de PayPal (" + (int) (DESCUENTO_PERCENTAJE * 100) + "%) aplicado: $" + Math.round(descuento));
        return descuento;
    }

}
