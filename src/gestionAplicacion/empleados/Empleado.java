package gestionAplicacion.empleados;

import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.compras.CompraServicios;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Empleado implements Serializable {

    /*
        La finalidad de esta clase consiste en guardar los datos de los empleados
        de la empresa, discriminado en sus diferentes papeles dentro de ella
    */

    // El Array de clase de empleados se encarga de guardar todas las instancias de
    // Empleado para poder guardar y cargarlas en la serializacion
    private static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    // Uso de constante
    protected static final double COMISION = 0.5;

    // Atributos (Encapsulamiento con atributos de visibilidad private)
    private String nombre;
    private String cedula;
    private double sueldo;
    private double comision;
    private String numeroContacto;
    private String correo;


    //Constructor
    public Empleado(String nombre, String cedula, double sueldo, String numeroContacto, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
        empleados.add(this);
    }

    // Se agrega el método toString() para mostrar todos los datos de los empleados
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

    public static ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public static void setEmpleados(ArrayList<Empleado> empleados) {
        Empleado.empleados = empleados;
    }

    //Uso de método abstracto
    public abstract double calcularComision();

    // Obtener gastos en pagos a empleados  hace parte de la funcionalidad utilidad
    public static double obtenerGastosEnPagosAEmpleados() {
        double gastos = 0;

        for (Empleado empleado : empleados) {
            // El método calcularComision se resulve por ligadura dinamica
            gastos += empleado.sueldo + empleado.calcularComision();
        }

        return gastos;
    }

    // Metodos que hacen parte del CRUD

    /*
        El método verEmpleados() retorna una cadena de texto con todas las descripciones de los empleados creados
        o que estén en el sistema
    */

    public static String verEmpleados() {
        String resultado = "";

        for (int i = 0; i < empleados.size(); i++) {
            resultado += (i+1) + ". " + empleados.get(i) + "\n";
        }

        return resultado;
    }

    /*
        El método agregarEmpleado() recibe por parámetro un empleado para añadir a la lista de empleados
    */

    public static void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /*
        El método eliminarEmpleado() recibe por parámetro un empleado a eliminar de la lista de empleados
    */

    public static void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }


}
