package gestionAplicacion.empleados;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Empleado implements Serializable {

    // Atributos
    private String nombre;
    private String cedula;
    private double sueldo;
    private double comision;
    private String numeroContacto;
    private String correo;
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    // Se crea el constructor para los Empleados
    public Empleado(String nombre, String cedula, double sueldo, String numeroContacto, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
    }

    // Se agrega el método toString() para mostrar todos los datos de los empleados

    // Obtener gastos en pagos a empleados  (IMPLEMENTAR ESTEMÉTODO)  hace parte de la funcionalidad utilidad

    @Override
    public abstract String toString();


    // Se establecen los métodos Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public abstract double calcularComision();

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(ArrayList<Empleado> empleados) {
        Empleado.empleados = empleados;
    }

}
