package gestionAplicacion.servicios;

import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.compras.CompraServicios;

import java.io.Serializable;
import java.util.ArrayList;

public class Servicio implements Serializable {

    /*
        La finalidad de esta clase es recolectar los datos de los servicios especificos que se hacen
        en una compra de servicios
    */

    // El Array de clase de servicio se encarga de guardar todas las instacias
    // de Servicio para poder guardar y cargarlas en la serializacion
    protected static ArrayList<Servicio> servicios = new ArrayList<>();

    // Atributos
    private double precio;
    private String descripcion;
    private TipoServicio tipoServicio;
    private CompraServicios compraServicios;
    private int codigo;

    // Se crea el método constructor
    public Servicio(double precio, String descripcion, TipoServicio tipoServicio, CompraServicios compraServicios, int codigo) {
        this(precio, descripcion, codigo);
        this.tipoServicio = tipoServicio;
        this.compraServicios = compraServicios;
        servicios.add(this);
    }

    // Sobrecarga de constructores
    public Servicio(double precio, String descripcion,int codigo) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = codigo;
        Servicio.servicios.add(this);
    }

    // Se establecen los métodos Getters & Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public CompraServicios getCompraServicios() {
        return compraServicios;
    }

    public void setCompraServicios(CompraServicios compraServicios) {
        this.compraServicios = compraServicios;
    }

    public static ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public static void setServicios(ArrayList<Servicio> servicios) {
        Servicio.servicios = servicios;
    }


    public static String verServicio() {

        String resultado = "";

        for (Servicio servicio : servicios) {


            // Se resuelve el método to string de la subclase más específica
            resultado += "\n" + servicios.toString();


        }
        return resultado;
    }


    public static boolean eliminarServicio(int codigo) {

        for (Servicio servicio : servicios) {
            if (servicio.codigo == codigo) {
                servicios.remove(servicio);
                return true;
            }
        }

        return false;
    }

    public static Servicio buscarServicio(int codigo) {

        for (Servicio servicio : servicios) {
            if (servicio.codigo == codigo) {

                return servicio;
            }
        }
        return null;
    }

    // Se crea el método toString()
    @Override
    public String toString() {
        return "Servicio : {" +
                "Precio=" + precio +
                ", Descripcion='" + descripcion + '\'' +
                ", TipoServicio=" + tipoServicio +
                ", Compra de Servicios=" + compraServicios.getCodigo() +
                '}';
    }
}
