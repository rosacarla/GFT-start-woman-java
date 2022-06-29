package dio.com.poo.relacoes;

/**
 * Interface de exemplo para exercícios da parte 5 do curso de POO,
 * a fim de mostrar a implementação de uma interface.
 */

public interface OperacaoMatematica {

    //definidas 4 operacoes basicas com 2 operandos pra cada
    default void soma(double operando1, double operando2) {  //todos os metodos tem assinatura com nome e parametros

    }

    default void subtracao(double operando1, double operando2) {  //todos os metodos não tem corpo

    }

    default void multiplicacao(double operando1, double operando2) {

    } //todos exemplificam forma simples de criação de metodo


    default void divisao(double operando1, double operando2) {

    } //em geral, casos de interfaces com metodos vazios cobrem a maioria das necessidades

}
