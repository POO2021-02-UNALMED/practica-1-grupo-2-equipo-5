package gestionAplicacion.productos;

import java.util.ArrayList;
import gestionAplicacion.compras.CompraProductos;


public class ProductoVendido {

    /*
        Escribir y explicar finalidad de la clase ProductoVendido, junto con sus estructuras de datos cuando sea necesario.
    */

    public static ArrayList<ProductoVendido> productos_vendidos = new ArrayList<>();

    private double precio;
    private String descripcion;
    private Producto producto;
    private CompraProductos compra_productos;

    public ProductoVendido(double precio, String descripcion, Producto producto, CompraProductos compra_productos) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.producto = producto;
        this.compra_productos = compra_productos;
    }

    public static ArrayList<ProductoVendido> getProductos_vendidos() {
        return productos_vendidos;
    }

    public static void setProductos_vendidos(ArrayList<ProductoVendido> productos_vendidos) {
        ProductoVendido.productos_vendidos = productos_vendidos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public CompraProductos getCompra_productos() {
        return compra_productos;
    }

    public void setCompra_productos(CompraProductos compra_productos) {
        this.compra_productos = compra_productos;
    }
}
