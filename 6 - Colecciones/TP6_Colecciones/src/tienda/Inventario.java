package tienda;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventario {

    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        Iterator<Producto> it = this.productos.iterator();
        while (it.hasNext() && productoEncontrado == null) {
            Producto next = it.next();
            if (next.getId().equalsIgnoreCase(id)) {
                productoEncontrado = next;
            }
        }
        return productoEncontrado;

    }

    public void eliminarProducto(String id) {
        Producto productoABorrar = buscarProductoPorId(id);
        productos.remove(productoABorrar);
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto buscado = buscarProductoPorId(id);
        if (buscado == null) {
            System.out.println("No se puede actualizar un producto que no existe");
        } else {
            buscado.setStock(nuevaCantidad);
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                productosFiltrados.add(producto);
            }
        }

        System.out.println("Productos con la categoria " + categoria + " : ");
        for (Producto productosFiltrado : productosFiltrados) {
            System.out.println(productosFiltrado);
        }
    }

    public void obtenerTotalStock() {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " : " + producto.getStock());
        }

    }

    public void obtenerProductoConMayorStock() {
        Producto prodStockMax = null;
        int stockMax = 0;

        for (Producto producto : productos) {
            if (producto.getStock() > stockMax) {
                prodStockMax = producto;
                stockMax = producto.getStock();
            }
        }

        System.out.println(prodStockMax);
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }

        System.out.println("Productos con precio entre " + min + " y " + max + " : ");
        for (Producto productosFiltrado : productosFiltrados) {
            System.out.println(productosFiltrado);
        }
    }

    public void mostrarCategoriasDisponibles() {
        for (Producto producto : productos) {
            System.out.println(producto.getCategoria() + " - " + producto.getCategoria().getDescripcion());
        }
    }

}
