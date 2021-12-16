package uiMain.funcionalidades;

import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;
import gestionAplicacion.servicios.Servicio;
import gestionAplicacion.servicios.TipoServicio;

import java.util.*;

public class GestionarInvetario {
    public static Scanner input = new Scanner(System.in);
    public static  void funcionalidad(){
        int opcion;
        do {
            System.out.println("¿Que quieres Hacer?");
            System.out.println(" 1. Lista de tipo productos vendidos");
            System.out.println(" 2. Obtener servicio más vendido");
            System.out.println(" 3. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    obtenerTipoProductos()
                    ; break;
                case 2:
                    obtenerServicios();
                    break;
                case 3: break;
            }

        } while (opcion != 3);

    }
    public static void  obtenerTipoProductos(){
        //Obtiene y cuenta todos los tipos producto del inventario

        ArrayList<ProductoVendido> productosVendidos = ProductoVendido.getProductosVendidos();
        //Se va utilizar un hastable, para ir contando cuales es el tipo de producto mas vendido.
        HashMap<Producto.tipo_producto, Integer> totalProductos = new HashMap<Producto.tipo_producto, Integer>();
        Producto.tipo_producto tipo_producto = null;

        //Se recorre todos los productos para sacar el tipo de producto para hacer la contabilidad.
        for(ProductoVendido productoVendido: productosVendidos){
            tipo_producto = productoVendido.getProducto().getTipo();
            //En caso de no existir en la HashTable, lo agrega
            if (!totalProductos.containsKey(tipo_producto)){
                totalProductos.put(tipo_producto, 1);
            }
            //En caso de encontrar uno ya encontrado, se agrega a la HashTable y se le suma 1.
            else{
                int cantidad_antigua = totalProductos.get(tipo_producto);
                cantidad_antigua++;
                totalProductos.put(tipo_producto, cantidad_antigua);
            }
        }
        //Se le muestra al usuario los tipos vendiddos.
        System.out.println("Aqui Todos los tipos vendidos.");
        //Se muestra todos los tipos  de producto que se encontró.
        for (Producto.tipo_producto tipo : totalProductos.keySet()) {
            System.out.println("Tipo de producto: "+ tipo + " tiene: " + totalProductos.get(tipo));
        }
    }
    public static void obtenerServicios(){
        //Aqui es para obtener el mayor servicio solicitado.
        //Hacemos algo similar que obtenerTipo

        ArrayList<Servicio> servicios = Servicio.getServicios();

        //Creamos una hashTable para llevar la contabilidad del servicio más vendido.

        Hashtable<TipoServicio, Integer> hashServicios = new Hashtable<TipoServicio, Integer>();


        //Recorremos todos los servicos.
        TipoServicio tipoServicio = null;
        for(Servicio servicio: servicios){
            tipoServicio = servicio.getTipoServicio();

            if(!hashServicios.containsKey(tipoServicio)){
                hashServicios.put(tipoServicio,1);
            }
            else {
                int cantidad_antigua = hashServicios.get(tipoServicio);
                cantidad_antigua++;
                hashServicios.put(tipoServicio, cantidad_antigua);
            }
        }

        //Aqui obtenemos el que más servicios
        //Primero, incializamos con un valor, hasta obtner el mayor de todos.
        TipoServicio tipo_mayor = servicios.get(0).getTipoServicio();
        int cantidad_mayor = hashServicios.get(tipoServicio);

        //Recorremos hasta que encontramosel que más tiene
        for(TipoServicio servicio: hashServicios.keySet()){
            if(hashServicios.get(servicio)> cantidad_mayor){
                cantidad_mayor = hashServicios.get(servicio);
                tipo_mayor = servicio;
            }
        }

        System.out.println("El servicio que más solicitado es: ");
        System.out.println(tipo_mayor);
        System.out.println("Con "+ cantidad_mayor);
    }
}
