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

public class Serializador {

    /*
        Este método es el encargado de serializar las listar que están en cada clase
    */

    private static File rutaTemp = new File("src\\baseDatos\\temp\\");

    public static void serializar() {

        FileOutputStream fos;
        ObjectOutputStream oos;
        File[] docs = rutaTemp.listFiles();
        PrintWriter pw;

        // aca se borra el contenido de los documentos antes de guardar
        for(File f : docs) {
            try{
                pw = new PrintWriter(f);

            }
            catch(FileNotFoundException e){

                e.printStackTrace();

            }

        }

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
        try{
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\producto.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Producto.getProductos());
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
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\productoVendido.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ProductoVendido.getProductosVendidos());
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
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\servicio.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Servicio.getServicios());
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
            fileOut = new FileOutputStream("src\\baseDatos\\temp\\tipoServicio.txt");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(TipoServicio.getTiposDeServicio());
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
