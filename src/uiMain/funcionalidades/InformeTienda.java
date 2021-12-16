package uiMain.funcionalidades;

/*
    DESCRIPCION:

    En esta clase se le mostrará al usuario (administrador de la tienda) por pantalla un informe detallado de la tienda
    que contiene lo siguiente:

    1. Ingresos
    2. Egresos
    3. Utilidades
    4. 2 Mejores empleados (1 cajero y 1 tecnico)
    5. Cliente más valioso
*/

import gestionAplicacion.compras.Cliente;
import gestionAplicacion.empleados.Cajero;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.empleados.Tecnico;
import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;
import gestionAplicacion.servicios.Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InformeTienda {

    public static void  generarInformeTienda() {

        Scanner input = new Scanner(System.in);

        String informe = "INFORME PJ TECH" + "\n" +
                "Ingresos Totales : " + getIngresosTotales() + "\n" +
                "Egresos Totales : " + getEgresosTotales() + "\n" +
                "Utilidades : " + getUtilidades() + "\n" +
                "Mayor vendedor (Cajero) : " + getMejorCajero() + "\n" +
                "Tecnico con mas Servicios : " + getMejorTecnico() + "\n" +
                "Cliente Mas Valioso : " + getMejorCliente();

        System.out.println(informe);

        int opcion;

        do {
            System.out.print("1. Regresar : ");
            opcion = Integer.parseInt(input.nextLine());
        } while (opcion != 1);

    }


    // Los ingresos vienen dados por la venta de productos y por los servicios realizados
    public static double getIngresosTotales() {
        double ingresosVentaProductos = ProductoVendido.obtenerIngresosProductosVendidos();
        double ingresosServicios = Servicio.obtenerIngresosServicios();

        return ingresosVentaProductos + ingresosServicios;
    }

    /*
        Los egresos de la tienda vienen dados por:

        1. Compra de productos
        2. Pago de nomina a empleados
     */

    public static double getEgresosTotales() {
        double egresosCompraProductos = Producto.obtenerEgresosProductos();
        double egresosPagoNomima = Empleado.obtenerEgresosNomina();

        return egresosCompraProductos + egresosPagoNomima;
    }

    // Este método retorna las utilidades netas de la tiena restando los ingresos menos los egresos
    public static double getUtilidades() {
        return getIngresosTotales() - getEgresosTotales();
    }

    //Este método retorna el mejor cajero de la tienda
    public static String getMejorCajero() {
        return Cajero.mejorCajero();
    }

    //Este método retorna el mejor tecnico de la tienda
    public static String getMejorTecnico() {
        return Tecnico.mejorTecnico();
    }

    //Este método retorna el mejor Cliente de la tienda
    public static String getMejorCliente() {
        Collections.sort(Cliente.getClientes(), Collections.reverseOrder());

        return Cliente.getClientes().get(0).getNombre();
    }

}
