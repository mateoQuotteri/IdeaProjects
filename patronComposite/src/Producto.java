public class Producto implements Comprable{
    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public Double calcularPrecio() {
        System.out.println("Aqui hay un solo producto: " + nombre + " y su precio es: "+ precio);
        return precio;
    }
}
