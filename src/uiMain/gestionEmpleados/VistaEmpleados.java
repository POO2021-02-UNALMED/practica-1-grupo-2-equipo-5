package uiMain.gestionEmpleados;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.empleados.Empleado;

import java.util.Scanner;

public class VistaEmpleados {

    /*
        Se crea el método verEmpleados que lo que hace es recorrrer la lista de empleados
         de la clase Empleado y luego se llama al método toString() para que imprima por pantalla
         los datos de cada empleado
    */

    public static void mostrarEmpleados() {

        Scanner input = new Scanner(System.in);

        // Se imprime la lista de clientes haciendo llamado al método verClientes() de la clase Cliente (CRUD)
        System.out.print(Empleado.verEmpleados());

        int opcion;

        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(input.nextLine());
        } while (opcion != 1);

    }

}
