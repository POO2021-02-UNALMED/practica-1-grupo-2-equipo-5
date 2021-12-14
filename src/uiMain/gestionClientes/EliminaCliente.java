package uiMain.gestionClientes;

import gestionAplicacion.compras.Cliente;

import java.util.Scanner;

public class EliminaCliente {

    /*
        Se crea el método eliminarCliente() el cuál primero muestra un menú con todos los clientes
        y luego el usuario elige al cliente que desee eliminar, finalmente se le vuelve a preguntar al
        usuario si desea eliminar otro cliente o no.
    */

    public static void eliminarCliente() {

        Scanner input = new Scanner(System.in);

        System.out.println("Clientes: ");

        for (int i = 0; i < Cliente.getClientes().size(); i++) {
            System.out.println((i+1) + " " + Cliente.getClientes().get(i));
        }

        System.out.print("Elige un cliente a eliminar: ");
        int cliente = Integer.parseInt(input.nextLine());

        Cliente.eliminarCliente(Cliente.getClientes().get(cliente-1));

        System.out.println("¡Cliente eliminado con éxito!");
        System.out.print(" 1. Regresar : ");
        int opcion = Integer.parseInt(input.nextLine());

    }

}
