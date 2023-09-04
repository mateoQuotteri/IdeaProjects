public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Double deuda;
    private Double limite;

    public Cliente(String nombre, String apellido, String DNI, Double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite= limite;
        deuda=0.0;
    }
    public void comprar(Double importe) throws ClienteException{
        if(deuda+importe>limite){
            throw new ClienteException("Límite superado para la operación");
        }
        deuda+=importe;
    }
    public void saldarDeuda(Double importe) throws ClienteException {
        if(deuda<=0.0){
            throw new ClienteException("Hey, no hay que pagar nada");
        }
        deuda-=importe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nombre + ' ' +
                apellido + ' ' +
                ", su deuda es=" + deuda + "$ }";
    }
}