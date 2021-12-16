package uiMain.gestionProductos;

import gestionAplicacion.compras.Compra;
import gestionAplicacion.productos.Producto;

import java.util.Scanner;

public class EliminaProducto {

    public static void mostarMenuEliminarProducto() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo del producto a eliminar : ");
            codigo = input.nextInt();

            boolean eliminado = Producto.eliminarProductoInvetario(codigo);
            if (!eliminado ) {
                System.out.println("Esa compra no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Compra eliminada exitosamente!");
                break;
            }
        }

    }
}
