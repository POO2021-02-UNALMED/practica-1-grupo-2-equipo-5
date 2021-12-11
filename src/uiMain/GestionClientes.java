package uiMain;

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
            System.out.println(" 5. Ver clientes valiosos");
            System.out.println(" 6. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: ; break;
                case 2: ; break;
                case 3: ; break;
                case 4: ; break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);
    }
}
