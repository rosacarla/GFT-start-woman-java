package dio.com.collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //inicia conjunto com Set
        //Array.asList como argumento do construtor
        System.out.println(notas); //imprime lista em ordem aleatoria sem elementos repetidos

        /* Saída ______________________________
        Crie um conjunto e adicione as notas:
        [0.0, 8.5, 3.6, 5.0, 9.3, 7.0]

        Process finished with exit code 0
        ______________________________________ */

        //Verificar se elemento está no set, deve retornar true
        System.out.println("\nConfira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //metodo min para mostrar menor elemento
        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        //metodo max para mostrar maior elemento
        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        //Necessario usar iterator() pra exibir soma de elementos do conjunto
        Iterator<Double> iterator = notas.iterator(); //Iterator usado pra fazer soma de itens do cj
        Double soma = 0.0; //variavel de controle da soma
        while(iterator.hasNext()) {   //laço de repetição pergunta pelo proximo elemento do cj
            Double next = iterator.next(); //proximo item é armazenado em var temporaria (opcional)
            soma += next;  //soma entre proximo e valor da soma existente
        }
        System.out.println("\nExiba a soma dos valores: " + soma); //impressao da soma

        //metodo size() pra obter quantidade de elementos e usar valor no calculo da media
        System.out.println("\nExiba a média das notas: " + (soma/ notas.size()));

        //metodo remove() executa com objeto, não com índice
        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);  //comando pra remover item
        System.out.println(notas); //imprime cj pra conferir a remoção

        //usa iterator() pra percorrer conjunto e metodo remove() pra excluir itens do laço
        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator(); //inicia var iterator1
        while(iterator1.hasNext()){
            Double next = iterator1.next(); //var temporaria guarda elementos pra exclusao
            if (next < 7) iterator1.remove(); //condição pra remover elemento do cj
        }
        System.out.println(notas); //imprime cj com itens restantes

        //implementação LinkedHashSet pra mostrar cj na ordem de inserção
        System.out.println("\nExiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(); //var notas2 recebe novo conjunto
        //metodo add() funciona na interface Set
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);  //sinalizado erro porque Set nao aceita elemento repetido
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);  //impressao na ordem de inserção sem repetições

        //implementação TreeSet organiza cj conforme ordem natural dos elementos
        //classe Double que contém Comparable possibilita a ordenação de notas2 que tem doubles
        System.out.println("\nExiba todas as notas na ordem crescente: ");  //nao funciona com Comprator
        Set<Double> notas3 = new TreeSet<>(notas2);  //variavel nota3 recebe novo cj ordenado
        System.out.println(notas3); //imprime cj em ordem ascendente

        //metodo clear apaga cj
        System.out.println("\nApague todo o conjunto");
        notas.clear();
        System.out.println(notas); //impressao pra confirmar cj apagado

        //metodoisEmpty() mostra se cj está vazio
        System.out.println("\nConfira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

        /*
        // Não possibilita busca pela posição porque a lista é aleatoria; não há metodo get().
        // System.out.println("Exiba a posição da nota 5.0: "); // nao roda!
        // System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // nao roda!
        // System.out.println("Substitua a nota 5.0 pela nota 6.0: "); // ano tem medotdo, só roda em List
        // System.out.println("Exiba a terceira nota adicionada: "); // nao tem get() pra passar índice e retornar nota
        // System.out.println("Remova a nota da posição 0"); //nao roda! */

    }
}
