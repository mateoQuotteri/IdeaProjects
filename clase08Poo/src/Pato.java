public class Pato extends Animal{

    @Override
    public void hacerRuido() {
        System.out.println("Cuak Cuak");
    }

    public Pato(String nombre, Double energia) {
        super(nombre, energia);
    }
}
