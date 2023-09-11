public class ProductoFactory {
    private static ProductoFactory instance = new ProductoFactory();
    private ProductoFactory(){
    }
    public static ProductoFactory getInstance(){
        return instance;
    }
    public Producto construirProducto(String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new Caja(2.0,10.0,10.0,10.0);
            case "PELOTAFUTBOL":
                return new Pelota(0.5,11.0);
            case "PELOTATENIX":
                return new Pelota(0.2,0.32);
        }
        return null;
    }

}
