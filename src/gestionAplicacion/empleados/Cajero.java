package gestionAplicacion.empleados;

import gestionAplicacion.productos.ProductoVendido;

import java.util.ArrayList;

public class Cajero extends Empleado{
    private double cantidadEnVentas;
    private ArrayList<ProductoVendido> productosVendidos;
    private ArrayList<Cajero> cajeros;

    // Se cre el método constructor

    public Cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
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

    public ArrayList<Cajero> getCajeros() {
        return cajeros;
    }

    public void setCajeros(ArrayList<Cajero> cajeros) {
        this.cajeros = cajeros;
    }
}