package dio.com.collections;

/* Execute o programa e anote o tempo. Substitua ArrayList (pra
acesso aleatório rápido através do índice) por LinkedList (pra
acesso aleatório que é lento, necessita de um objeto nó pra cada
elemento, composto pelo dado propriamente dito e uma referência
pro próximo nó, ou seja, consome + memória) e repita o teste.
Ao final escolha a implementação mais eficiente.
 */

import java.util.*;
public class Teste {

    public static void main(String[] args) {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<Integer>();// Tempos de execuções = 379, 176, 184
        //List<Integer> lista = new LinkedList<>(); //Tempos de execuções = 526, 591, 473
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }

        for (int i = 0; i < MAX; i++) {
            boolean contains = lista.contains(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Tempo total: " + (tFim - tInicio));
    }

}