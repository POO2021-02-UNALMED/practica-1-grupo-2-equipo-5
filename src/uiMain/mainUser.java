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

        
/*        // Empleados de la tienda
        Empleado cajero1 = new Cajero("Anselmo", "9584345", 1000000, "3138459495", "angom@pjtech.co");
        Empleado cajero2 = new Cajero("Lee", "123344", 1000000, "3138345495", "lee@pjtech.co");
        Empleado cajero3 = new Cajero("Jhon Jairo", "45345345", 1000000, "343459495", "jjvv@pjtech.co");
        Empleado tecnico1 = new Tecnico("Tony", "456456", 2000000, "3118443495", "tstark@pjtech.co", 5, 30);
        Empleado tecnico2 = new Tecnico("Albeiro", "dfsdffsd", 1800000, "3108454545", "agos@pjtech.edu.co", 2, 5);

        // Añadir productos a la tienda
        Producto producto1 = new Producto(12345, "Teclado Gamer 502", Producto.tipo_producto.PERIFERICOS, 200000);
        Producto producto2 = new Producto(54545, "Mouse Gamer Logitech", Producto.tipo_producto.PERIFERICOS, 230000);
        Producto producto3 = new Producto(76767, "Torre Gamer", Producto.tipo_producto.COMBOS, 400000);
        Producto producto4 = new Producto(65665, "Memoria RAM 16 GB", Producto.tipo_producto.COMPONENTES, 270000);
        Producto producto5 = new Producto(95735, "Monitor LG 19", Producto.tipo_producto.PERIFERICOS, 835000);
        Producto producto6 = new Producto(12675, "Teclado Gamer 502", Producto.tipo_producto.PERIFERICOS, 200000);
        Producto producto7 = new Producto(75667, "Teclado Gamer 502", Producto.tipo_producto.PERIFERICOS, 200000);

        // Añádir tipos de servicios a la tienda
        TipoServicio tipoServicio1 = new TipoServicio("Mantenimiento de PC", (Tecnico) tecnico1);
        TipoServicio tipoServicio2 = new TipoServicio("Liempieza de PC", (Tecnico) tecnico1);
        TipoServicio tipoServicio3 = new TipoServicio("Formateo de PC", (Tecnico) tecnico2);
        TipoServicio tipoServicio4 = new TipoServicio("Mantenimiento de consolas", (Tecnico) tecnico2);

        // clientes de la tienda
        Cliente cliente1 = new Cliente("10", "valentin", "Calle 43B", "5482449", "13/04/2000");
        Cliente cliente2 = new Cliente("20", "Fredy", "Avenida 43B", "610034", "23/10/1999");
        Cliente cliente3 = new Cliente("30", "Andres", "Calle 43B", "987879", "30/04/2000");

        //compras pertenecientes al cliente 1
        Compra compra1 = new CompraProductos(123, "Sin descripcion","Calle 09 - 87", cliente1, "12/04/2021" );
        ((CompraProductos) compra1).agregarProductoACompra(producto1, (Cajero) cajero1);
        ((CompraProductos) compra1).agregarProductoACompra(producto2, (Cajero) cajero1);
        ((CompraProductos) compra1).agregarProductoACompra(producto3, (Cajero) cajero1);
        cliente1.agregarCompra((CompraProductos) compra1);
        Compra compra2 = new CompraProductos(456, "Sin descripcion", "Transversal B", "01/12/2021", 0.2);
        compra2.setCliente(cliente1);
        ((CompraProductos) compra1).agregarProductoACompra(producto4, (Cajero) cajero2);
        cliente1.agregarCompra((CompraProductos) compra2);

        Compra compra3 = new CompraServicios(789, "Preferencial", "Calle 24", cliente1, "2 horas");
        cliente1.agregarCompra((CompraServicios) compra3);
        Servicio servicio1 = new Servicio(25000, "Hace falta HDD", tipoServicio1,(CompraServicios) compra3, 3344);
        ((CompraServicios) compra3).agregarServicio(servicio1);
        tipoServicio1.agregarServicio(servicio1);
        Servicio servicio2 = new Servicio(40000, "Lente sucio", 7754);
        servicio2.setTipoServicio(tipoServicio4);
        servicio2.setCompraServicios((CompraServicios) compra3);
        ((CompraServicios) compra3).agregarServicio(servicio2);
        tipoServicio4.agregarServicio(servicio2);

        //compras pertenecientes al cliente 2
        Compra compra4 = new CompraServicios(592, "Preferencial", "Calle 56", cliente2, "5 horas");
        cliente2.agregarCompra((CompraServicios) compra4);
        Servicio servicio3 = new Servicio(25000, "SE isntalaron todos los programas", tipoServicio3,(CompraServicios) compra4, 9805);
        ((CompraServicios) compra4).agregarServicio(servicio3);
        tipoServicio3.agregarServicio(servicio3);*/


        Scanner input = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Bienvenido al sistema de PJ Tech");
            System.out.println("¿Que deseas hacer?");
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
