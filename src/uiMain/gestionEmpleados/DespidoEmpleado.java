package uiMain.gestionEmpleados;

import gestionAplicacion.empleados.Empleado;

import java.util.Scanner;

public class DespidoEmpleado {

    /*
        Se crea el método despedirEmpleado() el cuál primero muestra un menú con todos los empleados
        y luego el usuario (administrador) elige al empleado que desee eliminar de la lista de empleados,
        finalmente se le vuelve a preguntar al usuario si desea eliminar (despedir) otro empleado o no.
    */

    public static void despedirEmpleado() {

        Scanner input = new Scanner(System.in);

        System.out.println("Empleados: ");

        for (int i = 0; i < Empleado.getEmpleados().size(); i++) {
            System.out.println((i+1) + " " + Empleado.getEmpleados().get(i));
        }

        System.out.print("Elige un empleado a eliminar: ");
        int eliminaEmpleado = input.nextInt();
        input.nextLine();

        String eliminaOtroEmpleado;

        do {
            Empleado.getEmpleados().remove(eliminaEmpleado-1);

            System.out.print("¡Empleado despedido con éxito!, ¿Desea despedir otro empleado? [si/no] : ");
            eliminaOtroEmpleado = input.nextLine();

        } while(eliminaOtroEmpleado.equals("si"));

    }
}
