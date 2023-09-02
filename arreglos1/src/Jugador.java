public class Jugador implements Comparable<Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean esTitular;

    public Jugador(Integer nroCamiseta, String nombre, Boolean lesionado, Boolean esTitular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return this.nroCamiseta.compareTo(otroJugador.nroCamiseta);
    }

    public Boolean getLesionado() {
        return lesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre + " NÂ° Camiseta: "+nroCamiseta;
    }

}