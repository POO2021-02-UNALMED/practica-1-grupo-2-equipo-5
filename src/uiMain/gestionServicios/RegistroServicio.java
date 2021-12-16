package uiMain.gestionServicios;

import gestionAplicacion.servicios.Servicio;

import java.util.Scanner;

public class RegistroServicio {
    public static void registraServicio(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos para registrar el servicio");
        System.out.print("Codigo: ");
        int codigo  = input.nextInt();

        System.out.print("descripcion: ");
        String descripcion = input.nextLine();
        input.nextLine();

        System.out.print("Precio: ");
        double precio  = input.nextDouble();
        new Servicio(precio, descripcion, codigo);

    }
}
