package gestionAplicacion.compras;

import gestionAplicacion.productos.ProductoVendido;
import gestionAplicacion.servicios.Servicio;

import java.io.Serializable;
import java.util.ArrayList;

public class Compra implements Serializable {

    /*
        La finalidad de esta clase consiste en guardar los datos de las compras
        que se hacen en la tienda, teniendo en cuenta si son de Productos o de servicios
    */

    // El Array de clase de compras se encarga de guardar todas las instancias de
    // Compra para poder guardar y cargarlas en la serializacion
    protected static ArrayList<Compra> compras = new ArrayList<>();

    // Atributos (Encapsulamiento con atributos de visibilidad protected)
    protected Cliente cliente;
    protected int codigo;
    protected String descripcion;
    protected String direccion;

    //Constructor
    public Compra(int codigo, String descripcion, String direccion, Cliente cliente) {
        this(codigo, descripcion, direccion);
        this.cliente = cliente;
    }

    public Compra(int codigo, String descripcion, String direccion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        compras.add(this);
    }

    // Se agregan lo métodos Getters & Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public void setDescripcion(String desprcicion) {
        this.descripcion = desprcicion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static ArrayList<Compra> getCompras() {
        return compras;
    }

    public static void setCompras(ArrayList<Compra> compras) {
        Compra.compras = compras;
    }

    // Implentar método para obtener Ingresos con todas las compras realizadas en la tienda
    public static double obtenerIngresos() {

        double Ingresos = 0;

        for (Compra compra : compras) {
            if (compra instanceof CompraProductos) {
                // Ligadura dinámica en tiempo de ejecución
                for (ProductoVendido producto : ((CompraProductos) compra).getProductos()) {
                    Ingresos += producto.getPrecioVenta();
                }
            }
            else if (compra instanceof CompraServicios) {
                // Ligadura dinámica en tiempo de ejecución
                for (Servicio servicio : ((CompraServicios) compra).getServicios()) {
                    Ingresos += servicio.getPrecio();
                }
            }
        }



        return Ingresos;
    }

    // Metodos que hacen parte del CRUD

    /*
        El método verComprasProductos() retorna una cadena de texto con todas las descripciones de los compras realizadas
        a cargo de un cliente en el sistema
    */

    public static String verComprasProductos() {

        String resultado = "";

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i) instanceof CompraProductos) {
                resultado += (i+1) + ". " + compras.get(i) + "\n";
            }

        }

        return resultado;

    }

    public static String verComprasServicios() {

        String resultado = "";

        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i) instanceof CompraServicios) {
                resultado += (i+1) + ". " + compras.get(i) + "\n";
            }

        }

        return resultado;

    }

    /*
        El método agregarCompra() recibe por parámetro una compra para añadir a la lista de compras
    */

    public static void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public static boolean eliminarCompra(int codigo) {

        for (Compra compra : compras) {
            if (compra.codigo == codigo) {
                compras.remove(compra);
                return true;
            }
        }

        return false;
    }

    public static Compra buscarCompra(int codigo) {

        for (Compra compra : compras) {
            if (compra.codigo == codigo) {

                return compra;
            }
        }

        return null;

    }

    @Override
    public String toString() {
        return "Compra{" +
                "cliente=" + cliente.getNombre() +
                ", codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
