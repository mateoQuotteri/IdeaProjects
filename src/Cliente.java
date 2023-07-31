/*
Ejercicio Cliente (Constructor)
Una vez que ya tenemos nuestra clase Cliente funcionando es hora de crearle una constructor

Nuestro constructor tiene que recibir nombre y apellido y asignárselo a los atributos de nuestra clase Cliente */

public class Cliente {

//NO TOCAR CODIGO
    private String nombre;
    private String apellido;
public Cliente(String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
}

//NO TOCAR ESTE CODIGO
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}