package baseDatos;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;
import gestionAplicacion.servicios.Servicio;
import gestionAplicacion.servicios.TipoServicio;

import java.io.*;
import java.util.ArrayList;

public class Deserializador {

    /*
        Este método es el encargado de deserializar las listas que están en cada clase
    */

    public static void deserializar() {

        FileInputStream fileIn;
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\clientes.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Cliente> clientes;

            clientes = (ArrayList<Cliente>) in.readObject();

            Cliente.setClientes(clientes);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\compras.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Compra> compras;

            compras = (ArrayList<Compra>) in.readObject();

            Compra.setCompras(compras);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\empleados.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Empleado> empleados;

            empleados = (ArrayList<Empleado>) in.readObject();

            Empleado.setEmpleados(empleados);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\inventario.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Producto> inventario;

            inventario = (ArrayList<Producto>) in.readObject();

            Producto.setInventario(inventario);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\producto.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Producto> producto;

            producto = (ArrayList<Producto>) in.readObject();

            Producto.setProductos(producto);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\productoVendido.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<ProductoVendido> productoVendidos;

            productoVendidos = (ArrayList<ProductoVendido>) in.readObject();

            ProductoVendido.setProductosVendidos(productoVendidos);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\servicio.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Servicio> servicios;

            servicios = (ArrayList<Servicio>) in.readObject();

            Servicio.setServicios(servicios);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            fileIn = new FileInputStream("src\\baseDatos\\temp\\tipoServicio.txt");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<TipoServicio> tipoServicios;

            tipoServicios = (ArrayList<TipoServicio>) in.readObject();

            TipoServicio.setTiposDeServicio(tipoServicios);

            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
}

