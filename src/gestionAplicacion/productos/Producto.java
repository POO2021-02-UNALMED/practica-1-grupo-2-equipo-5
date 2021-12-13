package gestionAplicacion.productos;

import gestionAplicacion.servicios.Servicio;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {

    /*
        Escribir y explicar finalidad de la clase Producto, junto con sus estructuras de datos cuando sea necesario.
    */

    private static ArrayList<Producto> inventario = new ArrayList<>();

    private int codigo;
    private String nombre;
    private enum tipo_producto {COMPUTADORES_PERSONALES, PERIFERICOS, CONSOLAS_DE_VIDEOJUEGOS,
                                ACCESORIOS, COMBOS, COMPONENTES, DRONES};                       // Implementacion caso de enumeración
    tipo_producto tipo;

    // Agregar atributo de precioCompra y cambiar el precio por precioVenta
    private double precio;
    private ArrayList<ProductoVendido> productosVendidos = new ArrayList<>();


    public Producto(int codigo, String nombre, tipo_producto tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        Producto.inventario.add(this);
    }

    // implentar metodo para obterner el costo de los productos en invertario, hace parte de la función utilidad

    public static ArrayList<Producto> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<Producto> inventario) {
        Producto.inventario = inventario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipo_producto getTipo() {
        return tipo;
    }

    public void setTipo(tipo_producto tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<ProductoVendido> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<ProductoVendido> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public static  ArrayList<Producto> agregarProducto(Producto producto){
        Producto.inventario.add(producto);
        return inventario;
    }

    public static String verProductos() {

        String resultado = "";

        for (Producto producto : inventario) {


            // Se resuelve el método to string de la subclase más específica
            resultado += "\n" + producto.toString();


        }
        return resultado;
    }


    public static boolean eliminarProducto(int codigo) {

        for (Producto producto : inventario) {
            if (producto.codigo == codigo) {
                inventario.remove(producto);
                return true;
            }
        }

        return false;
    }

    public static Producto buscarProducto (int codigo) {

        for (Producto producto : inventario) {
            if (producto.codigo == codigo) {

                return producto;
            }
        }
        return null;
    }

}
