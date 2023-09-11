public class Sediento implements TamagochiState{
    @Override
    public TamagochiState comer() {
        return new Triste();
    }

    @Override
    public TamagochiState beber() {
        return new Feliz();
    }

    @Override
    public TamagochiState mimos() {
        return this;
        //Si esta Sediento y se le hace mimos sigue estando Sedientp.
        //si hago new Sediento me crea uno nuevo y me borra el anterior
    }
}
