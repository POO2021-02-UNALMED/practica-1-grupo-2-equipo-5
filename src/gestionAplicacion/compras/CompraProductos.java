package gestionAplicacion.compras;

import java.util.ArrayList;
import gestionAplicacion.productos.ProductoVendido;

public class CompraProductos  extends Compra{
    private ArrayList<ProductoVendido> productos = new ArrayList<>();
    private static ArrayList<CompraProductos> comprasProducto = new ArrayList<>();
    private String fechaCompra;
    private float descuento;

    public CompraProductos(String codigo, String descripcion, String direccion, String fechaCompra, float descuento) {
        super(codigo, descripcion, direccion);
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
        this.comprasProducto.add(this);
    }

    public CompraProductos(String fechaCompra, float descuento) {
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
        this.comprasProducto.add(this);
    }

    public  ArrayList<ProductoVendido> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoVendido> productos) {
        this.productos = productos;
    }

    public static ArrayList<CompraProductos> getComprasProducto() {
        return comprasProducto;
    }

    public static void setComprasProducto(ArrayList<CompraProductos> comprasProducto) {
        CompraProductos.comprasProducto = comprasProducto;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public ArrayList<ProductoVendido> aggProducto( ProductoVendido producto){
        this.productos.add(producto);
        return productos;
    }
}
