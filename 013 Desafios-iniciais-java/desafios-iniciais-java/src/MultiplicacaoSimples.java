import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        System.out.println("Digite dois numeros inteiros para multiplicação (use espaço para separá-los): ");
        Scanner sc = new Scanner(System.in); //objeto sc recebe input de numeros

        int a, b, PROD; //inicia variaveis do tipo inteiro

        a = sc.nextInt(); //scanner do primeiro nro
        b = sc.nextInt(); //scanner do segundo nro

        PROD = a * b; //var PROD recebe resultado da formula da multiplicacao simples dos nros digitados

        System.out.println("PROD = " + PROD); //impressao do resultado

        sc.close(); //fecha o fluxo e libera recursos que estavam ocupados no fluxo

    }
}

