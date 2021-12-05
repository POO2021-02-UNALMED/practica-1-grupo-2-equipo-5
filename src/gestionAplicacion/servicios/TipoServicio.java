package gestionAplicacion.servicios;

import gestionAplicacion.empleados.Tecnico;

import java.util.ArrayList;

public class TipoServicio {

    //Atributos
    private String nombre;
    private Tecnico tecnico;
    private ArrayList<Servicio> servicios;
    private static ArrayList<TipoServicio> tiposDeServicio = new ArrayList<TipoServicio>();

    // Se cre el método constructor

    public TipoServicio(String nombre, Tecnico tecnico) {
        this.nombre = nombre;
        this.tecnico = tecnico;
        TipoServicio.tiposDeServicio.add(this);
    }

    // Se establecen los métodos Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public static ArrayList<TipoServicio> getTiposDeServicio() {
        return tiposDeServicio;
    }

    public static void setTiposDeServicio(ArrayList<TipoServicio> tiposDeServicio) {
        TipoServicio.tiposDeServicio = tiposDeServicio;
    }
}
