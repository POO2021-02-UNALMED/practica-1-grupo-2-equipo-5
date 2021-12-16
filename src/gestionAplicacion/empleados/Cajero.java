package gestionAplicacion.empleados;

import gestionAplicacion.productos.ProductoVendido;

import java.io.Serializable;
import java.util.ArrayList;

public class Cajero extends Empleado implements Serializable {

    /*
        La finalidad de la clase consiste en guardar las datos de los Empleados
        que son Cajeros
    */

    // Atributos
    private double cantidadEnVentas;

    // Atributos de relaciones
    private ArrayList<ProductoVendido> productosVendidos = new ArrayList<ProductoVendido>();


    // Se cre el método constructor
    public Cajero(String nombre, String cedula, double sueldo, String numeroContacto, String correo) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
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

    // Se calcula la comision respectiva a los cajeros, dependiendo de la
    // cantidad de productos vendidos por ellos
    @Override
    public double calcularComision() {

        double comisionTotal = 0;

        for (ProductoVendido productoVendido : productosVendidos) {
            comisionTotal += productoVendido.getPrecioVenta()*COMISION;
        }

        this.setComision(comisionTotal);
        return comisionTotal;
    }

    public void agregarAProductosVendidos(ProductoVendido vendido) {
        productosVendidos.add(vendido);
    }

}
