public class Feliz implements TamagochiState{
    @Override
    public TamagochiState comer() {
        return new Sediento();
    }

    @Override
    public TamagochiState beber() {
        return new Hambriento();
    }

    @Override
    public TamagochiState mimos() {
        return this;
        //Si esta feliz y se le hace mimos sigue estando feliz.
        //si hago new feliz me crea uno nuevo y me borra el anterior
    }
}
