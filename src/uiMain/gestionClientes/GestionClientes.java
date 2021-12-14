package uiMain.gestionClientes;

import gestionAplicacion.compras.Cliente;

import java.util.Scanner;

public class GestionClientes {

    public static void GestionarCliente() {

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Clientes");
            System.out.println(" 2. Registrar Cliente");
            System.out.println(" 3. Eliminar Cliente");
            System.out.println(" 4. Editar Cliente");
            System.out.println(" 5. Ver clientes valiosos");             // Funcionalidad interesante #1
            System.out.println(" 6. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1: VistaClientes.mostrarClientes(); break;
                case 2: RegistroCliente.registrarCliente(); break;
                case 3: EliminaCliente.eliminarCliente(); break;
                case 4: EditaCliente.editarCliente(); break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);
    }
}
