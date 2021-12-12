package gestionAplicacion.empleados;

import gestionAplicacion.productos.ProductoVendido;

import java.io.Serializable;
import java.util.ArrayList;

public class Cajero extends Empleado implements Serializable {

    // Atributos
    private double cantidadEnVentas;

    // Atributos de relaciones
    private ArrayList<ProductoVendido> productosVendidos = new ArrayList<ProductoVendido>();


    // Se cre el método constructor
    public Cajero(String nombre, String cedula, double sueldo, String numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
        Empleado.getEmpleados().add(this);
    }

    // Se agrega el método toString() para mostrar todos los datos de los empleados

    @Override
    public String toString() {
        return "Cajero : {" +
                "Nombre='" + super.getNombre() + '\'' +
                ", Cedula=" + super.getCedula() +
                ", Sueldo=" + super.getSueldo() +
                ", Comision=" + super.getComision() +
                ", Numero de Contacto=" + super.getNumeroContacto() +
                ", Correo='" + super.getCorreo() +
                ", Cantidad En Ventas=" + cantidadEnVentas +
                '}';
    }


    // Se establecen los métodos Getters & Setters

    public double getCantidadEnVentas() {
        return cantidadEnVentas;
    }

    public void setCantidadEnVentas(double cantidadEnVentas) {
        this.cantidadEnVentas = cantidadEnVentas;
    }

    public ArrayList<ProductoVendido> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<ProductoVendido> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    @Override
    public double calcularComision() {
        return 0;
    }
}