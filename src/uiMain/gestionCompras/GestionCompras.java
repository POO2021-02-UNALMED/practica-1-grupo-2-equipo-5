package uiMain.gestionCompras;

import java.util.Scanner;

public class GestionCompras {

    public static void GestionarCompra() {

        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Compras");
            System.out.println(" 2. Crear Compra");
            System.out.println(" 3. Eliminar Compra");
            System.out.println(" 4. Editar Compra");
            System.out.println(" 5. Devolucion de Compra");   // Funcionalidad interesante 3
            System.out.println(" 6. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: VistaCompras.verCompras(); break;
                case 2: ; break;
                case 3: EliminaCompra.mostrarMenuEliminarCompra(); break;
                case 4: EditaCompra.menuEditarCompra(); break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);

    }

}


