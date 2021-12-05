package gestionAplicacion.servicios;

import gestionAplicacion.compras.CompraServicios;

import java.util.ArrayList;

public class Servicio {
    private double precio;
    private String descripcion;
    private TipoServicio tipoServicio;
    private CompraServicios compraServicios;
    private ArrayList<Servicio> servicios;

    // Se cre el método constructor

    public Servicio(double precio, String descripcion, TipoServicio tipoServicio, CompraServicios compraServicios) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
        this.compraServicios = compraServicios;
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

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }
    
}
