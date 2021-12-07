package gestionAplicacion.empleados;

import java.io.Serializable;

public abstract class Empleado implements Serializable {

    // Atributos
    private String nombre;
    private int cedula;
    private double sueldo;
    private double comision;
    private int numeroContacto;
    private String correo;

    // Se crea el constructor para los Empleados

    public Empleado(String nombre, int cedula, double sueldo, int numeroContacto, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    // Se establecen los métodos Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public abstract double calcularComision();

}
