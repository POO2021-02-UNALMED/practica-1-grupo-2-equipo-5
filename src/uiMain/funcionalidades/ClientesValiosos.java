package uiMain.funcionalidades;

import gestionAplicacion.compras.Cliente;

import java.util.ArrayList;
import java.util.Collections;

public class ClientesValiosos {
    // Cantidad a discrimiar si son clientes valiosos
    public static final double CANTIDAD_PARA_SER_VALIOSO = 40000;

    public static void mostrarClientesValiosos() {

        ArrayList<Cliente> valiosos = new ArrayList<Cliente>();

        // Recorremos todos los clientes calculando sus gastos totales
        for (Cliente cliente : Cliente.getClientes()) {
            // Si han gastado mas de la cantidad fijada, son valisoso
            if (cliente.calcularGastos() >= CANTIDAD_PARA_SER_VALIOSO) {
                valiosos.add(cliente);
            }
        }

        // Ordenamos los clientes que cumplen para mostrarlos de mayor a menor
        Collections.sort(valiosos, Collections.reverseOrder());

        System.out.println("Los clientes valisoso son: ");
        for (Cliente cliente : valiosos) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("C.C" + cliente.getCedula());
            System.out.println("Gastos" + cliente.getGastos());
            System.out.println("=================================");
        }
    }
}
