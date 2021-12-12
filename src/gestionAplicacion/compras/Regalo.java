package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;

public class Regalo extends Compra implements Serializable {
    private double precio;
    private String descripcion;
    private Cliente clienteRecibe;
    private static ArrayList<Regalo> regalos = new ArrayList<>();

    public Regalo(String codigo, String descripcion, String direccion, double precio, String descripcion1, Cliente clienteRecibe) {
        super(codigo, descripcion, direccion);
        this.precio = precio;
        this.descripcion = descripcion1;
        this.clienteRecibe = clienteRecibe;
        Regalo.regalos.add(this);
    }

    public Regalo(double precio, String descripcion, Cliente clienteRecibe) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.clienteRecibe = clienteRecibe;
        Regalo.regalos.add(this);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getClienteRecibe() {
        return clienteRecibe;
    }

    public void setClienteRecibe(Cliente clienteRecibe) {
        this.clienteRecibe = clienteRecibe;
    }

    public static ArrayList<Regalo> getRegalos() {
        return regalos;
    }

    public static void setRegalos(ArrayList<Regalo> regalos) {
        Regalo.regalos = regalos;
    }


}
