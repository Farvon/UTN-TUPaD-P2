package tp8.interfaces.y.excepciones;

public class Paypal implements PagoConDescuento {

    private String email;
    private static final double DESCUENTO_PERCENTAJE = 10;

    public Paypal(String email) {
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
        System.out.println("Descuento de PayPal (" + DESCUENTO_PERCENTAJE + "%) aplicado: $" + descuento);
        return descuento;
    }

}
