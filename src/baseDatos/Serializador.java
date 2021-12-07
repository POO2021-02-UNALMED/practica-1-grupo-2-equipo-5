package baseDatos;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.CompraProductos;

import java.io.*;

public class Serializador {

    private static File rutaTemp = new File("src\\baseDatos\\temp\\");

    /*
        Este método es el encargado de serializar las listar que están en cada clase
    */

    public static void serializar() {

        FileOutputStream fos;
        ObjectOutputStream oos;
        File[] docs = rutaTemp.listFiles();
        PrintWriter pw;

        /*
            Este for borra el contenido de los archivbos al momento de guardar los objetos para
            evitar que hayaredundancia en los archivos y futuras compilacionespara buscar.
        */

        for(File f : docs) {

            try{

                /*
                    Al crear este objeto PrintWtier y pasarle como párametro la ruta de cada
                    archivo, borra lo que hay en ellos automáticamente
                */

                pw = new PrintWriter(f);

            }
            catch(FileNotFoundException e){

                e.printStackTrace();

            }

        }

        for (File file : docs) {

            if (file.getAbsolutePath().contains("clientes")) {

                try {

                    fos = new FileOutputStream(file);
                    oos = new ObjectOutputStream(fos);

                    oos.writeObject(Cliente.getClientes());

                } catch (FileNotFoundException e) {

                    e.printStackTrace();

                } catch (IOException e) {

                    e.printStackTrace();

                }
            } else if (file.getAbsolutePath().contains("comprasProductos")) {

                try {

                    fos = new FileOutputStream(file);
                    oos = new ObjectOutputStream(fos);

                    oos.writeObject(CompraProductos.getComprasProducto());

                } catch (FileNotFoundException e) {

                    e.printStackTrace();

                } catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }
    }
}
