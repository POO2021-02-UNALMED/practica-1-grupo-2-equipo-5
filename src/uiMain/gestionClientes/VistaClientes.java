package uiMain.gestionClientes;

import gestionAplicacion.compras.Cliente;

import java.util.Scanner;

public class VistaClientes {

    /*
        Se crea el método verClientes que lo que hace es recorrrer la lista de Clientes y llamarme al
        método toString() para que imprima por pantalla los datos de cada cliente
    */

    public static void verClientes() {

        Scanner input = new Scanner(System.in);

        for (Cliente cliente : Cliente.getClientes()) {
            System.out.println(cliente);
        }

        int opcion;

        do {
            System.out.print("1. Regresar : ");
            opcion = input.nextInt();
            input.nextLine();
        } while (opcion != 1);

    }

}
