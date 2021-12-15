package uiMain.gestionProductos;

import java.util.Scanner;

public class GestionProductos {

    public static void GestionarProductos() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Productos");
            System.out.println(" 2. Crear Producto");
            System.out.println(" 3. Eliminar Producto");
            System.out.println(" 4. Editar Producto");
            System.out.println(" 5. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: ; VistaProductos.mostrarProductos();
                case 2: ; RegistroProducto.regidtarProducto();
                case 3: ; EliminaProducto.mostarMenuEliminarProducto();
                case 4: ; EditaProducto.menuEditarProducto();
                case 5: break;
            }

        } while (opcion != 5);
    }

}
