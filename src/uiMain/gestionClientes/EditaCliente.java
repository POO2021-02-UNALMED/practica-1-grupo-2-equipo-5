package uiMain.gestionClientes;

import gestionAplicacion.compras.Cliente;

import java.util.Scanner;

public class EditaCliente {

    public static void editarCliente() {

        Scanner input = new Scanner(System.in);

        System.out.println("Clientes: ");

        System.out.print(Cliente.verClientes());

        System.out.print("Elige un cliente a editar: ");
        int editaCliente = input.nextInt();
        input.nextLine();

        int opcionEditar;

        do {
            System.out.println("¿Que deseas editar?");
            System.out.println(" 1. Cedula");
            System.out.println(" 2. Nombre");
            System.out.println(" 3. Direccion");
            System.out.println(" 4. Telefono");
            System.out.println(" 5. Gastos");
            System.out.println(" 6. Fecha de Nacimiento");
            System.out.println(" 7. Regresar");
            System.out.print("Indique su eleccion : ");
            opcionEditar = input.nextInt();
            input.nextLine();

            switch (opcionEditar) {
                case 1: editarCedula(Cliente.getClientes().get(editaCliente-1)); break;
                case 2: editarNombre(Cliente.getClientes().get(editaCliente-1)); break;
                case 3: editarDireccion(Cliente.getClientes().get(editaCliente-1)); break;
                case 4: editarTelefono(Cliente.getClientes().get(editaCliente-1)); break;
                case 5: editarGastos(Cliente.getClientes().get(editaCliente-1)); break;
                case 6: editarFechaNacimiento(Cliente.getClientes().get(editaCliente-1)); break;
                case 7: break;
            }

            if (opcionEditar >= 1 && opcionEditar <= 6) {
                break;
            }

        } while (opcionEditar != 7);

        System.out.print("¡Cliente editado con éxito!, ¿desea editar otro cliente? [si/no] : ");
        String editaOtroCliente = input.nextLine();

        if (editaOtroCliente.equals("si")) {
            editarCliente();
        }

    }

