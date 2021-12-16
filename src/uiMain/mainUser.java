package uiMain;

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.compras.Compra;
import gestionAplicacion.compras.CompraProductos;
import gestionAplicacion.compras.CompraServicios;
import gestionAplicacion.empleados.Cajero;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.empleados.Tecnico;
import gestionAplicacion.productos.Producto;
import gestionAplicacion.servicios.Servicio;
import gestionAplicacion.servicios.TipoServicio;
import uiMain.funcionalidades.Funcionalidades;
import uiMain.gestionClientes.GestionClientes;
import uiMain.gestionCompras.GestionCompras;
import uiMain.gestionEmpleados.GestionEmpleados;
import baseDatos.Serializador;
import baseDatos.Deserializador;
import uiMain.gestionProductos.GestionProductos;
import uiMain.gestionServicios.GestionServicios;

import java.util.Scanner;

public class mainUser {

    public static void main(String[] args) {

        Deserializador.deserializar();

        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Bienvenido al sistema de PJ Tech");
            System.out.println("¿Que deseas hacer?");
            System.out.println(" 0. Crear casos de prueba para probar funcionalidades");
            System.out.println(" 1. Gestionar Empleados");
            System.out.println(" 2. Gestionar Productos");
            System.out.println(" 3. Gestionar Servicios");
            System.out.println(" 4. Gestionar Compras");
            System.out.println(" 5. Gestionar Clientes");
            System.out.println(" 6. Gestionar Tienda");
            System.out.println(" 7. Salir");
            System.out.print("Indique su eleccion : ");
            opcion = input.nextInt();

            switch (opcion) {
                case 0: CasosDePrueba.crearCasosDePrueba();break;
                case 1: GestionEmpleados.GestionarEmpleados() ; break;
                case 2: GestionProductos.GestionarProductos() ; break;
                case 3: GestionServicios.GestionarServicios() ; break;
                case 4: GestionCompras.GestionarCompra() ; break;
                case 5: GestionClientes.GestionarCliente(); break;
                case 6: Funcionalidades.gestionFuncionalidades(); break;
                case 7: salirDelSistema(); break;
            }

        } while (opcion != 7);
    }

    public static void salirDelSistema() {
        Serializador.serializar();
    }
}
