import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *  Incluídas mensagens para interação com usuário e formatação da interface do programa.
 */
public class CompletaAlbum {
    public static void main(String[] args) {

        System.out.println("====================================================================");
        System.out.println("                  ~%~ PROGRAMA COMPLETA ALBUM ~%~                   ");
        System.out.println("\nVamos descobrir quantas figurinhas faltam pra completar seu album?");
        System.out.println("Lembre de teclar ENTER depois de digitar!");
        System.out.println("====================================================================\n");
        Scanner scan = new Scanner(System.in); //input das quantidades de figurinhas
        System.out.println("1- Informe o numero total de figurinhas do album: ");
        int numTotal = scan.nextInt(); //scanner da qtde total de figurinhas que completam o album
        System.out.println("\n2- Informe quantas figurinhas foram compradas: ");
        int numFigCompradas = scan.nextInt();  //scanner da qtde de figurinhas compradas
        Set<Integer> setFig = new HashSet<>(numFigCompradas);  //inicia conj  que recebe nro de cada figur. comprada

        System.out.println("\n3- Informe o numero de cada figurinha comprada: ");
        //loop para solicitar nros de cada figurinha comprada
        int count = 0; //inicia contador do loop
        for (int i = 0; i < numFigCompradas; i++) {
            //solicita nro de figurinha enquanto qtde for menor que nro de figur. compradas

            setFig.add(scan.nextInt());  //adiciona no conjunto o item que foi lido com scanner
            count++; //soma qtde comprada
        }

        //imprime quantas figurinhas faltam no album
        System.out.println("====================================================================");
        System.out.println("\nFalta essa quantidade de figurinhas: ");
        System.out.println(numTotal - setFig.size()); //calcula diferenca entre qtde total do album e qtde de figur. nao
                                                      //repetidas no conj. (obtida com metodo size())
        System.out.println("====================================================================\n");

        scan.close(); //fecha o fluxo e libera recursos que estavam ocupados no fluxo
   }
}




