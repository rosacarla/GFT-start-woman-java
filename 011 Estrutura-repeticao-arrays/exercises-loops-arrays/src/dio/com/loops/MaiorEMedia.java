package dio.com.loops;

/*
Faça um programa que leia 5 nros e informe
o maior número e a média desses números.
*/
import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        //variáveis
        double maior = 0; //guarda o maior número
        double soma = 0; //guarda a soma
        double media; //guarda a média

        int count = 0; //controla o loop

        //loop do-while
        do {
            System.out.println("Número: "); //Peça um número
            double numero = scan.nextDouble(); //Entrada de dados, neste caso de um Double.

            if (numero > maior) { //Caso o valor digitado seja maior que valor armazenado na variável maior,
                maior = numero; //atribua o valor deste número à variável maior.
            }

            soma = soma + numero; //some o nro informado com variável soma (independente do valor)


            count = count + 1; //some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)

        } while (count < 5); //enquanto o contador tiver o valor menor que 5

        media = soma / 5; //faça o cálculo da média (soma/quantidade)

        //imprimindo soma, maior número digitado e média dos nros
        System.out.println("Soma: " + soma);
        System.out.println("Maior nro é: " + maior + " - Média: " + media);
    }

}