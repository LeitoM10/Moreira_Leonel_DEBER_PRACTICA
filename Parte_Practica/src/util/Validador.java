package util;

public class Validador {

    public static boolean esNumero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono.matches("\\d+");
    }

    public static boolean noVacio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
}