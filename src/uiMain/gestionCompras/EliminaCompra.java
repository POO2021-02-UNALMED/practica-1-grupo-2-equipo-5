package uiMain.gestionCompras;

import gestionAplicacion.compras.Compra;

import java.util.Scanner;

public class EliminaCompra {

    public static void mostrarMenuEliminarCompra() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo de la compra a eliminar : ");
            codigo = input.nextInt();

            boolean eliminado = Compra.eliminarCompra(codigo);

            if (!eliminado) {
                System.out.println("Esa compra no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Compra eliminada exitosamente!");
                break;
            }
        }

    }

}
