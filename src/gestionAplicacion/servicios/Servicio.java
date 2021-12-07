package gestionAplicacion.servicios;

import gestionAplicacion.compras.CompraServicios;

import java.io.Serializable;
import java.util.ArrayList;

public class Servicio implements Serializable {

    // Atributos
    private double precio;
    private String descripcion;
    private TipoServicio tipoServicio;
    private CompraServicios compraServicios;
    private static ArrayList<Servicio> servicios = new ArrayList<Servicio>();

    // Se cre el método constructor
    public Servicio(double precio, String descripcion, TipoServicio tipoServicio, CompraServicios compraServicios) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
        this.compraServicios = compraServicios;
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

}
