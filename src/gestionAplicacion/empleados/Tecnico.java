package gestionAplicacion.empleados;

import gestionAplicacion.servicios.TipoServicio;

import java.io.Serializable;
import java.util.ArrayList;

public class Tecnico extends Empleado implements Serializable {

    // Atributos
    private int anosExperiencia;
    private int serviciosRealizados;
    private static ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();

    // Atributos de relaciones
    private ArrayList<TipoServicio> tiposDeServicios =  new ArrayList<TipoServicio>();


    // Se cre el método constructor
    public Tecnico(String nombre, int cedula, double sueldo, int numeroContacto, String correo, int anosExperiencia, int serviciosRealizados) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.anosExperiencia = anosExperiencia;
        this.serviciosRealizados = serviciosRealizados;
        Tecnico.tecnicos.add(this);
    }

    // Se establecen los métodos Getters & Setters


    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void setServiciosRealizados(int serviciosRealizados) {
        this.serviciosRealizados = serviciosRealizados;
    }

    public ArrayList<TipoServicio> getTiposDeServicios() {
        return tiposDeServicios;
    }

    public void setTiposDeServicios(ArrayList<TipoServicio> tiposDeServicios) {
        this.tiposDeServicios = tiposDeServicios;
    }

    public static ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public static void setTecnicos(ArrayList<Tecnico> tecnicos) {
        Tecnico.tecnicos = tecnicos;
    }

    @Override
    public double calcularComision() {
        return 0;
    }
}
