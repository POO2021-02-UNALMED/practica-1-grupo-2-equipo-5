package uiMain.gestionServicios;


import gestionAplicacion.servicios.Servicio;

import java.util.Scanner;

public class VistaServicio {
    public static void mostrarServio(){
       for (Servicio servicio : Servicio.getServicios()) {
           System.out.println(servicio);
       }
    }
}
