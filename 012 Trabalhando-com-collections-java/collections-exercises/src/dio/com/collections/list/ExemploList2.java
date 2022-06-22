package dio.com.collections.list;

/* Resolução de exercicios com métodos da implementação LinkedList,
   proposto no final da aula de interface List. */

import java.util.LinkedList; //importa a classe LinkedList

public class ExemploList2 {  //define classe principal

    public static void main(String[] args) {
        //Exercicio 1
        System.out.println("\n-----------------------------------------~@~-------------------------------------------");
        System.out.println("1) Crie uma lista chamada notas2 e coloque " +
                "os elementos do Arraylist nessa nova lista: \n");

        //criado objeto da classe LinkedList
        LinkedList<Double> notas2 = new LinkedList<>();

        //adição de elementos na lista
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2); //impressão da LinkedList completa
        System.out.println("\n--------------------------------------------------------------------------------------");

        //Exercicio 2
        System.out.println("2) Mostre a primeira nota da nova lista sem removê-la: ");

        /* Primeira tentativa de solução (esqueci de usar os métodos da implementatação!)
        System.out.println(notas2.get(0)); //metodo get() retorna elemento da posição 0
        System.out.println(notas2); //impressao da lista pra conferir posição 0 */

        //Solução com uso de método getFirst() da classe LinkedList
        System.out.println(notas2.getFirst()); //getFirst() mostra 1o. elemento da lista
        System.out.println("\n--------------------------------------------------------------------------------------");

        //Exercicio 3
        System.out.println("3) Mostre a primeira nota da nova lista removendo-a: ");

        /* Primeira tentativa de solução (ainda sem usar métodos da implementatação!)
        System.out.println(notas2.get(0)); //mostra elemento do indice 0
        notas2.remove(0); //remove elemento da posição 0
        System.out.println(notas2); //impressao para conferir remoção */

        //Solução com uso de método poll() da classe LinkedList
        System.out.println(notas2.poll()); //poll() recupera (mostra) e remove 1o. elemento (head) da lista
        System.out.println(notas2); //impressao pra conferir remoção na lista
        System.out.println("\n-----------------------------------------~@~-------------------------------------------");

        /* Outra opção de metodo da LinkedList pra mostrar/remover 1o. elemento
        System.out.println(notas2.pollFirst()); //metodo pollfirst() recupera/remove 1o. item da lista

        \o/ Parabéns, Carla Edila! Você mostrou ser capaz de criar e manipular uma LinkedList. */
    }
}
