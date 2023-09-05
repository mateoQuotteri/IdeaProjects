public class Jugador {
    private int edad;
    private String nombre;
    private Integer partidosJugados;
    private String apellido;

    public Jugador(int edad, String nombre, Integer partidosJugados, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPartidosJugados() {
        return partidosJugados;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPartidosJugados(Integer partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void addPartidoJugado() throws JugadorException  {
        if (partidosJugados >= 100)
            throw new JugadorException("Ya jugaste muchos partidos");

        partidosJugados++;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
