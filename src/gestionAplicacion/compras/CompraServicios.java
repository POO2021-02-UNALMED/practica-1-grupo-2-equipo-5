package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;
import gestionAplicacion.servicios.Servicio;

public class CompraServicios extends Compra implements Serializable {

    private ArrayList<Servicio> servicios = new ArrayList<>();
    private String tiempoCulminacion;

    public CompraServicios(int codigo, String descripcion, String direccion,Cliente cliente, ArrayList<Servicio> servicios, String tiempoCulminacion) {
        super(codigo, descripcion, direccion, cliente);
        this.servicios = servicios;
        this.tiempoCulminacion = tiempoCulminacion;
        Compra.compras.add(this);
    }

    public CompraServicios(ArrayList<Servicio> servicios, String tiempoCulminacion) {
        this.servicios = servicios;
        this.tiempoCulminacion = tiempoCulminacion;
        Compra.compras.add(this);
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

    @Override
    public String toString() {
        return "CompraServicios{" +
                "cliente=" + cliente.getNombre() +
                "\ncodigo='" + codigo + '\'' +
                "\ndescripcion='" + descripcion + '\'' +
                "\ndireccion='" + direccion + '\'' +
                "\nservicios=" + servicios.size() +
                "\ntiempoCulminacion='" + tiempoCulminacion + '\'' +
                '}';
    }
}
