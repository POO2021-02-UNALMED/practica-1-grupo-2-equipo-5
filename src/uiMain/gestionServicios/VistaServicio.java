package uiMain.gestionServicios;

import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;

import java.util.Scanner;

public class VistaServicio {
    public static void mostrarServio(){
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Productos");
            System.out.println(" 2. Ver Productos Vendidos");
            System.out.println(" 3. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = Integer.parseInt(input.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println(Producto.verProductos());
                    break;
                case 2:
                    System.out.println(ProductoVendido.verProductos());
                    break;
                case 3:
                    break;
            }

        } while (opcion != 3);
    }
}
