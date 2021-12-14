package uiMain.gestionClientes;

import gestionAplicacion.compras.Cliente;

import java.util.Scanner;

public class VistaClientes {

    /*
        Se crea el método verClientes que lo que hace es recorrrer la lista de Clientes y llamarme al
        método toString() para que imprima por pantalla los datos de cada cliente
    */

    public static void mostrarClientes() {

        Scanner input = new Scanner(System.in);

        // Se imprime la lista de clientes haciendo llamado al método verClientes() de la clase Cliente (CRUD)
        System.out.print(Cliente.verClientes());

        int opcion;

        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(input.nextLine());
        } while (opcion != 1);

    }

}
