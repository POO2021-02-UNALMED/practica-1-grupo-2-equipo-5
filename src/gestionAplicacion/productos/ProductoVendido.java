package gestionAplicacion.productos;

import java.io.Serializable;
import java.util.ArrayList;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.compras.Devolucion;


public class ProductoVendido implements Serializable, Devolucion {

    /*
         La finalidad de esta clase consite en difertenciar que productos pertenecen a que compra
         ya que entre Producto y CompraProductos habia una relacion de muchos a muchos, entonces surge
         esta clase para una mejor implementacion
    */

    // El Array de clase de productosVendidos se encarga de guardar todas la instancias
    // ProductoVendido par poder guardar y cargarlas en la serializacion.
    public static ArrayList<ProductoVendido> productosVendidos = new ArrayList<>();

    // Uso de constantes
    public static final double PORCENTAJE_GANANCIA = 0.2;

    // Atributos
    private double precioVenta;
    private String descripcion;
    private Producto producto;
    private CompraProductos compraProductos;

    // Constructor
    public ProductoVendido(double precioVenta, String descripcion ) {
        this.precioVenta = precioVenta;
        this.descripcion = descripcion;
        ProductoVendido.productosVendidos.add(this);
    }

    // Se establecen los métodos Getters & Setters
    public static ArrayList<ProductoVendido> getProductosVendidos() {
        return productosVendidos;
    }

    public static void setProductosVendidos(ArrayList<ProductoVendido> productosVendidos) {
        ProductoVendido.productosVendidos = productosVendidos;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public CompraProductos getCompraProductos() {
        return compraProductos;
    }

    public void setCompraProductos(CompraProductos compraProductos) {
        this.compraProductos = compraProductos;
    }

    // Metodo para agregar productos que han sido vendidos
    public static String agregarProductoVendido(ProductoVendido productoVendido){
        ProductoVendido.productosVendidos.add(productoVendido);
        return "Se agrego el producto vendido correctamente";
    }

    // Metodo utilizado para hacer una devolucion de un produto
    @Override
    public String devolver() {
        Producto.agregarProductoAInventario(this.producto);
        ProductoVendido.productosVendidos.remove(this);

        return "Se hizo la devolucion del producto correctamente";
    }
}
