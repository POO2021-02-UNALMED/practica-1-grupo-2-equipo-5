package uiMain.gestionCompras;

import gestionAplicacion.compras.Compra;

import java.util.Scanner;

public class EditaCompra {

    public static void menuEditarCompra() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo de la compra a editar : ");
            codigo = input.nextInt();

            Compra compra = Compra.buscarCompra(codigo);

            if (compra == null) {
                System.out.println("Esa compra no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Compra encontrada!");
                System.out.println(compra);
                System.out.println("");
                input = new Scanner(System.in);
                int opcion;
                do {
                    System.out.println("¿Que desea hacer?");
                    System.out.println(" 1. Editar descripción");
                    System.out.println(" 2. Editar dirección");
                    System.out.println(" 3. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la nueva descripción : ");
                            compra.setDescripcion(input.next());
                            System.out.println(compra); break;
                        case 2:
                            System.out.print("Ingrese la nueva direccion : ");
                            compra.setDireccion(input.next());
                            System.out.println(compra); break;
                        case 3: break;
                    }

                } while (opcion != 3);
                break;
            }
        }
    }

}
