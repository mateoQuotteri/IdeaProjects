import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo{
    private String nombre;
    private List<Jugador> jugadorList;

    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadorList = new ArrayList(); //Lista de jugadores
    }

    public void addJugador(Jugador jugador){
        jugadorList.add(jugador);
    }

    public Integer getCantidadJugadoresLesionados(){
        Integer cantidadLesionados = 0;
        for (Jugador jugador : jugadorList) {
            if(jugador.getLesionado()&&jugador.getEsTitular()){
                cantidadLesionados++;
            }
        }
        return cantidadLesionados;
    }
    public void mostrarJugadoresTitulares(){
        Collections.sort(jugadorList); //Los ordena de forma ascendente
        for (Jugador jugador : jugadorList) {
            if(jugador.getEsTitular()){
                System.out.println(jugador);
            }
        }
    }
}