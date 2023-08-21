public class EmpleadoTesoreria extends Empleado {
    private int asientosContablesRealizados;
    @Override
    public void trabajar(){
        System.out.println("Empleado de tesoreria " + getNombre() + " trabajando y como todos soy un gruñon y ya realice estos asientos contables: " + asientosContablesRealizados);
    }

    public EmpleadoTesoreria(String nombre, String apellido, String dni, int asientosContablesRealizados) {
        super(nombre, apellido, dni);
        this.asientosContablesRealizados = asientosContablesRealizados;
    }
}
