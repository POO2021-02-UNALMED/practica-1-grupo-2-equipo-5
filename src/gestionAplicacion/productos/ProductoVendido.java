package gestionAplicacion.productos;

import java.io.Serializable;
import java.util.ArrayList;
import gestionAplicacion.compras.CompraProductos;


public class ProductoVendido implements Serializable {

    /*
        Escribir y explicar finalidad de la clase ProductoVendido, junto con sus estructuras de datos cuando sea necesario.
    */

    public static ArrayList<ProductoVendido> productosVendidos = new ArrayList<>();

    private double precio;
    private String descripcion;
    private Producto producto;
    private CompraProductos compraProductos;

    public ProductoVendido(double precio, String descripcion, Producto producto, CompraProductos compraProductos) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.producto = producto;
        this.compraProductos = compraProductos;
        ProductoVendido.productosVendidos.add(this);
    }

    public static ArrayList<ProductoVendido> getProductosVendidos() {
        return productosVendidos;
    }

    public static void setProductosVendidos(ArrayList<ProductoVendido> productosVendidos) {
        ProductoVendido.productosVendidos = productosVendidos;
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

    public CompraProductos getCompraProductos() {
        return compraProductos;
    }

    public void setCompraProductos(CompraProductos compraProductos) {
        this.compraProductos = compraProductos;
    }
}
