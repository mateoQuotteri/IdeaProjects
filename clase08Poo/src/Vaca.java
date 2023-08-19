public class Vaca extends Animal{
    private Double pesaje;

    public Vaca(String nombre, Double energia, Double pesaje) {
        super(nombre, energia);
        this.pesaje = pesaje;
    }

    @Override
    public void comer(Double comidaEnPeso) {
        super.comer(comidaEnPeso); // se sube la energia
        pesaje = comidaEnPeso/2; // el 50% de la comida lo sube en peso

    }

    @Override
    public void hacerRuido() {
        System.out.println("Muuuuu");
    }

    @Override
    public String toString() {
        return super.toString() + " , y el peso de la vaca es: "+ pesaje;
    }
}
