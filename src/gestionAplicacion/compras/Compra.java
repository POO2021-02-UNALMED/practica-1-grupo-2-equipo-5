package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;

public class Compra implements Serializable {
    protected String codigo;
    protected  String descripcion;
    protected String direccion;

    public Compra(String codigo, String descripcion, String direccion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;

    }

    public Compra() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String desprcicion) {
        this.descripcion = desprcicion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
