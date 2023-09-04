public class ClienteException extends Exception{

    //creo la excepcion de por si
    public ClienteException() {
        super();
    }

    //le agrego a la excepcion creade aqui arriba la opcion de poder personalizar un msj
    public ClienteException(String message) {
        super(message);
    }
}
