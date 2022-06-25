import java.util.Scanner;

/**
 * Foram incluidas mensagens para interação com usuário e formatação de interface.
 */
public class DegustacaoCorreta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //input de tipo de vinho e respostas de competidores
        System.out.println("********************************************************************************");
        System.out.println("                     v~V~v PROGRAMA DEGUSTAÇÃO CORRETA v~V~v                    ");
        System.out.println("\n          Confira a quantidade de degustações corretas na competição.");
        System.out.println("\nTipos de vinhos da degustação: (1) Cabernet Franc; (2) Merlot; (3) Pinot Noir.");
        System.out.println("********************************************************************************");
        System.out.println("\nInforme o tipo de vinho degustado: ");
        String T = scan.nextLine(); //var recebe leitura da string do tipo de vinho
        System.out.println("\nInforme as respostas dos competidores (use espaço para separá-las): ");
        String respCompetidores = scan.nextLine(); //var recebe leitura das strings de respostas dos competidores
        String[] respCompetidoresSplit = respCompetidores.split(" "); //split separa as strings num array

        //loop para pedir respostas de competidores
        int count = 0; //inicia o contador
        for (int i = 0; i < respCompetidoresSplit.length; i++) { //repete enquanto qtde é menor que posicoes do array
            if (respCompetidoresSplit[i].equals(T)) {  //condicao: separar apenas respostas corretas (valor = T)
                count++; //soma respostas corretas
            }
        }
        //imprime resultado da soma do contador
        System.out.println("********************************************************************************");
        System.out.println("\nA quantidade de respostas corretas foi: ");
        System.out.println(count);
        System.out.println("********************************************************************************");

        scan.close(); //fecha o fluxo e libera recursos que estavam ocupados no fluxo
    }
}


