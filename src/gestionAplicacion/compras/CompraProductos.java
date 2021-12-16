package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;

import gestionAplicacion.empleados.Cajero;
import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;

public class CompraProductos extends Compra implements Serializable, Devolucion {

    /*
        La finalidad de esta clase consiste en guardar los datos de las compras
        que son solo de productos que se hacen en la tienda.
    */

    // El array de productos hace referencia a la relacion con los productos
    // vendidos que hacen parte de la compra
    private ArrayList<ProductoVendido> productos = new ArrayList<>();

    // Atributos (Encapsulamiento con atributos de visibilidad private)
    private String fechaCompra;
    private double descuento;

    //Constructor
    public CompraProductos(int codigo, String descripcion, String direccion, Cliente cliente, String fechaCompra) {
        super(codigo, descripcion, direccion, cliente);
        this.fechaCompra = fechaCompra;
    }

    //Sobrecarga de constructores
    public CompraProductos(int codigo, String descripcion, String direccion,Cliente cliente, String fechaCompra, double descuento) {
        this(codigo, descripcion, direccion, fechaCompra, descuento);
        // Manejo del this() para desambiguar

    }

    public CompraProductos(int codigo, String descripcion, String direccion, String fechaCompra, double descuento) {
        super(codigo, descripcion, direccion);
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
    }

    // Se agregan lo métodos Getters & Setters
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

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public ArrayList<ProductoVendido> agregarProducto( ProductoVendido producto){
        this.productos.add(producto);
        return productos;
    }

    // Se agrega el método toString() para mostrar todos los datos
    @Override
    public String toString() {
        return "CompraProductos : {" +
                "Cliente=" + cliente.getNombre() +
                ", Codigo='" + codigo + '\'' +
                ", Descripcion='" + descripcion + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Cantidad de Productos=" + productos.size() +
                ", Fecha de Compra='" + fechaCompra + '\'' +
                ", Descuento=" + descuento +
                '}';
    }

    // Se agrega el método devolución de la interfaz Devolucion para devolver la compra
    // completa de productos
    @Override
    public String devolver() {

        for (ProductoVendido productoVendido : productos) {
            productoVendido.devolver();
        }
        Compra.getCompras().remove(this);

        return "La compra ha sido devuelta exitosamente";
    }

    // Se agraga el método agregarProductoACompra para ingresar a la compra de un cliente
    // un producto que se encuentre en el inventario.
    public String agregarProductoACompra(Producto producto, Cajero cajero) {

        Producto.eliminarProductoInvetario(producto);
        ProductoVendido vendido = new ProductoVendido(producto.getPrecioCompra()*ProductoVendido.PORCENTAJE_GANANCIA,
                                                      "Sin descripcion");

        cajero.agregarAProductosVendidos(vendido);
        vendido.setProducto(producto);
        vendido.setCompraProductos(this);
        productos.add(vendido);

        return "El producto se agregó correctamente a la compra";
    }
}
