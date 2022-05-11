package dio.com.bootcamp;
/**
 * Classe de exemplo para o exercício da Aula 2 de Métodos.
 */
public class Quadrilatero {
    /* sobrecarga do metodo area pra cada um dos 4 quadilateros;
    cujos lados são passados por parametros diferentes para se
    calcular as respectivas areas */
    public static void area(double lado) {  //assinatura doo metodo = nome + 1 parametro //

        System.out.println("Área do quadrado:" + lado * lado);
    }
    //assinatura do metodo = nome + 2 parametros //
    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }
    //assinatura doo metodo = nome + 3 parametros //
    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }
    //assinatura doo metodo = nome + 2 parametros //
    public static void area(float diagonal1, float diagonal2) {
        /*
         foi usado tipo float para possibilitar a sobreacarga,
         porque com double haveria erro de compilação no código
        */

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}