package uiMain.gestionServicios;

import gestionAplicacion.productos.Producto;
import gestionAplicacion.servicios.Servicio;

import java.util.Scanner;

public class EditaServicio {
    public static void menuEditarSercio() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo del servicio a editar : ");
            codigo = input.nextInt();

            Servicio servicio = Servicio.buscarServicio(codigo);

            if (servicio == null) {
                System.out.println("Ese servicio no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Servicio encontrado!");
                System.out.println(servicio);
                System.out.println("");
                input = new Scanner(System.in);
                int opcion;
                do {
                    System.out.println("¿Que desea hacer?");
                    System.out.println(" 1. Editar descripcion");
                    System.out.println(" 2. Editar precio");
                    System.out.println(" 3. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el nuevo descripcion : ");
                            servicio.setDescripcion(input.next());
                            System.out.println(servicio); break;
                        case 2:
                            System.out.print("Ingrese el nuevo producto : ");
                            servicio.setPrecio(input.nextDouble());
                            System.out.println(servicio); break;
                        case 3: break;
                    }

                } while (opcion != 3);
                break;
            }
        }
    }
}
