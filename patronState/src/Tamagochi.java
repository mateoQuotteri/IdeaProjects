public class Tamagochi {
    private String nombre;
    private TamagochiState estadoActual;

    public Tamagochi(String nombre) {
        this.nombre = nombre;
        this.estadoActual = new Feliz();
        //por defecto el tamagochi inicia feliz
    }
    public void darDeComer(){
       estadoActual = estadoActual.comer();
       //Variamos el estado actual (feliz en un inicio por defecto) y lo modificamos
        // segun como actua la clase
        //feliz si se le da de comer
        //si a la clase feliz se le da de comer pasa a Sediento
    }
    public void darDeBeber(){
        estadoActual = estadoActual.beber();
        //Variamos el estado actual (feliz en un inicio por defecto) y lo modificamos
        // segun como actua la clase
        //feliz si se le da de beber
        //si a la clase feliz se le da de beber pasa a Hambriento
    }
    public void darMimos(){
        estadoActual = estadoActual.mimos();
        //Variamos el estado actual (feliz en un inicio por defecto) y lo modificamos
        // segun como actua la clase
        //feliz si se le da mimos
        //si a la clase feliz se le da mimos se mantiene feliz
    }

    @Override
    public String toString() {
        return estadoActual.toString();
    }
}
