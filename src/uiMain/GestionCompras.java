package uiMain;

import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.compras.CompraServicios;

import java.util.Scanner;

public class GestionCompras {

    public static void GestionarCompra() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Compras");
            System.out.println(" 2. Crear Compra");
            System.out.println(" 3. Eliminar Compra");
            System.out.println(" 4. Editar Compra");
            System.out.println(" 5. Devolucion de Compra");
            System.out.println(" 6. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: verCompras(); break;
                case 2: ; break;
                case 3: mostrarMenuEliminarCompra(); break;
                case 4: menuEditarCompra(); break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);
    }

    public static void verCompras() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Compras de Productos");
            System.out.println(" 2. Ver Compras de Servicios");
            System.out.println(" 3. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: System.out.println(Compra.verComprasProductos()); break;
                case 2: System.out.println(Compra.verComprasServicios()); break;
                case 3: break;
            }

        } while (opcion != 3);
    }

    public static void mostrarMenuEliminarCompra() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo de la compra a eliminar :");
            codigo = input.nextInt();

            boolean eliminado = Compra.eliminarCompra(codigo);

            if (eliminado == false) {
                System.out.println("Esa compra no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("Compra eliminada exitosamente");
                break;
            }
        }
    }

    public static void menuEditarCompra() {
        Scanner input = new Scanner(System.in);
        int codigo;

        while (true) {
            System.out.print("Ingrese el codigo de la compra a editar :");
            codigo = input.nextInt();

            Compra compra = Compra.buscarCompra(codigo);

            if (compra == null) {
                System.out.println("Esa compra no existe en el sistema, intente de nuevo");
            }
            else {
                System.out.println("Compra encontrada");
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
                            System.out.print("Ingrese la nueva descripción");
                            compra.setDescripcion(input.next());
                            System.out.println(compra); break;
                        case 2:
                            System.out.print("Ingrese la nueva direccion");
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


