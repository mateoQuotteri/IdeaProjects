public class Hambriento  implements TamagochiState{

    @Override
    public TamagochiState comer() {
        return new Feliz();
    }

    @Override
    public TamagochiState beber() {
        return new Triste();
    }

    @Override
    public TamagochiState mimos() {
        return this;
        //Si esta hambientro y se le hace mimos sigue estando hambriento.
        //si hago new hambientro me crea uno nuevo y me borra el anterior
    }
}
