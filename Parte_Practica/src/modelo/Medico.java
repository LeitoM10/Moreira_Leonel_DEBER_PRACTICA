package modelo;

public class Medico extends Empleado {

    private String especialidad;
    private int numeroPacientes;
    private double valorConsulta;

    public Medico(String cedula, String nombre, int edad, String telefono, String correo,
                  String especialidad, int numeroPacientes, double valorConsulta) {
        super(cedula, nombre, edad, telefono, correo);
        this.especialidad = especialidad;
        this.numeroPacientes = numeroPacientes;
        this.valorConsulta = valorConsulta;
    }

    @Override
    public double calcularPago() {
        return numeroPacientes * valorConsulta;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Pago: " + calcularPago());
    }
}