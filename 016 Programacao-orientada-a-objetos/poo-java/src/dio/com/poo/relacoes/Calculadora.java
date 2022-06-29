package dio.com.poo.relacoes;

/**
 * Classe de exemplo para exercicios da parte 5 do curso POO,
 * a fim de mostrar implementação de Interface OperacaoMatematica.
 */

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtracao: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 / operando2);
    }

}
