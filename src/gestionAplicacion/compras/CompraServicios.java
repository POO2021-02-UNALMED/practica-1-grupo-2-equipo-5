package gestionAplicacion.compras;

import java.io.Serializable;
import java.util.ArrayList;
import gestionAplicacion.servicios.Servicio;

public class CompraServicios extends Compra implements Serializable {

    /*
        La finalidad de esta clase consiste en guardar los datos de las compras
        que son solo de servicios que se hacen en la tienda.
    */

    // El array de servicios hace referencia a la relacion con los servicios
    // realizados que hacen parte de la compra
    private ArrayList<Servicio> servicios = new ArrayList<>();

    // Atributos (Encapsulamiento con atributos de visibilidad private)
    private String tiempoCulminacion;

    // Constructor
    public CompraServicios(int codigo, String descripcion, String direccion,Cliente cliente, String tiempoCulminacion) {
        super(codigo, descripcion, direccion, cliente);
        this.tiempoCulminacion = tiempoCulminacion;
        Compra.compras.add(this);
    }

    // Se agregan lo métodos Getters & Setters
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getTiempoCulminacion() {
        return tiempoCulminacion;
    }

    public void setTiempoCulminacion(String tiempoCulminacion) {
        this.tiempoCulminacion = tiempoCulminacion;
    }

    // metodo para agragar servicios a la compra
    public String agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
        return  "El servicio se agregó correctamente a la compra";
    }

    // Se agrega el método toString() para mostrar todos los datos
    @Override
    public String toString() {
        return "CompraServicios{" +
                "cliente=" + cliente.getNombre() +
                "\ncodigo='" + codigo + '\'' +
                "\ndescripcion='" + descripcion + '\'' +
                "\ndireccion='" + direccion + '\'' +
                "\nservicios=" + servicios.size() +
                "\ntiempoCulminacion='" + tiempoCulminacion + '\'' +
                '}';
    }
}
