public class Cliente {
    private String nombre;
    private Double deuda;
    private Integer numeroCliente;


    // COMO SE INSTANCIA EL OBJETO
    public Cliente(Integer numeroCliente , String nombre){
this.nombre = nombre;
this.numeroCliente = numeroCliente;
deuda  = 0.0;
    }
    public String getNombre(){

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void incrementarDeuda(Double valor){
        System.out.println("Tu deuda anterior era: " +  deuda);
        Double deudaNueva = valor + deuda;
        System.out.println("Tu deuda actual es: " + deudaNueva);
    }

    public void pagarDeuda(){
        deuda = 0.0;
}
}



