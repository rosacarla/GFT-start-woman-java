package dio.com.bootcamp;
/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        // chama metodos (das operações) a partir da classe Calculadora //
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        // chama metodo obterMensaggem a partir da classe Mensagem //
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        /* chama metodo Calcular() a partir da classe Emprestimo;
        passa metodos get(...) por parametro para obter retorno */

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5); //passado valor 5 direto, sem metodo //

    }
}