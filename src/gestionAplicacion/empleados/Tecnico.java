package gestionAplicacion.empleados;

import gestionAplicacion.servicios.TipoServicio;

import java.util.ArrayList;

public class Tecnico extends Empleado {
    private int anosExperiencia;
    private int serviciosRealizados;
    private ArrayList<TipoServicio> tiposDeServicios;
    private ArrayList<Tecnico> tecnicos;

    // Se cre el método constructor

    public Tecnico(String nombre, int cedula, double sueldo, int numeroContacto, String correo, int anosExperiencia, int serviciosRealizados) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.anosExperiencia = anosExperiencia;
        this.serviciosRealizados = serviciosRealizados;
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

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

}
