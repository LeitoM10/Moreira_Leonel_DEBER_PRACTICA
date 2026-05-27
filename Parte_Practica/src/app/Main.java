package app;

import modelo.*;
import servicio.*;
import util.Validador;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpleadoServicio servicio = new EmpleadoServicio();
        int opcion = 0;

        do {
            try {
                System.out.println("\n===== CLÍNICA SALUD TOTAL =====");
                System.out.println("1. Registrar médico");
                System.out.println("2. Registrar administrativo");
                System.out.println("3. Mostrar empleados");
                System.out.println("4. Buscar por cédula");
                System.out.println("5. Eliminar registro");
                System.out.println("9. Salir");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    case 1:
                        System.out.println("Cédula:");
                        String cedula = sc.nextLine();

                        if (servicio.existeCedula(cedula)) {
                            System.out.println("Cédula duplicada");
                            break;
                        }

                        System.out.println("Nombre:");
                        String nombre = sc.nextLine();

                        Medico m = new Medico(cedula, nombre, 30, "099", "correo@mail.com",
                                "General", 10, 20);

                        servicio.registrar(m);
                        System.out.println("Médico registrado");
                        break;

                    case 2:
                        System.out.println("Cédula:");
                        String ced2 = sc.nextLine();

                        Administrativo a = new Administrativo(ced2, "Admin", 25, "098", "admin@mail.com",
                                "RRHH", 160, 4.5);

                        servicio.registrar(a);
                        System.out.println("Administrativo registrado");
                        break;

                    case 3:
                        servicio.mostrar();
                        break;

                    case 4:
                        System.out.println("Ingrese cédula:");
                        String buscar = sc.nextLine();

                        Empleado e = servicio.buscar(buscar);

                        if (e != null) {
                            e.mostrarInformacion();
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;

                    case 5:
                        System.out.println("Cédula a eliminar:");
                        String eliminar = sc.nextLine();
                        servicio.eliminar(eliminar);
                        System.out.println("Eliminado");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error: opción inválida");
            }

        } while (opcion != 9);
    }
}