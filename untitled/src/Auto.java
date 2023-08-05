public class Auto {

    private String patente;
    private String modelo;
    private String marca;

    public Auto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente(){return patente;}
}
