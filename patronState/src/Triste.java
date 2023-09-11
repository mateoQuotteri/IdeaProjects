public class Triste implements TamagochiState{
    @Override
    public TamagochiState comer() {
        System.out.println("Beep beep!");
        return this;
    }

    @Override
    public TamagochiState beber() {
        System.out.println("Beep beep beep!");
        return new Feliz();
    }

    @Override
    public TamagochiState mimos() {
        return new Feliz();

    }
}
