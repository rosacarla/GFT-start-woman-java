package dio.com.debugging;

/*
O código foi alterado depois do debugging e linhas
de código iniciais estão marcadas em comentários
delimitados por "// linha de código //".
 */

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {  //inicia metodo principal
        Scanner scan = new Scanner(System.in);  //entrada de fluxo pelo teclado
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};  //array com nomes dos alunos

        //int media = calculaMediaDaTurma(alunos, scan); //
        double media = calculaMediaDaTurma(alunos, scan);  //chamada de outro metodo
        //metodo recebe o array alunos e o fluxo do teclado

        System.out.println("\n------------------------------------------------n");
        //System.out.printf("Média da turma %d", media); //
        System.out.printf("Média da turma %.2f", media); //imprime a media calculada no return do metodo
    }

    //public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) { //
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        //int soma = 0;//
        double soma = 0;  //declarada variavel temporaria soma com valor 0 inicial
        for(String aluno : alunos) {  //laço forEach pra navegar dentro do array alunos
            System.out.printf("Informe nota de %s: ", aluno);  //pede entrada de nota
            //int nota = scanner.nextInt();//
            double nota = scanner.nextDouble();  //atribui a entrada à var temporaria nota
            soma += nota; //concatenação da soma das notas informadas
        }
        return soma / alunos.length; //retorna resultado da media
        //quantidade de alunos obtida pela aplicação do metodo length no array alunos
        //media calculada com divisao da soma de notas pela quantidade de alunos
    }

}