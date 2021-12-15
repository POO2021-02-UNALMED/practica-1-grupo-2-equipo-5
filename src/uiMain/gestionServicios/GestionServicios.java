package uiMain.gestionServicios;

import uiMain.gestionProductos.EditaProducto;
import uiMain.gestionProductos.EliminaProducto;
import uiMain.gestionProductos.RegistroProducto;
import uiMain.gestionProductos.VistaProductos;

import java.util.Scanner;

public class GestionServicios {

    public static void GestionarServicios() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Servicios");
            System.out.println(" 2. Crear Servicio");
            System.out.println(" 3. Eliminar Servicio");
            System.out.println(" 4. Editar Servicio");
            System.out.println(" 5. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:  VistaServicio.mostrarServio();
                case 2:  RegistroServicio.regidtarServicios();
                case 3: EditaServicio.menuEditarSercios();
                case 4: break;
            }

        } while (opcion != 5);
    }

}
