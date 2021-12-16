package uiMain.gestionEmpleados;

import gestionAplicacion.empleados.Cajero;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.empleados.Tecnico;
import java.util.Scanner;

public class RegistroEmpleado {

    /*
        Se crea el método registrarEmpleado() cuya funcionalidad pedirle al usuario por consola
        que digite todos los atributos del Empleado, los cuáles se usarán para crear el objeto
        de tipo Empleado mediante el uso del método constructor de la clase Empleado, el método además
        le permite al usuario crear múltiples empleados ingresando la opción "si", una vez el usuario
        ingrese la opción "no", entonces el método acabará y el programa seguirá su ejecución.
    */

    public static void registrarEmpleado() {

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("¿Qué tipo de empleado desea registrar?");
            System.out.println(" 1. Cajero");
            System.out.println(" 2. Tecnico");
            System.out.print("Indique su eleccion : ");
            int eleccion = Integer.parseInt(input.nextLine());

            if (eleccion == 1) {
                System.out.print("Nombre: ");
                String nombre = input.nextLine();
                System.out.print("Cedula: ");
                String cedula = input.nextLine();
                System.out.print("Sueldo: ");
                double sueldo= input.nextDouble();
                input.nextLine();
                System.out.print("Numero de Contacto: ");
                String numeroContacto = input.nextLine();
                System.out.print("Correo: ");
                String correo = input.nextLine();
                System.out.print("Cantidad en ventas: ");
                double cantidadEnVentas = input.nextDouble();
                input.nextLine();

                new Cajero(nombre, cedula, sueldo, numeroContacto, correo);
            }

            else  if (eleccion == 2) {
                System.out.print("Nombre: ");
                String nombre = input.nextLine();
                System.out.print("Cedula: ");
                String cedula = input.nextLine();
                System.out.print("Sueldo: ");
                double sueldo= Double.parseDouble(input.nextLine());
                System.out.print("Numero de Contacto: ");
                String numeroContacto = input.nextLine();
                System.out.print("Correo: ");
                String correo = input.nextLine();
                System.out.print("Años de experiencia: ");
                int anosExperiencia = Integer.parseInt(input.nextLine());
                System.out.print("Servicios Realizados: ");
                int serviciosRealizados = Integer.parseInt(input.nextLine());

                new Tecnico(nombre, cedula, sueldo, numeroContacto, correo, anosExperiencia, serviciosRealizados);
            }

            System.out.println("¡Empleado creado con éxito!");
            System.out.print(" 1. Regresar : ");
            opcion = Integer.parseInt(input.nextLine());

        } while(opcion != 1);

    }


}
