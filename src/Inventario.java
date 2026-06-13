import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> obtenerProductos() {
        return productos;
    }

    public Producto buscarProducto(int id) {

        for (Producto p : productos) {

            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    public void eliminarProducto(int id) {

        Producto producto = buscarProducto(id);

        if (producto != null) {
            productos.remove(producto);
        }
    }
}