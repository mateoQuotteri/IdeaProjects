public class Persona {
    private String nombre;
    private Perro perro; //Aquí está dada la relación de "Tiene un"

    public Persona(String nombre, Perro perro){
        this.nombre = nombre;
        this.perro = perro;
    }

    public void pasearConSuPerro(){
        System.out.println(nombre + " está paseando con "+ perro.getApodo());
        perro.ladrar();
    }

}