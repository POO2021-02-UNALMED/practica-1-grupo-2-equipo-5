package baseDatos;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.CompraProductos;

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
    }
}

