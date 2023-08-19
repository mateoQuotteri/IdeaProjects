public abstract class Animal {
    private String nombre;
    private Double energia;

    public Animal(String nombre, Double energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    public void comer(Double comidaEnPeso) {
        energia += comidaEnPeso;
    }
    public abstract void hacerRuido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", energia=" + energia;
    }
}
