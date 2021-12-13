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
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.cliente = cliente;

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
    public static String verComprasProductos() {

        String resultado = "";

        for (Compra compra : compras) {

            if (compra instanceof CompraProductos) {
                // Se resuelve el método to string de la subclase más específica
                resultado += "\n" + compra.toString();
            }

        }
        return resultado;
    }

    public static String verComprasServicios() {

        String resultado = "";

        for (Compra compra : compras) {

            if (compra instanceof CompraServicios) {
                // Se resuelve el método to string de la subclase más específica
                // por ligadura dinámica
                resultado += "\n" + compra.toString();
            }

        }
        return resultado;
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


}
