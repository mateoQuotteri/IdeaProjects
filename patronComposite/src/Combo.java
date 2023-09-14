import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> comprableList;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        //No pedimos por parametro la lista sino que yo con mi clase genero
        // mi propia lista de comprables
        //Si yo la pediria por parametro cuando vaya a instanciar el combo
        //deberia parsar ya una lista de comprables ya armada
        comprableList = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }
    @Override
    public Double calcularPrecio() {
        Double sumaPrecios = 0.0;
        for (Comprable comprable : comprableList) {
            sumaPrecios += comprable.calcularPrecio();
        }
        System.out.println("Aqui hay un combo");
        return sumaPrecios - sumaPrecios*descuento ;
    }
}
