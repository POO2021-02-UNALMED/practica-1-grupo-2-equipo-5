package uiMain.gestionEmpleados;

import gestionAplicacion.empleados.Cajero;
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

        String opcion;

        do {
            int empleadoARegistrar;

            do {
                System.out.println("¿Qué empleado desea registrar?");
                System.out.println(" 1. Cajero");
                System.out.println(" 2. Tecnico");
                System.out.println(" 3. Regresar");
                System.out.print("Indique su eleccion : ");
                empleadoARegistrar = input.nextInt();
                input.nextLine();

                switch (empleadoARegistrar) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombreCajero = input.nextLine();
                        System.out.print("Cedula: ");
                        String cedulaCajero = input.nextLine();
                        System.out.print("Sueldo: ");
                        double sueldoCajero = input.nextDouble();
                        input.nextLine();
                        System.out.print("Numero de Contacto: ");
                        String numeroContactoCajero = input.nextLine();
                        System.out.print("Correo: ");
                        String correoCajero = input.nextLine();
                        System.out.print("Cantidad en ventas: ");
                        double cantidadEnVentas = input.nextDouble();
                        input.nextLine();

                        new Cajero(nombreCajero, cedulaCajero, sueldoCajero, numeroContactoCajero, correoCajero, cantidadEnVentas);

                        System.out.println("¡Cajero creado con éxito!");

                        break;

                    case 2:
                        System.out.print("Nombre: ");
                        String nombreTecnico = input.nextLine();
                        System.out.print("Cedula: ");
                        String cedulaTecnico = input.nextLine();
                        System.out.print("Sueldo: ");
                        double sueldoTecnico = input.nextDouble();
                        input.nextLine();
                        System.out.print("Numero de Contacto: ");
                        String  numeroContactoTecnico = input.nextLine();
                        System.out.print("Correo: ");
                        String correoTecnico = input.nextLine();
                        System.out.print("Años de experiencia: ");
                        int anosExperiencia = input.nextInt();
                        input.nextLine();
                        System.out.print("Servicios Realizados: ");
                        int serviciosRealizados = input.nextInt();
                        input.nextLine();

                        new Tecnico(nombreTecnico, cedulaTecnico, sueldoTecnico, numeroContactoTecnico, correoTecnico, anosExperiencia, serviciosRealizados);

                        System.out.println("¡Tecnico creado con éxito!");

                        break;

                    case 3: break;
                }

                if (empleadoARegistrar == 1 || empleadoARegistrar == 2) {
                    break;
                }

            } while (empleadoARegistrar != 3);


            System.out.print("¿Desea añadir otro Empleado? [si/no] : ");
            opcion = input.nextLine();

        } while(opcion.equals("si"));

    }

}
