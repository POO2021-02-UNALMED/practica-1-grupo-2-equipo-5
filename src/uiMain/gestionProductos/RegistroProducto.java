package uiMain.gestionProductos;

import gestionAplicacion.productos.Producto;

import java.util.Scanner;
public class RegistroProducto {

    public static void regidtarProducto() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = input.nextLine();

        System.out.print("Codigo: ");
        int codigo  = input.nextInt();

        System.out.print("Precio: ");
        double precio  = input.nextDouble();

        System.out.println("Ingrese el tipo del producto, marcando el número asociado: ");
        System.out.println("1: COMPUTADORES_PERSONALES");
        System.out.println("2: PERIFERICOS");
        System.out.println("3: CONSOLAS_DE_VIDEOJUEGOS");
        System.out.println("4: ACCESORIOS");
        System.out.println("5: COMBOS");
        System.out.println("6: COMPONENTES");
        System.out.println("7: DRONES");
        System.out.print("Indique su eleccion : ");
        int id_tipo = input.nextInt();
        Producto.tipo_producto tipo = null;
        switch (id_tipo){
            case 1: tipo = Producto.tipo_producto.COMPUTADORES_PERSONALES;
            case 2: tipo = Producto.tipo_producto.PERIFERICOS;
            case 3: tipo = Producto.tipo_producto.CONSOLAS_DE_VIDEOJUEGOS;
            case 4: tipo = Producto.tipo_producto.ACCESORIOS;
            case 5: tipo = Producto.tipo_producto.COMBOS;
            case 6: tipo = Producto.tipo_producto.COMPONENTES;
            case 7: tipo = Producto.tipo_producto.DRONES;
        }

        Producto producto = new Producto(codigo, nombre, tipo, precio);

    }

}
