package uiMain;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.empleados.Cajero;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.empleados.Tecnico;
import uiMain.gestionClientes.GestionClientes;
import uiMain.gestionEmpleados.GestionEmpleados;

import java.util.Scanner;

public class mainUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcion;

        Cliente cl1 = new Cliente("1001025017", "jaime", "cra. 65f #30c-21", "3007242377", 125.6,"19/01/2000");
        Cliente cl2 = new Cliente("1001025017", "andres", "cra. 65f #30c-21", "3007242377", 125.6,"19/01/2000");
        Cajero cajero1 = new Cajero("jose", "1000", 144.5, "911", "jmonsalveb", 5000);
        Tecnico tec1 = new Tecnico("jairo", "1001", 200, "123", "jaimemonsalveba", 12, 4);
        do {
            System.out.println("Bienvenido al sistema de PJ Tech");
            System.out.println("¿Que deseas hacer?");
            System.out.println(" 1. Gestionar Empleados");
            System.out.println(" 2. Gestionar Productos");
            System.out.println(" 3. Gestionar Servicios");
            System.out.println(" 4. Gestionar Compras");
            System.out.println(" 5. Gestionar Clientes");
            System.out.println(" 6. Salir");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: GestionEmpleados.GestionarEmpleados() ; break;
                case 2: GestionProductos.GestionarProductos() ; break;
                case 3: GestionServicios.GestionarServicios() ; break;
                case 4: GestionCompras.GestionarCompra() ; break;
                case 5: GestionClientes.GestionarCliente(); break;
                case 7  : break;
            }

        } while (opcion != 6);
    }
}
