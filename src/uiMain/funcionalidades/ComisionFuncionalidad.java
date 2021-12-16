package uiMain.funcionalidades;

import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.productos.Producto;
import gestionAplicacion.productos.ProductoVendido;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class ComisionFuncionalidad {
    static Scanner input = new Scanner(System.in);
    public static void funcionalidad(){
        //Se obtiene, todo los empleados  y se calcula a pagar por todas las comisiones

        //System.out.print("Ingrese el porcetaje de la comisión ");
        //float porcetajeAumento = input.nextFloat();

        ArrayList<Empleado> empleados = Empleado.getEmpleados();
        Collections.sort(empleados, Collections.reverseOrder());

        System.out.println("Lista de empleados y comisión (de mayor a menor): ");
        double comisionTotal = 0.0;

        //Imprime todos los empelados de forma desc y calcula la comisión total y se muestra en pantalla.
        for(Empleado empleado: empleados){
            comisionTotal += empleado.calcularComision();
            System.out.println();
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("CC: " + empleado.getCedula());
            System.out.println("Comision: " + empleado.calcularComision());
            System.out.println("===================");
        }
        System.out.println("Total de comisión a pagar: " + comisionTotal);
        System.out.println("********************************************");

        System.out.println("¿Desea subir el sueldo a los empleados más destacados (true) (false)? ");
        boolean desision = input.nextBoolean();

        //El usuario puede decidir si quiere subir el sueldo.
        if(desision){
            //Se le pide ciertos valores al cliente para cambiarle el sueldo a un empleado.

            System.out.println("¿Cual es el valor minimo de comision para subir el sueldo? Valor (double)");
            double precioSubir = input.nextDouble();
            System.out.println("Fracción a subir (double): ");
            double frac = input.nextDouble();

            //Se muestran todos los usuarios escogidos para subirle el sueldo.
            System.out.println(" Empleados escogidos :) ");
            for(Empleado empleado: empleados){
                if(precioSubir < empleado.getComision()){
                    System.out.println("Nombre: " + empleado.getNombre());
                    System.out.println("CC: " + empleado.getCedula());
                    System.out.println("Sueldo anterior " + empleado.getSueldo());
                    empleado.setSueldo( empleado.getSueldo() * frac );
                    System.out.println("Sueldo Nuevo " + empleado.getSueldo());
                }
            }
        }
    }
}
