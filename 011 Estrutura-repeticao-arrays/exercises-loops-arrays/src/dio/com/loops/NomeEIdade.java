package dio.com.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o 1o. representa nome do aluno, o 2o. representa a idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //leitura pelo teclado

        //variáveis
        String nome; //armazena o nome
        int idade; //armazena a idade

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //Peça o nome (ctrl=D = duplica a linha)
            nome = scan.next(); //armazene esse nome na variável; metodo next retorna string
            if (nome.equals("0")) break; //caso nome igual a "0", interrompa o programa

            System.out.println("Idade: "); //Peça a idade
            idade = scan.nextInt(); //armazene a idade na variável

            // imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);

        }

        //imprima mensagem após interrupção do loop
        System.out.println("Continua aqui...");

    }

}