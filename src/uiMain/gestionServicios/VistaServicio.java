package uiMain.gestionServicios;


import gestionAplicacion.servicios.Servicio;

import java.util.Scanner;

public class VistaServicio {
    public static void mostrarServio(){
       System.out.println(Servicio.getServicios());
    }
}
