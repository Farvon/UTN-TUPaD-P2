package interfaces;

public class TP8InterfacesYExcepciones {

    public static void main(String[] args) {

        Cliente facu = new Cliente("Facundo");
        Pedido pedido1 = new Pedido(facu);

        pedido1.agregarProducto(new Producto("Notebook", 1200));
        pedido1.agregarProducto(new Producto("Teclado", 250));
        pedido1.agregarProducto(new Producto("Monitor", 120));
        pedido1.agregarProducto(new Producto("Parlantes", 756));

        pedido1.listarProductos();

        double totalBruto = pedido1.calcularTotal();
        System.out.println("Total Bruto del Pedido: $" + totalBruto);

        System.out.println("----------------------------------------");

        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-1234-5678");
        System.out.println("Se realiza el pago con Tarjeta de Credito");

        // Notifica cambio de estados
        pedido1.cambiarEstado(EstadoPedido.PROCESANDO);
        if (tarjeta.procesarPago(totalBruto)) {
            // Notifica cambio de estados
            pedido1.cambiarEstado(EstadoPedido.REALIZADO);
        } else {
            // Notifica cambio de estados
            pedido1.cambiarEstado(EstadoPedido.CANCELADO);
            System.out.println("El pago falló.");
        }

        System.out.println("Se intenta realizar el pago con Paypal aprovechando el descuento");
        PayPal pagoPayPal = new PayPal("facu@gmail.com.es");
        double descuento = pagoPayPal.aplicarDescuento(totalBruto);
        double totalNeto = totalBruto - descuento;
        System.out.println("Total Neto a pagar: $" + totalNeto);
        // Notifica cambio de estado
        pedido1.cambiarEstado(EstadoPedido.PROCESANDO);

        if (pagoPayPal.procesarPago(totalNeto)) {
            // Notifica cambio de estado
            pedido1.cambiarEstado(EstadoPedido.REALIZADO);
        } else {
            // Notifica cambio de estado
            pedido1.cambiarEstado(EstadoPedido.CANCELADO);
            System.out.println("El pago falló.");
        }
    }
}