    public static void editarCedula(Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva cedula: ");
        String nuevaCedula = input.nextLine();

        cliente.setCedula(nuevaCedula);

        System.out.print("¡Cedula editada con éxito!, ¿desea editar otro atributo del cliente? [si/no] : ");
        String editarOtroAtributoCed = input.nextLine();

        if (editarOtroAtributoCed.equals("si")) {
            int opcionEditarCed;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Cedula");
                System.out.println(" 2. Nombre");
                System.out.println(" 3. Direccion");
                System.out.println(" 4. Telefono");
                System.out.println(" 5. Gastos");
                System.out.println(" 6. Fecha de Nacimiento");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarCed = input.nextInt();
                input.nextLine();

                switch (opcionEditarCed) {
                    case 1: editarCedula(cliente); break;
                    case 2: editarNombre(cliente); break;
                    case 3: editarDireccion(cliente); break;
                    case 4: editarTelefono(cliente); break;
                    case 5: editarGastos(cliente); break;
                    case 6: editarFechaNacimiento(cliente); break;
                    case 7: break;
                }

                if (opcionEditarCed >= 1 && opcionEditarCed <= 6) {
                    break;
                }

            } while (opcionEditarCed != 7);
        }

    }

    public static void editarNombre(Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = input.nextLine();

        cliente.setNombre(nuevoNombre);

        System.out.print("¡Nombre editado con éxito!, ¿desea editar otro atributo del cliente? [si/no] : ");
        String editarOtroAtributoName = input.nextLine();

        if (editarOtroAtributoName.equals("si")) {
            int opcionEditarName;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Cedula");
                System.out.println(" 2. Nombre");
                System.out.println(" 3. Direccion");
                System.out.println(" 4. Telefono");
                System.out.println(" 5. Gastos");
                System.out.println(" 6. Fecha de Nacimiento");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarName = input.nextInt();

                switch (opcionEditarName) {
                    case 1: editarCedula(cliente); break;
                    case 2: editarNombre(cliente); break;
                    case 3: editarDireccion(cliente); break;
                    case 4: editarTelefono(cliente); break;
                    case 5: editarGastos(cliente); break;
                    case 6: editarFechaNacimiento(cliente); break;
                    case 7: break;
                }

                if (opcionEditarName >= 1 && opcionEditarName <= 6) {
                    break;
                }

            } while (opcionEditarName != 7);
        }

    }

    public static void editarDireccion(Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva direccion: ");
        String nuevaDireccion = input.nextLine();

        cliente.setDireccion(nuevaDireccion);

        System.out.print("¡Direccion editada con éxito!, ¿desea editar otro atributo del cliente? [si/no] : ");
        String editarOtroAtributoDir = input.nextLine();

        if (editarOtroAtributoDir.equals("si")) {
            int opcionEditarDir;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Cedula");
                System.out.println(" 2. Nombre");
                System.out.println(" 3. Direccion");
                System.out.println(" 4. Telefono");
                System.out.println(" 5. Gastos");
                System.out.println(" 6. Fecha de Nacimiento");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarDir = input.nextInt();

                switch (opcionEditarDir) {
                    case 1: editarCedula(cliente); break;
                    case 2: editarNombre(cliente); break;
                    case 3: editarDireccion(cliente); break;
                    case 4: editarTelefono(cliente); break;
                    case 5: editarGastos(cliente); break;
                    case 6: editarFechaNacimiento(cliente); break;
                    case 7: break;
                }

                if (opcionEditarDir >= 1 && opcionEditarDir <= 6) {
                    break;
                }

            } while (opcionEditarDir != 7);
        }

    }

    public static void editarTelefono(Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo numero de telefono: ");
        String nuevoTelefono = input.nextLine();

        cliente.setTelefono(nuevoTelefono);

        System.out.print("¡Telefono editado con éxito!, ¿desea editar otro atributo del cliente? [si/no] : ");
        String editarOtroAtributoTel = input.nextLine();

        if (editarOtroAtributoTel.equals("si")) {
            int opcionEditarTel;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Cedula");
                System.out.println(" 2. Nombre");
                System.out.println(" 3. Direccion");
                System.out.println(" 4. Telefono");
                System.out.println(" 5. Gastos");
                System.out.println(" 6. Fecha de Nacimiento");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarTel = input.nextInt();

                switch (opcionEditarTel) {
                    case 1: editarCedula(cliente); break;
                    case 2: editarNombre(cliente); break;
                    case 3: editarDireccion(cliente); break;
                    case 4: editarTelefono(cliente); break;
                    case 5: editarGastos(cliente); break;
                    case 6: editarFechaNacimiento(cliente); break;
                    case 7: break;
                }

                if (opcionEditarTel >= 1 && opcionEditarTel <= 6) {
                    break;
                }

            } while (opcionEditarTel != 7);
        }

    }

    public static void editarGastos(Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo gasto: ");
        double nuevoGasto = input.nextDouble();
        input.nextLine();

        cliente.setGastos(nuevoGasto);

        System.out.print("¡Gastos editados con éxito!, ¿desea editar otro atributo del cliente? [si/no] : ");
        String editarOtroAtributoG = input.nextLine();

        if (editarOtroAtributoG.equals("si")) {
            int opcionEditarG;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Cedula");
                System.out.println(" 2. Nombre");
                System.out.println(" 3. Direccion");
                System.out.println(" 4. Telefono");
                System.out.println(" 5. Gastos");
                System.out.println(" 6. Fecha de Nacimiento");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarG = input.nextInt();

                switch (opcionEditarG) {
                    case 1: editarCedula(cliente); break;
                    case 2: editarNombre(cliente); break;
                    case 3: editarDireccion(cliente); break;
                    case 4: editarTelefono(cliente); break;
                    case 5: editarGastos(cliente); break;
                    case 6: editarFechaNacimiento(cliente); break;
                    case 7: break;
                }

                if (opcionEditarG >= 1 && opcionEditarG <= 6) {
                    break;
                }

            } while (opcionEditarG != 7);
        }

    }

    public static void editarFechaNacimiento(Cliente cliente) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva fecha de nacimiento: ");
        String nuevaFechaNacimiento = input.nextLine();

        cliente.setFechaNacimiento(nuevaFechaNacimiento);

        System.out.print("¡Fecha de nacimiento editada con éxito!, ¿desea editar otro atributo del cliente? [si/no] : ");
        String editarOtroAtributoFN = input.nextLine();

        if (editarOtroAtributoFN.equals("si")) {
            int opcionEditarFN;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Cedula");
                System.out.println(" 2. Nombre");
                System.out.println(" 3. Direccion");
                System.out.println(" 4. Telefono");
                System.out.println(" 5. Gastos");
                System.out.println(" 6. Fecha de Nacimiento");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarFN = input.nextInt();

                switch (opcionEditarFN) {
                    case 1: editarCedula(cliente); break;
                    case 2: editarNombre(cliente); break;
                    case 3: editarDireccion(cliente); break;
                    case 4: editarTelefono(cliente); break;
                    case 5: editarGastos(cliente); break;
                    case 6: editarFechaNacimiento(cliente); break;
                    case 7: break;
                }

                if (opcionEditarFN >= 1 && opcionEditarFN <= 6) {
                    break;
                }

            } while (opcionEditarFN != 7);
        }

    }

}
