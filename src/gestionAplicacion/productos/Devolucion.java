package gestionAplicacion.productos;

import gestionAplicacion.compras.CompraProductos;

import java.io.Serializable;
import java.util.ArrayList;

public class Devolucion implements Serializable {

    /*
        Escribir y explicar finalidad de la clase Devolucion, junto con sus estructuras de datos cuando sea necesario.
    */

    private static ArrayList<Devolucion> devoluciones = new ArrayList<>();

    private int codigo;
    private String descripcion;
    private CompraProductos compraCompleta;
    private ArrayList<ProductoVendido> productos;

    /*Devolucion en el caso que sea de una compra completa*/

    public Devolucion(int codigo, String descripcion, CompraProductos compraCompleta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.compraCompleta = compraCompleta;
        Devolucion.devoluciones.add(this);
    }

    /*Devolucion en el caso que sea de una compra parcial, es decir un conjunto seleccionado de productos pertenecientes
    * a la compra */

    public Devolucion(int codigo, String descripcion, CompraProductos compra_completa, ArrayList<ProductoVendido> productos) {    // Sobrecarga de constructores
        this(codigo, descripcion, compra_completa);         // Manejo de referencia this()
        this.productos = productos;                         // Manejo de referencias this para desambiguar
    }

    public static ArrayList<Devolucion> getDevoluciones() {
        return devoluciones;
    }

    public static void setDevoluciones(ArrayList<Devolucion> devoluciones) {
        Devolucion.devoluciones = devoluciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CompraProductos getCompraCompleta() {
        return compraCompleta;
    }

    public void setCompraCompleta(CompraProductos compraCompleta) {
        this.compraCompleta = compraCompleta;
    }

    public ArrayList<ProductoVendido> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoVendido> productos) {
        this.productos = productos;
    }
}
