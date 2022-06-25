import java.util.Scanner;

public class CoxinhaBueno {
        public static void main(String[] args) {
            System.out.println("Digite numero de coxinhas consumidas e numero de participantes (use espaço para separá-los): ");
            Scanner scan = new Scanner(System.in); //objeto scan recebe input de numeros
            String input = scan.nextLine(); //scanner dos numeros digitados

            String[] inputSplit = input.split(" ");
            //metodo split() divide a string dos numeros pelo espaço usado na digitacao e guarda em array de strings

            //conversao dos valores das strings em double
            double h = Double.parseDouble(inputSplit[0]);
            double p = Double.parseDouble(inputSplit[1]);

            //formula de calculo da media
            double media = h / p;

            //impressao do resultado com 2 casas decimais
            System.out.printf("%.2f", media);

            scan.close(); //fecha o fluxo e libera recursos que estavam ocupados no fluxo
        }

}
