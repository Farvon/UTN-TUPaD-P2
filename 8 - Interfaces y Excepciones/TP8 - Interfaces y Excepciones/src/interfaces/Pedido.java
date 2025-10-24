package tp8.interfaces.y.excepciones;

import java.util.ArrayList;

public class Pedido implements Pagable {

    private ArrayList<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private EstadoPedido estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE;
        notificarCambioEstado();

    }

    public void listarProductos() {
        System.out.println("Listado de productos del Pedido: ");
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre());

        }
    }

    public void notificarCambioEstado() {

        if (cliente != null) {
            cliente.recibirNotificacion("El estado del pedido ha cambiado a " + estado);
        }
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);

    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}
