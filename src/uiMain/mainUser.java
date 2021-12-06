package uiMain;

import java.util.Scanner;

public class mainUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al sistema de PJ Tech");
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Gestionar Empleados");
            System.out.println(" 2. Gestionar Productos");
            System.out.println(" 3. Gestionar Servicios");
            System.out.println(" 4. Gestionar Compras");
            System.out.println(" 5. Gestionar Clientes");
            System.out.println(" 6. Gestionar Empleados");
            System.out.println(" 7. Terminar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: GestionarEmpleados() ; break;
                case 2: ; break;
                case 3: ; break;
                case 4: ; break;
                case 5: ; break;
                case 6: ; break;
                case 7: break;
            }

        } while (opcion != 7);
    }
    public static void GestionarEmpleados() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Empleados");
            System.out.println(" 2. Crear Empleados");
            System.out.println(" 3. Despedir Empleados");
            System.out.println(" 4. Editar Empleados");
            System.out.println(" 5. Obtener utilidades");
            System.out.println(" 6. Volver");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: ; break;
                case 2: ; break;
                case 3: ; break;
                case 4: ; break;
                case 5: ; break;
                case 6: break;
            }

        } while (opcion != 6);
    }
}
