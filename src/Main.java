// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

    }
    Ejercicio 1
Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
mensaje.

Ejercicio 2



Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
Informar el resultado obtenido.

    public static void main(String[] args) {
        String name1 = "Jorge";
        String name2 = "Jorge";

        if (name1.equals(name2)) {
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres NO son iguales");
        }

    }*/
    public static void main(String[] args) {
      //  Animal jack = new Animal("Jack", 9, "Perro");
       // System.out.println(jack.toString());

        CryptoCurrency Ether = new CryptoCurrency(1896, "Ethereum" ,
                "ETH" , 4695, 8);

        System.out.println(Ether.getName() + " tiene este precio: " + Ether.getPrice());

    /*
          Para representar cada una de las características de las mascotas, crear una variable y darle
  el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
  queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
  tabla, vamos a tener que mostrar la información del animal. La información va a mostrarse
  como el siguiente ejemplo:
  “Manchitas tiene 2 años”
  “Manchitas come un kilo y medio y hace guau guau”

    public static void main(String[] args) {


        String nombre = "Manchitas";
        int edad =2;
        double comida = 1.5;
        String ladrido = "Guau Guau Guau";
        System.out.println(nombre + " tiene " + edad + " años");
        System.out.println(nombre + " come " + comida+ " kg y hace " + ladrido);


    }*/
}
}


