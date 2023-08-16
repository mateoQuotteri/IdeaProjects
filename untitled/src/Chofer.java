public class Chofer {
    private String nombre;
    private String apellido;
    private Auto auto;

    public Chofer( String nombre , String apellido, Auto auto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }
    public String verPatente(){return auto.getPatente();}

    @Override
    public String toString() {
        return "Nombre: " + nombre + "/n" +
                "Apellido: " + apellido;
    }

    @Override
    public int hashCode() {
       int hash = 31;
       hash = hash * nombre.hashCode();
       hash = hash * apellido.hashCode();
       return hash
    }
}
