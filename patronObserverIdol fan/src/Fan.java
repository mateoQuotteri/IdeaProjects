public class Fan implements Observador{
    private String apellido;
    private String nombre;
    private int nivelFan;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelFan() {
        return nivelFan;
    }

    public void setNivelFan(int nivelFan) {
        this.nivelFan = nivelFan;
    }

    public Fan(String apellido, String nombre, int nivelFan) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nivelFan = nivelFan;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(getApellido() + ", " + getNombre() + " Mensaaje de idol: " + notificacion) ;
    }
}
