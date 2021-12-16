package uiMain.funcionalidades;

import java.util.Scanner;

public class Funcionalidades {

    public static void gestionFuncionalidades(){

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("¿Que desea hacer?");
            System.out.println(" 1. Ver Clientes Valiosos"); //Funcionalidad valiosa #1
            System.out.println(" 2. Devolucion de Compra"); //Funcionalidad valiosa #2
            System.out.println(" 3. Obtener comisiones de empleados"); //Funcionalidad valiosa #3 // FREDY
            System.out.println(" 4. Generar informe tienda"); //Funcionalidad valiosa #4
            System.out.println(" 5. Gestionar Inventario: "); //Funcionalidad valiosa #5 // FREDY
            System.out.println(" 6. Regresar");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1: ClientesValiosos.mostrarClientesValiosos(); break;
                case 2: DevolucionDeCompra.hacerDevolucion(); break;
                case 3: ComisionFuncionalidad.funcionalidad(); break;
                case 4: InformeTienda.generarInformeTienda(); break;
                case 5: GestionarInvetario.funcionalidad(); break;
                case 6: break;
            }

        } while (opcion != 6);
    }
}
