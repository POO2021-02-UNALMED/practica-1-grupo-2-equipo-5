package uiMain.funcionalidades;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.productos.ProductoVendido;

import java.util.Scanner;

public class DevolucionDeCompra {

    public static void hacerDevolucion() {

        Scanner input = new Scanner(System.in);

        int opcion;

        // Se recorren los clientes para saber cual hará la devolución
        System.out.println("¿Que cliente desea hacer la devolución");
        for (Cliente cliente : Cliente.getClientes()) {

            System.out.println("=================================");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("C.C" + cliente.getCedula());
            System.out.println("Gastos" + cliente.getGastos());
            System.out.println("¿Es este cliente?");
            System.out.println("1. Si, 2. No, deseo ver el siguiente");
            System.out.print("Indique su eleccion: ");
            opcion = input.nextInt();
            input.nextLine();

            if (opcion == 1) {
                // Si ese es el cliente, se procede a seleccionar la compra
                System.out.println("¿Que compra desea devolver");
                for (Compra compra: cliente.getCompras()) {

                    if (compra instanceof  CompraProductos) {

                        System.out.println("=================================");
                        System.out.println("Codigo compra: " + compra.getCodigo());
                        System.out.println("¿Es esta la compra?");
                        System.out.println("1. Si, 2. No, deseo ver la siguiente");
                        System.out.print("Indique su eleccion: ");
                        opcion = input.nextInt();
                        input.nextLine();

                        if (opcion == 1){
                            System.out.println("¿Desea devolver la compra completa?");
                            System.out.print("Indique su eleccion: ");
                            opcion = input.nextInt();
                            input.nextLine();
                            // Acá se determina si se devuelve la compra total o algun producto
                            if (opcion == 1) {
                                ((CompraProductos) compra).devolver();
                                System.out.println("Compra devuelta");
                                return;
                            } else {
                                // Se seleciona el producto a devolver
                                System.out.println("¿Que producto desea devolver?");
                                for (ProductoVendido producto : ((CompraProductos) compra).getProductos()) {
                                    System.out.println("=================================");
                                    System.out.println("Nombre: " + producto.getProducto().getNombre());
                                    System.out.println("¿Es este es producto?");
                                    System.out.println("1. Si, 2. No, deseo ver la siguiente");
                                    System.out.print("Indique su eleccion: ");
                                    opcion = input.nextInt();
                                    input.nextLine();
                                    if (opcion == 1) {
                                        producto.devolver();
                                        System.out.println("Producto devuelto");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
