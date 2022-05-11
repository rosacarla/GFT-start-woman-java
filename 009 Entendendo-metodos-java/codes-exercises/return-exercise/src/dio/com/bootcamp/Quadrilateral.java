package dio.com.bootcamp;
/**
 * Classe de exemplo para o exercício da Aula 3 de Métodos.
 */
public class Quadrilateral {

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    /*
         public static long abc() {
         return 1.6;   //retorno double é incompativel com tipo de dado long da classe abc/
     }                 //pra resolver bug, poderia trocar long por double ou 1.6 por 1 //
    */

    public static double abc() {
        return 1.6;   //retorno compativel com tipo de dado da classe abc
    }

}