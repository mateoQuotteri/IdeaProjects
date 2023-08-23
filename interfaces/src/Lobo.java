public class Lobo implements Ladrador {

    private int edad;
    private String nombre;
    @Override
    public String ladrar() {
        return "Soy un doberman y ladro: GUA GUAU, mi edad es: " + edad ;
    }

    public Lobo(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
