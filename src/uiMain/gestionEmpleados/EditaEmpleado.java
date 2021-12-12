package uiMain.gestionEmpleados;

import gestionAplicacion.empleados.Cajero;
import gestionAplicacion.empleados.Empleado;
import gestionAplicacion.empleados.Tecnico;

import java.util.Scanner;

public class EditaEmpleado {

    public static void editarEmpleado() {

        Scanner input = new Scanner(System.in);

        System.out.println("Empleados: ");

        for (int i = 0; i < Empleado.getEmpleados().size(); i++) {
            System.out.println((i+1) + " " + Empleado.getEmpleados().get(i));
        }

        System.out.print("Elige un Empleado a editar: ");
        int empleadoAEditar = input.nextInt();
        input.nextLine();

        String editaOtroEmpleado;

        do {
            int opcionEditar;

            if (Empleado.getEmpleados().get(empleadoAEditar-1) instanceof Cajero) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Cantidad en ventas");
                    System.out.println(" 7. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditar = input.nextInt();
                    input.nextLine();

                    switch (opcionEditar) {
                        case 1: editarNombre(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 2: editarCedula(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 3: editarSueldo(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 4: editarNumeroContacto(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 5: editarCorreo(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 6: editarCantidadEnVentas(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 7: break;
                    }

                    if (opcionEditar >= 1 && opcionEditar <= 6) {
                        break;
                    }

                } while (opcionEditar != 7);
            }

            else if (Empleado.getEmpleados().get(empleadoAEditar-1) instanceof Tecnico) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Años de experiencia");
                    System.out.println(" 7. Servicios Realizados");
                    System.out.println(" 8. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditar = input.nextInt();
                    input.nextLine();

                    switch (opcionEditar) {
                        case 1: editarNombre(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 2: editarCedula(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 3: editarSueldo(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 4: editarNumeroContacto(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 5: editarCorreo(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 6: editarAnosExperiencia(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 7: editarServiciosRealizados(Empleado.getEmpleados().get(empleadoAEditar-1)); break;
                        case 8: break;
                    }

                    if (opcionEditar >= 1 && opcionEditar <= 7) {
                        break;
                    }

                } while (opcionEditar != 8);
            }

            System.out.print("¡Empleado editado con éxito!, ¿desea editar otro Empleado? [si/no] : ");
            editaOtroEmpleado = input.nextLine();

        } while (editaOtroEmpleado.equals("si"));

    }

    public static void editarNombre(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = input.nextLine();

        empleado.setNombre(nuevoNombre);

        System.out.print("¡Nombre editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoName = input.nextLine();

        if (editarOtroAtributoName.equals("si")) {
            int opcionEditarName;

            if (empleado instanceof Cajero) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Cantidad en ventas");
                    System.out.println(" 7. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarName = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarName) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarCantidadEnVentas(empleado); break;
                        case 7: break;
                    }

                    if (opcionEditarName >= 1 && opcionEditarName <= 6) {
                        break;
                    }

                } while (opcionEditarName != 7);
            }

            else if (empleado instanceof Tecnico) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Años de experiencia");
                    System.out.println(" 7. Servicios Realizados");
                    System.out.println(" 8. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarName = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarName) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarAnosExperiencia(empleado); break;
                        case 7: editarServiciosRealizados(empleado); break;
                        case 8: break;
                    }

                    if (opcionEditarName >= 1 && opcionEditarName <= 7) {
                        break;
                    }

                } while (opcionEditarName != 8);

            }
        }
    }

    public static void editarCedula(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva cedula: ");
        String nuevaCedula = input.nextLine();

        empleado.setCedula(nuevaCedula);

        System.out.print("¡Cedula editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoCed = input.nextLine();

        if (editarOtroAtributoCed.equals("si")) {
            int opcionEditarCed;

            if (empleado instanceof Cajero) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Cantidad en ventas");
                    System.out.println(" 7. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarCed = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarCed) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarCantidadEnVentas(empleado); break;
                        case 7: break;
                    }

                    if (opcionEditarCed >= 1 && opcionEditarCed <= 6) {
                        break;
                    }

                } while (opcionEditarCed != 7);
            }

            else if (empleado instanceof Tecnico) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Años de experiencia");
                    System.out.println(" 7. Servicios Realizados");
                    System.out.println(" 8. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarCed = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarCed) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarAnosExperiencia(empleado); break;
                        case 7: editarServiciosRealizados(empleado); break;
                        case 8: break;
                    }

                    if (opcionEditarCed >= 1 && opcionEditarCed <= 7) {
                        break;
                    }

                } while (opcionEditarCed != 8);

            }
        }
    }

    public static void editarSueldo(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo sueldo: ");
        double nuevoSueldo = input.nextDouble();
        input.nextLine();

        empleado.setSueldo(nuevoSueldo);

        System.out.print("¡Sueldo editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoSueldo = input.nextLine();

        if (editarOtroAtributoSueldo.equals("si")) {
            int opcionEditarSueldo;

            if (empleado instanceof Cajero) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Cantidad en ventas");
                    System.out.println(" 7. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarSueldo = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarSueldo) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarCantidadEnVentas(empleado); break;
                        case 7: break;
                    }

                    if (opcionEditarSueldo >= 1 && opcionEditarSueldo <= 6) {
                        break;
                    }

                } while (opcionEditarSueldo != 7);
            }

            else if (empleado instanceof Tecnico) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Años de experiencia");
                    System.out.println(" 7. Servicios Realizados");
                    System.out.println(" 8. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarSueldo = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarSueldo) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarAnosExperiencia(empleado); break;
                        case 7: editarServiciosRealizados(empleado); break;
                        case 8: break;
                    }

                    if (opcionEditarSueldo >= 1 && opcionEditarSueldo <= 7) {
                        break;
                    }

                } while (opcionEditarSueldo != 8);

            }
        }
    }

    public static void editarNumeroContacto(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo numero de contacto: ");
        String nuevoNumeroContacto = input.nextLine();

        empleado.setNumeroContacto(nuevoNumeroContacto);

        System.out.print("¡Numero de contacto editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoNC = input.nextLine();

        if (editarOtroAtributoNC.equals("si")) {
            int opcionEditarNC;

            if (empleado instanceof Cajero) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Cantidad en ventas");
                    System.out.println(" 7. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarNC = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarNC) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarCantidadEnVentas(empleado); break;
                        case 7: break;
                    }

                    if (opcionEditarNC >= 1 && opcionEditarNC <= 6) {
                        break;
                    }

                } while (opcionEditarNC != 7);
            }

            else if (empleado instanceof Tecnico) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Años de experiencia");
                    System.out.println(" 7. Servicios Realizados");
                    System.out.println(" 8. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarNC = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarNC) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarAnosExperiencia(empleado); break;
                        case 7: editarServiciosRealizados(empleado); break;
                        case 8: break;
                    }

                    if (opcionEditarNC >= 1 && opcionEditarNC <= 7) {
                        break;
                    }

                } while (opcionEditarNC != 8);

            }
        }
    }

    public static void editarCorreo(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nuevo correo: ");
        String nuevoCorreo = input.nextLine();

        empleado.setCorreo(nuevoCorreo);

        System.out.print("¡Correo editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoCorreo = input.nextLine();

        if (editarOtroAtributoCorreo.equals("si")) {
            int opcionEditarCorreo;

            if (empleado instanceof Cajero) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Cantidad en ventas");
                    System.out.println(" 7. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarCorreo = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarCorreo) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarCantidadEnVentas(empleado); break;
                        case 7: break;
                    }

                    if (opcionEditarCorreo >= 1 && opcionEditarCorreo <= 6) {
                        break;
                    }

                } while (opcionEditarCorreo != 7);
            }

            else if (empleado instanceof Tecnico) {
                do {
                    System.out.println("¿Que deseas editar?");
                    System.out.println(" 1. Nombre");
                    System.out.println(" 2. Cedula");
                    System.out.println(" 3. Sueldo");
                    System.out.println(" 4. Numero de contacto");
                    System.out.println(" 5. Correo");
                    System.out.println(" 6. Años de experiencia");
                    System.out.println(" 7. Servicios Realizados");
                    System.out.println(" 8. Regresar");
                    System.out.print("Indique su eleccion : ");
                    opcionEditarCorreo = input.nextInt();
                    input.nextLine();

                    switch (opcionEditarCorreo) {
                        case 1: editarNombre(empleado); break;
                        case 2: editarCedula(empleado); break;
                        case 3: editarSueldo(empleado); break;
                        case 4: editarNumeroContacto(empleado); break;
                        case 5: editarCorreo(empleado); break;
                        case 6: editarAnosExperiencia(empleado); break;
                        case 7: editarServiciosRealizados(empleado); break;
                        case 8: break;
                    }

                    if (opcionEditarCorreo >= 1 && opcionEditarCorreo <= 7) {
                        break;
                    }

                } while (opcionEditarCorreo != 8);

            }
        }
    }

    public static void editarCantidadEnVentas(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva cantidad hecha en ventas: ");
        double nuevaCantidadEnVentas = input.nextDouble();
        input.nextLine();

        ((Cajero) empleado).setCantidadEnVentas(nuevaCantidadEnVentas);

        System.out.print("¡Cantidad en ventas editado con éxito!, ¿desea editar otro atributo del empleado Cajero? [si/no] : ");
        String editarOtroAtributoC = input.nextLine();

        if (editarOtroAtributoC.equals("si")) {
            int opcionEditarC;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Nombre");
                System.out.println(" 2. Cedula");
                System.out.println(" 3. Sueldo");
                System.out.println(" 4. Numero de contacto");
                System.out.println(" 5. Correo");
                System.out.println(" 6. Cantidad en ventas");
                System.out.println(" 7. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarC = input.nextInt();
                input.nextLine();

                switch (opcionEditarC) {
                    case 1: editarNombre(empleado); break;
                    case 2: editarCedula(empleado); break;
                    case 3: editarSueldo(empleado); break;
                    case 4: editarNumeroContacto(empleado); break;
                    case 5: editarCorreo(empleado); break;
                    case 6: editarCantidadEnVentas(empleado); break;
                    case 7: break;
                }

                if (opcionEditarC >= 1 && opcionEditarC <= 6) {
                    break;
                }

            } while (opcionEditarC != 7);

        }

    }

    public static void editarAnosExperiencia(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva cantidad de años de experiencia: ");
        int nuevosAE = input.nextInt();
        input.nextLine();

        ((Tecnico) empleado).setAnosExperiencia(nuevosAE);

        System.out.print("¡Años de experiencia editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoAE = input.nextLine();

        if (editarOtroAtributoAE.equals("si")) {
            int opcionEditarAE;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Nombre");
                System.out.println(" 2. Cedula");
                System.out.println(" 3. Sueldo");
                System.out.println(" 4. Numero de contacto");
                System.out.println(" 5. Correo");
                System.out.println(" 6. Años de experiencia");
                System.out.println(" 7. Servicios Realizados");
                System.out.println(" 8. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarAE = input.nextInt();
                input.nextLine();

                switch (opcionEditarAE) {
                    case 1: editarNombre(empleado); break;
                    case 2: editarCedula(empleado); break;
                    case 3: editarSueldo(empleado); break;
                    case 4: editarNumeroContacto(empleado); break;
                    case 5: editarCorreo(empleado); break;
                    case 6: editarAnosExperiencia(empleado); break;
                    case 7: editarServiciosRealizados(empleado); break;
                    case 8: break;
                }

                if (opcionEditarAE >= 1 && opcionEditarAE <= 7) {
                    break;
                }

            } while (opcionEditarAE != 8);

        }

    }

    public static void editarServiciosRealizados(Empleado empleado) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la nueva cantidad de servicios realizados: ");
        int nuevosSR = input.nextInt();
        input.nextLine();

        ((Tecnico) empleado).setServiciosRealizados(nuevosSR);

        System.out.print("¡Cantidad de servicios Realizados editado con éxito!, ¿desea editar otro atributo del empleado? [si/no] : ");
        String editarOtroAtributoSR = input.nextLine();

        if (editarOtroAtributoSR.equals("si")) {
            int opcionEditarSR;

            do {
                System.out.println("¿Que deseas editar?");
                System.out.println(" 1. Nombre");
                System.out.println(" 2. Cedula");
                System.out.println(" 3. Sueldo");
                System.out.println(" 4. Numero de contacto");
                System.out.println(" 5. Correo");
                System.out.println(" 6. Años de experiencia");
                System.out.println(" 7. Servicios Realizados");
                System.out.println(" 8. Regresar");
                System.out.print("Indique su eleccion : ");
                opcionEditarSR = input.nextInt();
                input.nextLine();

                switch (opcionEditarSR) {
                    case 1: editarNombre(empleado); break;
                    case 2: editarCedula(empleado); break;
                    case 3: editarSueldo(empleado); break;
                    case 4: editarNumeroContacto(empleado); break;
                    case 5: editarCorreo(empleado); break;
                    case 6: editarAnosExperiencia(empleado); break;
                    case 7: editarServiciosRealizados(empleado); break;
                    case 8: break;
                }

                if (opcionEditarSR >= 1 && opcionEditarSR <= 7) {
                    break;
                }

            } while (opcionEditarSR != 8);

        }

    }

}

