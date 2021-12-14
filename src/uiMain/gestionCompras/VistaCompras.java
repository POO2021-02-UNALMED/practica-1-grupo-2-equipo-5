package uiMain.gestionCompras;

import gestionAplicacion.compras.Compra;

import java.util.Scanner;

public class VistaCompras {

    public static void verCompras() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Compras de Productos");
            System.out.println(" 2. Ver Compras de Servicios");
            System.out.println(" 3. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: System.out.println(Compra.verComprasProductos()); break;
                case 2: System.out.println(Compra.verComprasServicios()); break;
                case 3: break;
            }

        } while (opcion != 3);
    }

}
