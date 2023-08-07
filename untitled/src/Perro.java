public class Perro {
    private String apodo;

    public Perro(String apodo){
        this.apodo = apodo;
    }

    public void ladrar(){
        System.out.println("Guau guau!");
    }

    public String getApodo() {
        return apodo;
    }
}