package dio.com.arrays;

/*
Faça um programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado
        String[] consoantes = new String[6]; //iniciando um arrays vazio com 6 posições

        int count = 0; //inicia var. que controla o loop
        int quantDeConsoantes = 0;

        //loop
        do {
            System.out.print("Letra: "); //Peça uma letra
            String letra = scan.next(); //capture essa letra e atribua à variável letra.

            //se a letra informada não for = "a", "e", "i", "o" ou "u", usado operador !
            //metodo equalsIgnoreCase compara strings
            if (!(letra.equalsIgnoreCase("a") |   //condições dadas com ou (|)
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                consoantes[count] = letra;
                quantDeConsoantes++;
            }
            count++; //acrescente o valor 1 ao contador a cada loop
        } while (count < consoantes.length); //enquanto o contador tiver o valor menor que o tamanho do array

        System.out.print("Consoantes: " ); //frase ilustrativa
        //usado for each (variavel/elemento : array)
        for (String consoante : consoantes) { //para cada consoante dentro do array consoantes
            if (consoante != null) //se o valor da consoante for diferente de null
                System.out.print(consoante + " "); //imprima a consoante
        }
        System.out.println("--  Quantidade de consoantes: " + quantDeConsoantes);
        System.out.println(consoantes.length);
    }
}