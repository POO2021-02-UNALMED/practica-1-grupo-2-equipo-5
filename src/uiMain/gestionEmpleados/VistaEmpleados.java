package uiMain.gestionEmpleados;

import gestionAplicacion.empleados.Empleado;

import java.util.Scanner;

public class VistaEmpleados {

    /*
        Se crea el método verEmpleados que lo que hace es recorrrer la lista de empleados
         de la clase Empleado y luego se llama al método toString() para que imprima por pantalla
         los datos de cada empleado
    */

    public static void verEmpleados() {

        Scanner input = new Scanner(System.in);

        for (Empleado empleado : Empleado.getEmpleados()) {
            System.out.println(empleado);
        }

        int opcionEmp;

        do {
            System.out.print("1. Regresar : ");
            opcionEmp = input.nextInt();
            input.nextLine();
        } while (opcionEmp != 1);

    }

}
