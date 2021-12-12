package baseDatos;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.CompraProductos;

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
    }
}
