package dio.com.exceptions;

//classe excecao customizada
public class DivisaoNaoExataException extends Exception{ //classe custom. estende de Exception

    private int numerador;
    private int denominador;

    //contrutor
    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}