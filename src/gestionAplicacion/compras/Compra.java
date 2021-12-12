package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;

public class Compra implements Serializable {

    protected static ArrayList<Compra> compras = new ArrayList<>();
    protected Cliente cliente;
    protected int codigo;
    protected String descripcion;
    protected String direccion;

    public Compra(int codigo, String descripcion, String direccion, Cliente cliente) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.cliente = cliente;

    }

    public Compra() {
    }

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
