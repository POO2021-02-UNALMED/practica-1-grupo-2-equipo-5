package uiMain.gestionProductos;

import gestionAplicacion.compras.Compra;
import gestionAplicacion.productos.Producto;

import java.util.Scanner;

public class EditaProducto {
    public static void menuEditarProducto() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo del producto a editar : ");
            codigo = input.nextInt();

            Producto producto = Producto.buscarProducto(codigo);

            if (producto == null) {
                System.out.println("Ese producto no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("¡Producto encontrado!");
                System.out.println(producto);
                System.out.println("");
                input = new Scanner(System.in);
                int opcion;
                do {
                    System.out.println("¿Que desea hacer?");
                    System.out.println(" 1. Editar nombre");
                    System.out.println(" 2. Editar precio");
                    System.out.println(" 3. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el nuevo nombre : ");
                            producto.setNombre(input.next());
                            System.out.println(producto); break;
                        case 2:
                            System.out.print("Ingrese el nuevo producto : ");
                            producto.setPrecioCompra(input.nextDouble());
                            System.out.println(producto); break;
                        case 3: break;
                    }

                } while (opcion != 3);
                break;
            }
        }
    }
}
