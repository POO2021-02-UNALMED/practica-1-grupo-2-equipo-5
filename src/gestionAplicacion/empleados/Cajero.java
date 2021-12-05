package gestionAplicacion.empleados;

import gestionAplicacion.productos.ProductoVendido;

import java.util.ArrayList;

public class Cajero extends Empleado{

    // Atributos
    private double cantidadEnVentas;
    private static ArrayList<Cajero> cajeros = new ArrayList<Cajero>();

    // Atributos de relaciones
    private ArrayList<ProductoVendido> productosVendidos = new ArrayList<ProductoVendido>();


    // Se cre el método constructor
    public Cajero(String nombre, int cedula, double sueldo, int numeroContacto, String correo, double cantidadEnVentas) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.cantidadEnVentas = cantidadEnVentas;
        Cajero.cajeros.add(this);
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

    public static ArrayList<Cajero> getCajeros() {
        return cajeros;
    }

    public static void setCajeros(ArrayList<Cajero> cajeros) {
        Cajero.cajeros = cajeros;
    }
}