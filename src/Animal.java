public class Animal {

    private String nombre;
    private int edad;
    private String tipo;

    public Animal(String nombreAnimal, int edadAnimal, String tipoAnimal) {
        nombre = nombreAnimal;
        edad = edadAnimal;
        tipo = tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nombre + " tiene " + edad + " años y es un " + tipo;
    }
}