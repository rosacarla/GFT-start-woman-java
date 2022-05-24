package dio.com.bootcamp;
/**
 * Classe de exemplo pro exercício da Aula 2 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.
 */
public class Main {

    public static void main(String[] args) {

        //conjunto de operandos
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("Conjunto de operandos");
        System.out.println("b1 = true" + " " + "b2 = false");
        System.out.println("b3 = true" + " " + "b4 = false\n");

        System.out.println("Operações lógicas");
        //operação logica de disjunção //
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        //operação logica de disjunção //
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        //operação logica de disjunção exclusiva//
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        //operação logica de negação//
        System.out.println("!b1" + " " + !b1);
        System.out.println("!b2" + " " + !b2);

        //conjunto de variáveis //
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("\nConjunto de variáveis (int e float)");
        System.out.println("{i1 = 10, i2 = 5, f1 = 20f, f2 = 50f}");
        System.out.println("\nOperações com diversos operadores em expressões");
        System.out.println("((i1 + i2) < (f2 - f1)) && true ==> " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) ==> " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println("\nConjunto de variáveis pra verificar pagamento de auxílio");
        System.out.println("salarioMensal = 11893.58d");
        System.out.println("mediaSalario = 10500d");
        System.out.println("quantidadeDependentes = 4");
        System.out.println("mediaDependentes = 2\n");

        //operações lógicas entre variaveis
        System.out.println("Salário mensal abaixo da média e quantidade de dependentes maior ou igual à média?");
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        //variaveis intermediarias
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println("\nSalário baixo e muitos dependentes?");
        System.out.println((salarioBaixo) && (muitosDependentes));

        //operação lógica simplificada
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes); //var intermediaria
        System.out.println("\nRecebe auxílio? " + recebeAuxilio);

    }
}