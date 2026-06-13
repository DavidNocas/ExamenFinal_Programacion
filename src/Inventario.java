public class Inventario {

    private String producto;
    private int stock;
    private String estado;

    public Inventario(String producto,
                      int stock,
                      String estado) {

        this.producto = producto;
        this.stock = stock;
        this.estado = estado;
    }

    public String getProducto() {
        return producto;
    }

    public int getStock() {
        return stock;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarStock(int nuevoStock) {
        this.stock = nuevoStock;
    }
}