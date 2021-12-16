package gestionAplicacion.empleados;

import gestionAplicacion.productos.ProductoVendido;
import gestionAplicacion.servicios.Servicio;
import gestionAplicacion.servicios.TipoServicio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Tecnico extends Empleado implements Serializable {

    /*
        La finalidad de la clase consiste en guardar las datos de los Empleados
        que son Tecnicos
    */

    // Atributos
    private int anosExperiencia;
    private int serviciosRealizados;

    // Atributos de relaciones
    private ArrayList<TipoServicio> tiposDeServicios =  new ArrayList<TipoServicio>();

    // Se cre el método constructor
    public Tecnico(String nombre, String cedula, double sueldo, String numeroContacto, String correo, int anosExperiencia, int serviciosRealizados) {
        super(nombre, cedula, sueldo, numeroContacto, correo);
        this.anosExperiencia = anosExperiencia;
        this.serviciosRealizados = serviciosRealizados;
    }

    // Se agrega el método toString() para mostrar todos los datos de los empleados
    @Override
    public String toString() {
        return "Tecnico : {" +
                "Nombre='" + super.getNombre() + '\'' +
                ", Cedula=" + super.getCedula() +
                ", Sueldo=" + super.getSueldo() +
                ", Comision=" + super.getComision() +
                ", Numero de Contacto=" + super.getNumeroContacto() +
                ", Correo='" + super.getCorreo() +
                ", Años de Experiencia=" + anosExperiencia +
                ", servicios Realizados=" + serviciosRealizados +
                '}';
    }

    // Se establecen los métodos Getters & Setters
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void setServiciosRealizados(int serviciosRealizados) {
        this.serviciosRealizados = serviciosRealizados;
    }

    public ArrayList<TipoServicio> getTiposDeServicios() {
        return tiposDeServicios;
    }

    public void setTiposDeServicios(ArrayList<TipoServicio> tiposDeServicios) {
        this.tiposDeServicios = tiposDeServicios;
    }

    /*
        El metodo calcular comision, devuelve la comison de todos los servicios realizados
        por el técnico
    */

    @Override
    public double calcularComision() {

        double comisionTotal = 0;

        for (TipoServicio tipoServicio : tiposDeServicios) {
            for (Servicio servicio : tipoServicio.getServicios()) {
                comisionTotal += servicio.getPrecio()*COMISION;
            }
        }
        this.setComision(comisionTotal);
        return comisionTotal;
    }

    /*
        Método para obtener el mejor tecnico, se basa en recorrer la lista de tecnicos y encontrar los que más servicios
        hayan realizado, se hace con la finalidad de implementar la funcionalidad de generar el informe de
        la tienda, no recibe parámetros y retorna un String
     */
    public static String mejorTecnico() {
        String mejorTecnico = "";

        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();

        for (Empleado empleado : Empleado.getEmpleados()) {
            if (empleado instanceof Tecnico) {
                ((Tecnico) empleado).getServiciosRealizados();
                tecnicos.add(((Tecnico) empleado));
            }
        }

        Tecnico tecnicoConMasServicios = tecnicos.get(0);
        double serviciosHechos = tecnicos.get(0).serviciosRealizados;
        for (Tecnico tecnico : tecnicos) {
            if (tecnico.serviciosRealizados > serviciosHechos) {
                serviciosHechos = tecnico.serviciosRealizados;
                tecnicoConMasServicios = tecnico;
            }
        }

        assert tecnicoConMasServicios != null;
        return tecnicoConMasServicios.getNombre();
    }


}
