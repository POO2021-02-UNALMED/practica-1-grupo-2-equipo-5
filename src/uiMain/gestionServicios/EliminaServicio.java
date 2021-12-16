package uiMain.gestionServicios;

import gestionAplicacion.productos.Producto;
import gestionAplicacion.servicios.Servicio;

import java.util.Scanner;

public class EliminaServicio {

    public static void eliminarServicio() {
        Scanner input = new Scanner(System.in);
        
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo del servicio a eliminar : ");
            codigo = input.nextInt();

            boolean eliminado = Servicio.eliminarServicio(codigo);
            if (!eliminado ) {
                System.out.println("Ese servicio no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Servicio eliminada exitosamente!");
                break;
            }
        }

    }

}
