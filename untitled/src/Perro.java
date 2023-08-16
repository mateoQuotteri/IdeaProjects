public class Perro {
    private String apodo;

    public Perro(String apodo){
        this.apodo = apodo;
    }

    public Object ladrar(){
         // System.out.println("Guau guau!");
        return "Guau Guau";
    }

    public String getApodo() {
        return apodo;
    }


}