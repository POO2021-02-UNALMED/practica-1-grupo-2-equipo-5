package gestionAplicacion.compras;



import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable {

    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    private double gastos;
    private String fechaNacimiento;

    private ArrayList<Compra> compras = new ArrayList<>();
    private ArrayList<Regalo> regalos = new ArrayList<>();

    public Cliente(String cedula, String nombre, String direccion, String telefono, double gastos, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.gastos = gastos;
        this.fechaNacimiento = fechaNacimiento;
        Cliente.clientes.add(this);
    }

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

    public ArrayList<Regalo> getRegalos() {
        return regalos;
    }

    public void setRegalos(ArrayList<Regalo> regalos) {
        this.regalos = regalos;
    }

    /*
        En los siguentes tres métodos se evidencia sobrecarga de métodos, teneindo en cuenta que en el arreglo de compras
        del cliente, estas pueden ser de tipo ConpraServicios y CompraProductos
    */

    public ArrayList<Compra> agregarCompra(Compra compra){
         this.compras.add(compra);
         return  this.compras;
    }

    public ArrayList<Compra> agregarCompra(CompraServicios compraServicios){
        this.compras.add(compraServicios);
        return  this.compras;
    }

    public ArrayList<Compra> agregarCompra(CompraProductos compraProductos){
        this.compras.add(compraProductos);
        return  this.compras;
    }

    /*
        Al agragar un regalo, tambies es necesario, hacerle set a este regalo del cliente que lo está regalando y
        el cliente que lo recibe
    */

    public ArrayList<Regalo> agregarRegalo(Regalo regalo, Cliente clienteRecibe){
        regalo.setClienteRegala(this);
        regalo.setClienteRecibe(clienteRecibe);
        this.regalos.add(regalo);
        return this.regalos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
