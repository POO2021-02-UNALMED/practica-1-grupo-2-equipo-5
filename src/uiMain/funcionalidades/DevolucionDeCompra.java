package uiMain.funcionalidades;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;

import java.util.ArrayList;
import java.util.Scanner;

public class DevolucionDeCompra {

    public static void hacerDevolucion() {
        ArrayList<Producto> productos = Producto.getInventario();

        for (Producto producto: productos) {
            System.out.println(producto);
        }

        Scanner input = new Scanner(System.in);

        int opcion;

        if (Cliente.getClientes().isEmpty()) {
            System.out.println("No hay clientes");
            return;
        }
        // Se recorren los clientes para saber cual hará la devolución
        System.out.println("¿Que cliente desea hacer la devolución");
        for (Cliente cliente : Cliente.getClientes()) {

            System.out.println("=================================");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("C.C: " + cliente.getCedula());
            System.out.println("Gastos: " + cliente.getGastos());
            System.out.println("¿Es este cliente?");
            System.out.println("1. Si, 2. No, deseo ver el siguiente");
            System.out.print("Indique su eleccion: ");
            opcion = input.nextInt();
            input.nextLine();

            if (opcion == 1) {
                // Si ese es el cliente, se procede a seleccionar la compra
                if (cliente.getCompras().isEmpty()) {
                    System.out.println("No hay compras");
                    return;
                }
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
                                // Se devuelve la compra completa
                                ((CompraProductos) compra).devolver();
                                for (Producto producto1: Producto.getInventario()) {
                                    System.out.println(producto1);
                                }
                                System.out.println("Compra devuelta");
                                return;
                            } else {
                                // Se seleciona el producto a devolver
                                if (((CompraProductos) compra).getProductos().isEmpty()) {
                                    System.out.println("No hay productos");
                                    return;
                                }
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
                                        for (Producto producto1: Producto.getInventario()) {
                                            System.out.println(producto1);
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("No hay compras de productos");
                for (Producto producto1: Producto.getInventario()) {
                    System.out.println(producto1);
                }
                return;
            }
        }

        for (Producto producto: Producto.getInventario()) {
            System.out.println(producto);
        }

    }
}
