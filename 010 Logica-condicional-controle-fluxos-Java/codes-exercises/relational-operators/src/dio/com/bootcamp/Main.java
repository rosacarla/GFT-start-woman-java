package dio.com.bootcamp;
/**
 * Classe de exemplo pro exercício da Aula 1 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.
 */
public class Main {

    public static void main(String[] args) {

        // criação de variaveis int, float, double, char, string, boolean //
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        // criação de variaveis long, byte, short //
        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        //mostra todas as variaveis
        System.out.println("Conjunto de variáveis");
        System.out.println("i1 = " + i1 + " " + "i2 = " + i2);
        System.out.println("f1 = " + f1 + " " + "f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("c1 = " + c1 + " " + "c2 = " + c2);
        System.out.println("s1 = " + s1 + " " + "s2 = " + s2 + " " + "s3 = " + s3);
        System.out.println("b1 = " + b1 + " " + "b2 = " + b2);

        System.out.println("\nl1 = " + l1 + " " + "l2 = " + l2);
        System.out.println("y1 = " + y1);
        System.out.println("h1 = " + h1);

        System.out.println("\nComparações entre as variáveis");
        //comparacoes com oper. rel. de similaridade e tamanho //
        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        //comparacoes de similaridade entre strings //
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //System.out.println(s1 >= s2); //(Fulano >= Fulano) é operação indevida //
        //System.out.println(s1 < s2); //Fulano < Fulano) exemplifica operacao incorreta//

        //comparacoes de similaridade entre booleanos //
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println(b1 > b2); //(true > false) não possibilita comparar tamanhos //
        //System.out.println(b1 <= i1); //(true <= 10) nao dá pra comparar tam. de boleano com inteiro //

        // comparacoes de similaridade possiveis entre tipos de dados diferentes
        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        //System.out.println(s2 != c1); //(fulano != x) char é de baixo nivel, transformado em numerico //
        //System.out.println(s3 != i1); //(cicrano != 10) impossivel comparar tipos de dados diferentes //

        // comparaces de similaridade e tamanho entre tipos de dados diferentes por serem numericos
        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));

    }
}