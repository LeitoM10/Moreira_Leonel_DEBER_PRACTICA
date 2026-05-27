package servicio;

import modelo.*;
import java.util.ArrayList;

public class EmpleadoServicio {

    private ArrayList<Empleado> lista = new ArrayList<>();

    public boolean existeCedula(String cedula) {
        for (Empleado e : lista) {
            if (e.getCedula().equals(cedula)) return true;
        }
        return false;
    }

    public void registrar(Empleado e) {
        lista.add(e);
    }

    public void mostrar() {
        for (Empleado e : lista) {
            e.mostrarInformacion();
            System.out.println("---------------------");
        }
    }

    public Empleado buscar(String cedula) {
        for (Empleado e : lista) {
            if (e.getCedula().equals(cedula)) return e;
        }
        return null;
    }

    public void eliminar(String cedula) {
        lista.removeIf(e -> e.getCedula().equals(cedula));
    }
}