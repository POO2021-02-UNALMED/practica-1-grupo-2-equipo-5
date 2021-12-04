package gestionAplicacion.productos;

import java.util.ArrayList;

public class Producto {

    /*
        Escribir y explicar finalidad de la clase Producto, junto con sus estructuras de datos cuando sea necesario.
    */

    private static ArrayList<Producto> inventario = new ArrayList<>();

    private int codigo;
    private String nombre;
    private enum tipo_producto {COMPUTADORES_PERSONALES, PERIFERICOS, CONSOLAS_DE_VIDEOJUEGOS,
                                ACCESORIOS, COMBOS, COMPONENTES, DRONES};                       // Implementacion caso de enumeración
    tipo_producto tipo;
    private double precio;
    private ArrayList<ProductoVendido> productos_vendidos = new ArrayList<>();


    public Producto(int codigo, String nombre, tipo_producto tipo, double precio ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

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

    public ArrayList<ProductoVendido> getProductos_vendidos() {
        return productos_vendidos;
    }

    public void setProductos_vendidos(ArrayList<ProductoVendido> productos_vendidos) {
        this.productos_vendidos = productos_vendidos;
    }
}
