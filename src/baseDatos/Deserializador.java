package baseDatos;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.CompraProductos;

import java.io.*;
import java.util.ArrayList;

public class Deserializador {

    private static File rutaTemp = new File("src\\baseDatos\\temp\\");

    /*
        Este método es el encargado de deserializar las listas que están en cada clase
    */

    public static void deserializar() {

        File[] docs = rutaTemp.listFiles();
        FileInputStream fis;
        ObjectInputStream ois;

        for (File file : docs) {
            if (file.getAbsolutePath().contains("clientes")) {
                try {
                    
                    fis = new FileInputStream(file);
                    ois = new ObjectInputStream(fis);

                    /*
                        Lo que hacemos acá es leer el archivo txt de clientes y haciendo un casteo, volvemos a
                        colocar todos los clientes en el arreglo de la clase, con su método set
                    */

                    Cliente.setClientes((ArrayList<Cliente>) ois.readObject());
                    
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
            else if (file.getAbsolutePath().contains("comprasProductos")) {
                try {
                   
                    fis = new FileInputStream(file);
                    ois = new ObjectInputStream(fis);

                    /*
                        Lo que hacemos acá es leer el archivo txt de compraProductos y haciendo un casteo, volvemos a
                        colocar todas las comprasProductos en el arreglo de la clase, con su método set
                    */

                    CompraProductos.setComprasProducto((ArrayList<CompraProductos>) ois.readObject());
                    
                }

                catch (FileNotFoundException e) {
                    
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
    }
}
