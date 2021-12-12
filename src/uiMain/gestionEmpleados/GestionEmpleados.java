package uiMain.gestionEmpleados;

import java.util.Scanner;

public class GestionEmpleados {

    public static void GestionarEmpleados() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Empleados");
            System.out.println(" 2. Crear Empleado");
            System.out.println(" 3. Despedir Empleado");
            System.out.println(" 4. Editar Empleado");
            System.out.println(" 5. Obtener comisiones");
            System.out.println(" 6. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: VistaEmpleados.verEmpleados(); break;
                case 2: RegistroEmpleado.registrarEmpleado(); break;
                case 3: DespidoEmpleado.despedirEmpleado(); break;
                case 4: EditaEmpleado.editarEmpleado(); break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);
    }

}
