package gestionAplicacion.compras;

import java.util.ArrayList;
import gestionAplicacion.servicios.Servicio;

public class CompraServicios extends Compra{
    private static ArrayList<CompraServicios> compraServicios = new ArrayList<>();
    private ArrayList<Servicio> servicios = new ArrayList<>();
    private String tiempoCulminacion;

    public CompraServicios(String codigo, String descripcion, String direccion, ArrayList<Servicio> servicios, String tiempoCulminacion) {
        super(codigo, descripcion, direccion);
        this.servicios = servicios;
        this.tiempoCulminacion = tiempoCulminacion;
        CompraServicios.compraServicios.add(this);
    }

    public CompraServicios(ArrayList<Servicio> servicios, String tiempoCulminacion) {
        this.servicios = servicios;
        this.tiempoCulminacion = tiempoCulminacion;
        CompraServicios.compraServicios.add(this);
    }

    public static ArrayList<CompraServicios> getCompraServicios() {
        return compraServicios;
    }

    public static void setCompraServicios(ArrayList<CompraServicios> compraServicios) {
        CompraServicios.compraServicios = compraServicios;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getTiempoCulminacion() {
        return tiempoCulminacion;
    }

    public void setTiempoCulminacion(String tiempoCulminacion) {
        this.tiempoCulminacion = tiempoCulminacion;
    }

    public ArrayList<Servicio> agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
        return  this.servicios;
    }

}
