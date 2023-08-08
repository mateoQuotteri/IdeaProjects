public class Paseador {
    private String nombre;

    public Paseador(String nombre) {
        this.nombre = nombre;
    }

    public void paseaUnPerro(Perro perro){
        System.out.println(nombre+" sacó a pasear a "+perro.getApodo());
        perro.ladrar();
        perro.ladrar();
    }

    public void hizoLadrarAlPerro(Perro perro){
        System.out.println(nombre + " hizo que el perro diga: " + perro.ladrar());
    }



}
