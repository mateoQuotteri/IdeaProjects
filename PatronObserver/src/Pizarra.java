import java.util.ArrayList;

public class Pizarra implements Observable {
    private float precioActual;
    private ArrayList <Observador> observadores = new ArrayList<>();
    public void cambiarPrecio(float precioActual) {
        this.precioActual = precioActual;
    }
    public float obtenerPrecio(){
        return precioActual;
    }

    @Override
    public void agregar(Observador o ){
        this.observadores.add(o);
    }
    @Override
    public void quitar(Observador o) {
        // TODO Auto-generated method stub
        this.observadores.remove(o);
    }
    @Override
    public void notificar(String cambio) {
        // TODO Auto-generated method stub
       for (Observador o : observadores) {
           System.out.println(o.actualizar() + cambio);
       }
    }
}
