import java.util.ArrayList;

public class Idol implements Observable{
    private boolean enLive;
    private ArrayList<Observador> observadores = new ArrayList<>();

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String cambio) {
        for (Observador o : observadores) {
            o.actualizar(cambio);
        }
    }

    public void transmitir() {
      enLive=true;
      notificar("Transmitiendo en vivo en ww.link.com");
    }
    public void finalizarTransmision() {
        enLive=false;
        notificar("Transmision finalizada");
    }

}
