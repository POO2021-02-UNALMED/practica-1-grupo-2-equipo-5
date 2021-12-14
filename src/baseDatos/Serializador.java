package baseDatos;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.productos.Producto;

import java.io.*;

public class Serializador {

    /*
        Este método es el encargado de serializar las listar que están en cada clase
    */

    public static void serializar() {

        FileOutputStream fileOut;
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\clientes.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Cliente.getClientes());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\compras.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Compra.getCompras());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\empleados.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Empleado.getEmpleados());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\empleados.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Empleado.getEmpleados());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\inventario.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(Producto.getInventario());
            out.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }
}
