package tp8.interfaces.y.excepciones;

public class TP8InterfacesYExcepciones {

    public static void main(String[] args) {

        Cliente juan = new Cliente("Juan Pérez");
        Pedido pedido1 = new Pedido(juan);

        pedido1.agregarProducto(new Producto("Laptop", 1200.00));
        pedido1.agregarProducto(new Producto("Mouse", 25.00));
        pedido1.agregarProducto(new Producto("Laptop", 1200.00));
        pedido1.agregarProducto(new Producto("Mouse", 25.00));

        pedido1.listarProductos();

        double totalBruto = pedido1.calcularTotal();
        System.out.println("Total Bruto del Pedido: $" + totalBruto);

        System.out.println("----------------------------------------");

        Paypal pagoPayPal = new Paypal("juan@ejemplo.com");
        double descuento = pagoPayPal.aplicarDescuento(totalBruto);
        double totalNeto = totalBruto - descuento;

        System.out.println("Total Neto a pagar: $" + totalNeto);
        if (pagoPayPal.procesarPago(totalNeto)) {
            // 5. Notificar cambio de estado
            pedido1.cambiarEstado(EstadoPedido.PROCESANDO);

            // Simular otro cambio de estado
            pedido1.cambiarEstado(EstadoPedido.REALIZADO);
        } else {
            System.out.println("El pago falló.");
        }
    }
}
