/**
 * Classe de exemplo pra exercício da Aula 2.
 */

public class VariaveisExercicios {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000;  /*tamanho extrapola o previsto pra short até 32.767

        //int i1 = -10.000.000.000; /* tam. extrapola o previsto pra int até -2.147.483.647
        int i2 = 28500;

        long l1 = 1000000000000000000L; /*tam. de long até 9.223.372.036.854.775.807*/
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; /* falta F do float, sem ele Java interpreta como double*/
        float f2 = 10.68F;    /*tanto faz L ou l, F ou f*/

        double d1 = 85.69;  /* Java infere que é double mesmo sem D*/
        double d2 = 99.04D; /*declaracao explicita de double com D no final do nro*/

        char c1 = 'W';
        //char c2 = 'Tw';  /* char pode receber só 1 caractere */
        char c3 = '\u0057';  /* codigo unicode da letra W */

        String st1 = "Fulano";  /*é abordado como primitivo porque texto é dado muito comum*/
        String st2 = "Cicrano";  /*exceção de tipo de dado composto com uso como primitivo*/
        String st3 = "ag dgb se  se et t KNBJBJBB &*¨&%& 75894389";

        //String dt1 = "09/02/1981";   /*existe tipo de dado específico pra datas */

        boolean bo1 = true;   /*pra valores logicos*/
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
