package gestionAplicacion.productos;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable {

    /*
        La finalidad de esta clase es guardar los datos de los productos que
        estan en inventario por la tienda, asi como algunas funcionalidades
        utiles para la misma.
    */

    // El Array de clase de productos se encarga de guardar todas las instancias de
    // Producto para poder guardar y cargarlas en la serializacion
    private static ArrayList<Producto> productos = new ArrayList<>();


    // Array encargado de guardar aquellos productos que se encuentran en
    // inventario
    private static ArrayList<Producto> inventario = new ArrayList<>();

    // Atributos
    private int codigo;
    private String nombre;
    // Implementacion caso de enumeración
    public static enum tipo_producto {COMPUTADORES_PERSONALES, PERIFERICOS, CONSOLAS_DE_VIDEOJUEGOS,
                                ACCESORIOS, COMBOS, COMPONENTES, DRONES};
    tipo_producto tipo;

    private double precioCompra;

    // El array de productos vendidos hace referencia a la relacion de Producto
    // con productos Vendidos
    private ArrayList<ProductoVendido> productosVendidos = new ArrayList<>();

    //Constructor
    public Producto(int codigo, String nombre, tipo_producto tipo, double precioCompra ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioCompra = precioCompra;
        productos.add(this);
        inventario.add(this);
    }

    // Se establecen los métodos Getters & Setters
    public static ArrayList<Producto> getInventario() {
        return inventario;
    }

    public static void setInventario(ArrayList<Producto> productos) {
        Producto.inventario = productos;
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

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public ArrayList<ProductoVendido> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<ProductoVendido> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        Producto.productos = productos;
    }

    // Metodo para obterner el costo de los productos en inventario, hace parte de la función utilidad
    public static double gastosProductos() {
        double gastos = 0;

        for (Producto producto : inventario) {
            gastos += producto.precioCompra;
        }

        return gastos;
    }

    // metodo para agregar productos al inventario
    public static String agregarProductoAInventario(Producto producto) {
        Producto.inventario.add(producto);
        return "Se agrego el producto al inventario correctamente";
    }

    // metodo para agregar productos
    public static String agregarProducto(Producto producto){
        Producto.productos.add(producto);
        return "Se agrego el producto al inventario correctamente";
    }

    // metodos del CRUD
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

    public static boolean eliminarProductoInvetario(Producto producto) {
        inventario.remove(producto);
        return true;
    }

    public static Producto buscarProducto (int codigo) {

        for (Producto producto : inventario) {
            if (producto.codigo == codigo) {

                return producto;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", precioCompra=" + precioCompra +
                '}';
    }

    //Metodo para calcular los egresos por compras de productos
    public static double obtenerEgresosProductos() {
        double egresos = 0;

        for (Producto producto : productos) {
            egresos += producto.getPrecioCompra();
        }

        return egresos;
    }

}
