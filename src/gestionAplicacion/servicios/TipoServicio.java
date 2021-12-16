package gestionAplicacion.servicios;

import gestionAplicacion.empleados.Tecnico;

import java.io.Serializable;
import java.util.ArrayList;

public class TipoServicio implements Serializable {

    /*
        La finalidad de esta clase es clasificar los diferentes tipos de servicio que puede
        hacer un tecnico.
    */

    // El Array de clase de tipoDeServicio se encarga de guardar todas las instancias de
    // TipoServicio para poder guardar y cargarlas en la serializacion
    private static ArrayList<TipoServicio> tiposDeServicio = new ArrayList<TipoServicio>();

    //Atributos
    private String nombre;
    private Tecnico tecnico;

    // Atributo que proviene de la relacion con servicios
    private ArrayList<Servicio> servicios = new ArrayList<>();

    // Se cre el método constructor
    public TipoServicio(String nombre, Tecnico tecnico) {
        this.nombre = nombre;
        this.tecnico = tecnico;
        tiposDeServicio.add(this);
    }

    // metodo para agragar servicios a la compra
    public String agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
        return  "El servicio se agregó correctamente al tipo de Servicio";
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

    @Override
    public String toString() {
        return "TipoServicio{" +
                "nombre='" + nombre + '\'' +
                ", tecnico=" + tecnico +
                '}';
    }

}
