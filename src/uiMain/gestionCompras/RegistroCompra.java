package uiMain.gestionCompras;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.compras.CompraServicios;

import java.util.Scanner;

public class RegistroCompra {

    public static void registrarCompra() {

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("¿Qué tipo de compra desea registrar?");
            System.out.println(" 1. Compra de Productos");
            System.out.println(" 2. Compra de Servicios");
            System.out.print("Indique su eleccion : ");
            int eleccion = Integer.parseInt(input.nextLine());

            if (eleccion == 1) {
                System.out.print("Codigo: ");
                int codigo = Integer.parseInt(input.nextLine());

                System.out.print("Descripcion: ");
                String descripcion = input.nextLine();

                System.out.println("Seleccione un cliente: ");
                System.out.print(Cliente.verClientes());
                System.out.print("Cliente: ");
                int seleccion = Integer.parseInt(input.nextLine());
                Cliente cliente = Cliente.getClientes().get(seleccion-1);

                String direccion = cliente.getDireccion();

                System.out.print("Fecha de Compra: ");
                String fechaCompra = input.nextLine();

                System.out.print("Descuento: ");
                float descuento = Float.parseFloat(input.nextLine());

                Compra.agregarCompra(new CompraProductos(codigo, descripcion, direccion, cliente, fechaCompra, descuento));

            }

            else  if (eleccion == 2) {
                System.out.print("Codigo: ");
                int codigo = Integer.parseInt(input.nextLine());

                System.out.print("Descripcion: ");
                String descripcion = input.nextLine();

                System.out.println("Seleccione un cliente: ");
                System.out.print(Cliente.verClientes());
                System.out.print("Cliente: ");
                int seleccion = Integer.parseInt(input.nextLine());
                Cliente cliente = Cliente.getClientes().get(seleccion - 1);

                String direccion = cliente.getDireccion();

                System.out.print("Tiempo de culminacion: ");
                String tiempoCulminacion = input.nextLine();

                Compra.agregarCompra(new CompraServicios(codigo, descripcion, direccion, cliente, tiempoCulminacion));

            }

            System.out.println("¡Compra creada con éxito!");
            System.out.print(" 1. Regresar : ");
            opcion = Integer.parseInt(input.nextLine());

        } while(opcion != 1);

    }

}
