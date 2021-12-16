package gestionAplicacion.compras;

import gestionAplicacion.productos.ProductoVendido;
import gestionAplicacion.servicios.Servicio;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable, Comparable<Cliente> {

    /*
        La finalidad de la clase consiste en guardar los datos de los
        clientes, que es de alto interes para el administrador de la
        tienda.
    */

    // El Array de clase de clientes de encarga de guardar todas las instancias de
    // Cliente para poder guardar y cargarlas en la serializacion
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    // Atributos (Encapsulamiento con atributos de visibilidad private)
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private double gastos;
    private String fechaNacimiento;

    // Relacion que tiene el cliente con sus compras
    private ArrayList<Compra> compras = new ArrayList<>();


    //Constructor
    public Cliente(String cedula, String nombre, String direccion, String telefono, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        clientes.add(this);
    }
    @Override
    public int compareTo(Cliente cliente) {
        if (this.gastos > cliente.gastos) {
            return 1;
        } else if (this.gastos < cliente.gastos) {
            return -1;
        } else {
            return 0;
        }
    }

    // Se agrega el método toString() para mostrar todos los datos de los clientes
    @Override
    public String toString() {
        return "Cliente : {" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", gastos=" + gastos +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    // Se agregan lo métodos Getters & Setters
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(ArrayList<Cliente> clientes) {
        Cliente.clientes = clientes;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    /*
        En los siguentes tres métodos se evidencia sobrecarga de métodos, teneindo en cuenta que en el arreglo de compras
        del cliente, estas pueden ser de tipo ConpraServicios y CompraProductos
    */
    public String agregarCompra(CompraServicios compraServicios){
        this.compras.add(compraServicios);
        return  "Se agrego la compra exitosamente";
    }

    public String agregarCompra(CompraProductos compraProductos){
        this.compras.add(compraProductos);
        return  "Se agrego la compra exitosamente";
    }

    // En este metodo se calculan los gastos totales del cliente en todas sus compras
    public double calcularGastos() {

        double gastos = 0;

        for(Compra compra : compras) {
            if (compra instanceof CompraProductos) {
                // Ligadura dinámica en tiempo de ejecución
                for (ProductoVendido producto : ((CompraProductos) compra).getProductos()) {
                    gastos += producto.getPrecioVenta();
                }
            }
            else if (compra instanceof CompraServicios) {
                // Ligadura dinámica en tiempo de ejecución
                for (Servicio servicio : ((CompraServicios) compra).getServicios()) {
                    gastos += servicio.getPrecio();
                }
            }
        }

        this.setGastos(gastos);

        return gastos;
    }

    // Metodos que hacen parte del CRUD

    /*
        El método verClientes() retorna una cadena de texto con todas las descripciones de los clientes creados
        o que estén en el sistema
    */

    public static String verClientes() {
        String resultado = "";

        for (int i = 0; i < clientes.size(); i++) {
            resultado += (i+1) + ". " + clientes.get(i) + "\n";
        }

        return resultado;
    }

    /*
        El método eliminarCliente() recibe por parámetro un empleado a eliminar de la lista de clientes
    */

    public static void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

}
