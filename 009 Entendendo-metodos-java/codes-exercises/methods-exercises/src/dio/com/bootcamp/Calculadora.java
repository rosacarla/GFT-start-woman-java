package dio.com.bootcamp;
/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */

public class Calculadora {

    public static void soma(double numero1, double numero2) {  /*metodo soma, recebe 2 numeros por parametro */
        // mofificador static possibilita chamar metodo a partir de uma classe //
        //retono de void é vazio //

        double resultado = numero1 + numero2; //armazena resultado da soma em var temporaria

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado); //mostra resultado //
    }

    public static void subtracao(double numero1, double numero2) {  /*metodo subtracao*/

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) { /*metodo multiplicacao */

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {   /*metodo divisao */

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}