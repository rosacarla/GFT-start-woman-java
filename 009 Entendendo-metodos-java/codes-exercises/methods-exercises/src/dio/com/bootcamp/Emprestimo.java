package dio.com.bootcamp;
/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {

        return 3;
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.45;
    }
    //criado metodo principal para calculo, usado pela classe principal Main //
    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {  //condição de emprestimo em 2 x //

            // chamada interna de metodo getTaxaDuasParcelas() //
            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {   //condição de emprestimo em 3 x //

            // chamada interna de metodo getTaxaTresParcelas() //
            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {  //condição negativa pra emprestimo fora das 2 condições permitidas //
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}