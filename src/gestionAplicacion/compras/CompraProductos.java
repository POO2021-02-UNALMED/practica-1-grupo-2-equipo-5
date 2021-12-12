package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;
import gestionAplicacion.productos.ProductoVendido;

public class CompraProductos  extends Compra implements Serializable {

    private ArrayList<ProductoVendido> productos = new ArrayList<>();
    private String fechaCompra;
    private float descuento;

    public CompraProductos(int codigo, String descripcion, String direccion,Cliente cliente, String fechaCompra, float descuento) {
        super(codigo, descripcion, direccion, cliente);
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
        Compra.compras.add(this);
    }

    public CompraProductos(String fechaCompra, float descuento) {
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
        Compra.compras.add(this);
    }

    public ArrayList<ProductoVendido> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoVendido> productos) {
        this.productos = productos;
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

    public ArrayList<ProductoVendido> agregarProducto( ProductoVendido producto){
        this.productos.add(producto);
        return productos;
    }

    @Override
    public String toString() {
        return "CompraProductos{" +
                "\ncliente=" + cliente.getNombre() +
                "\ncodigo='" + codigo + '\'' +
                "\ndescripcion='" + descripcion + '\'' +
                "\ndireccion='" + direccion + '\'' +
                "\ncantidad_productos=" + productos.size() +
                "\nfechaCompra='" + fechaCompra + '\'' +
                "\ndescuento=" + descuento +
                '}';
    }
}
