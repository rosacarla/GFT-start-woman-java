package dio.com.arrays;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100),
armazene num vetor. Ao final mostre os números e seus sucessores.
*/

import java.util.Random; //importa pacote Random

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numAleatorios = new int[20]; //array com 20 posições
        //outra opçao de declarar array é: int numeros[] = new int[20]

        //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
        for (int i = 0; i < numAleatorios.length; i++) {
            int numero = random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numAleatorios[i] = numero; //atribuindo esse valor ao elemento na respectiva posição do array numeros.
        }

        System.out.print("Numeros Aleatórios: "); //frase ilustrativa
        //loop for-each
        for (int numero : numAleatorios) { //para cada numero dentro do array de números
            System.out.print(numero + " "); //imprima o número
        }
        //linha para separar os vetores
        System.out.println("\n---------------------------------------------------------------------------------");

        System.out.print("Números Antecessores: "); //frase ilustrativa
        for (int numero : numAleatorios) { //para cada numero dentro do array de números
            System.out.print((numero - 1) + " "); //adicione o valor 1 ao número e imprima o novo valor
        }

        System.out.println("\n---------------------------------------------------------------------------------");

        System.out.print("Números Sucessores: "); //frase ilustrativa
        for (int numero : numAleatorios) { //para cada numero dentro do array de números
            System.out.print((numero + 1) + " "); //adicione o valor 1 ao número e imprima o novo valor
        }

    }
}