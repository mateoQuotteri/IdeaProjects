public class CryptoCurrency {

    private Integer precio = 1800;
    private String nombre = "Ethereum";
    private String ticket = "ETH";
    private Integer ATH = 4986;


    private Integer edad = 8;

    public CryptoCurrency(Integer precioMoneda, String nombreMoneda , String ticketMoneda, Integer allTimeHigh
    , Integer edadMoneda){
        this.precio = precioMoneda;
        this.nombre = nombreMoneda;
        this.ticket = ticketMoneda;
        this.ATH = allTimeHigh;
        this.edad = edadMoneda;
    }

    public String getName(){
        return nombre;
    }
    public Integer getPrice(){
        return precio;
    }


}
