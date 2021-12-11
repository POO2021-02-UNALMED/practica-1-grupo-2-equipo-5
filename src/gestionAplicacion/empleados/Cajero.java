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
    public Cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
        Empleado.getEmpleados().add(this);
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