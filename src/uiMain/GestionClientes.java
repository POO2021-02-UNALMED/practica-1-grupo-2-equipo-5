package uiMain;

import gestionAplicacion.compras.Cliente;

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
                case 1: verClientes() ; break;
                case 2: registrarCliente() ; break;
                case 3: ; break;
                case 4: ; break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);
    }

    /*
        Se crea el método verClientes que lo que hace es recorrrer la lista de Clientes y llamarme al
        método toString() para que imprima por pantalla los datos de cada cliente
    */

    public static void verClientes() {
        Scanner input = new Scanner(System.in);

        for (Cliente cliente : Cliente.getClientes()) {
            System.out.println(cliente);
        }

        int opcion;

        do {
            System.out.print("1. Regresar : ");
            opcion = input.nextInt();
        } while (opcion != 1);
    }

    /*
        Se crea el método registrarCliente() cuya funcionalidad pedirle al usuario por consola
        que digite todos los atributos del cliente, los cuáles se usarán para crear el objeto
        de tipo cliente mediante el uso del método constructor de la clase Cliente, el método además
        le permite al usuario crear múltiples clientes ingresando la opción "si", una vez el usuario
        ingrese la opción "no", entonces el método acabará y el programa seguirá su ejecución.
    */

    public static void registrarCliente() {
        Scanner input = new Scanner(System.in);

        String opcion;

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
            System.out.print("Gastos: ");
            double gastos = input.nextDouble();
            input.nextLine();

            new Cliente(cedula, nombre, direccion, telefono, gastos, fechaNacimiento);

            System.out.print("¡Cliente creado con éxito!, ¿Desea añadir otro cliente? [si/no] : ");
            opcion = input.nextLine();

        } while(opcion.equals("si"));

    }

}
