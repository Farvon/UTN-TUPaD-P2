package tienda;

public class Tienda {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        Producto productoBuscado;

        Producto fideo = new Producto("1", "Fideo", 1200.00, 5, CategoriaProducto.ALIMENTOS);
        Producto monitor = new Producto("2", "Monitor", 230000.00, 2, CategoriaProducto.ELECTRONICA);
        Producto gorra = new Producto("3", "Gorra", 15000.00, 4, CategoriaProducto.ROPA);
        Producto mesa = new Producto("4", "Mesa", 120000.00, 1, CategoriaProducto.HOGAR);
        Producto arroz = new Producto("5", "Arroz", 900.00, 3, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(fideo);
        inventario.agregarProducto(monitor);
        inventario.agregarProducto(gorra);
        inventario.agregarProducto(mesa);
        inventario.agregarProducto(arroz);

        System.out.println("Listado de productos actuales ------------------");
        inventario.listarProductos();

        System.out.println("-------------------------------------------------");
        System.out.println("Se busca producto con id 1");
        productoBuscado = inventario.buscarProductoPorId("1");
        if (productoBuscado == null) {
            System.out.println("No tenémos ese producto en la tienda");
        } else {
            System.out.println("Producto encontrado: " + productoBuscado);

        }

        System.out.println("-------------------------------------------------");
        System.out.println("Filtrar productos con categoria ALIMENTOS");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("-------------------------------------------------");
        System.out.println("Se elimina producto con id 3");
        inventario.eliminarProducto("3");

        System.out.println("-------------------------------------------------");
        System.out.println("Listado de productos actuales ------------------");
        inventario.listarProductos();

        System.out.println("-------------------------------------------------");
        System.out.println("Se actualiza stock de mesa ------------------");
        inventario.actualizarStock("4", 9);

        System.out.println("-------------------------------------------------");
        System.out.println("Listado de productos actuales ------------------");
        inventario.listarProductos();

        System.out.println("-------------------------------------------------");
        System.out.println("Stock disponibles ------------------");
        inventario.obtenerTotalStock();

        System.out.println("-------------------------------------------------");
        System.out.println("Producto con mayor stock ------------------");
        inventario.obtenerProductoConMayorStock();

        System.out.println("-------------------------------------------------");
        System.out.println("Filtrar productos por rango de precio ------------------");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("-------------------------------------------------");
        System.out.println("Categorias disponibles con sus descripciones ------------------");
        inventario.mostrarCategoriasDisponibles();
    }

}
