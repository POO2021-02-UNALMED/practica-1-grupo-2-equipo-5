package uiMain.gestionClientes;

import gestionAplicacion.compras.Cliente;

import java.util.Scanner;

public class RegistroCliente {

    /*
        Se crea el método registrarCliente() cuya funcionalidad pedirle al usuario por consola
        que digite todos los atributos del cliente, los cuáles se usarán para crear el objeto
        de tipo cliente mediante el uso del método constructor de la clase Cliente, el método además
        le permite al usuario crear múltiples clientes ingresando la opción "si", una vez el usuario
        ingrese la opción "no", entonces el método acabará y el programa seguirá su ejecución.
    */

    public static void registrarCliente() {

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.print("Cedula: ");
            String cedula = input.nextLine();
            System.out.print("Nombre: ");
            String nombre = input.nextLine();
            System.out.print("Direccion: ");
            String direccion = input.nextLine();
            System.out.print("Telefono: ");
            String telefono = input.nextLine();
            System.out.print("Fecha de Nacimiento: ");
            String fechaNacimiento = input.nextLine();

            Cliente.agregarCliente(new Cliente(cedula, nombre, direccion, telefono, fechaNacimiento));

            System.out.println("¡Cliente creado con éxito!");
            System.out.print(" 1. Regresar : ");
            opcion = Integer.parseInt(input.nextLine());

        } while(opcion != 1);

    }

}
