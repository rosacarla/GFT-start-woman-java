package dio.com.collections.list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// EXERCICIO! Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//      List notas = new ArrayList(); //antes do java 5
//      List<Double> notas = new ArrayList<Double> (); //Generics(jdk5) - Diamond
//      ArrayList<Double> notas = new ArrayList<>(); //nao recomendado assim, deve programar voltado à interface
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /* List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);  //forma limitada porque nao pode acrescentar ou retirar elementos da lista
        System.out.println(notas); */
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //forma torna a lista imutavel
        notas.add(1d); // dá erro de compilação
        notas.remove(5d);
        System.out.println(notas); */

        System.out.println("Crie uma lista e adicione as sete notas: ");

        //classe Double implementa a interface Comparable pra comparar as notas
        List<Double> notas; //inicializa a variavel

        //inserção de 7 notas
        notas = new ArrayList<>(); //metodo add() é a forma mais convencional
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas); //opcao 1 de impressao
        System.out.println(notas.toString()); //opcao 2 de impressao
        System.out.println("\n---------------------------------------------------------");

        //metodo indexOf retorna indice ou posicao do elemento
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("\n---------------------------------------------------------");

        //metodo add() recebe indice e elemento pra incluir na lista
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //passa posição e elemento como argumentos pra adicição na lista
        System.out.println(notas); //adiciona nota e lista fica com o total de 8 elementos
        System.out.println("\n---------------------------------------------------------");

        //metodo Set() faz substituição
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //recebe posição e elemento
        System.out.println(notas);
        System.out.println("\n---------------------------------------------------------");

        //metodo contains() verifica se elemento está contido, passa objeto
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("\n---------------------------------------------------------");

        //metodo forEach() mostra ordem de inserção
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) System.out.println(nota); //usa for each pra imprimir lista vertical
        System.out.println("\n---------------------------------------------------------");

        //metodo get() recebe a posição e retorna o elemento
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas); //impressao pra conferir posição
        System.out.println("\n---------------------------------------------------------");

        //nao existe metodo nativo no list para chamar e retornar menor valor
        //usa class Collection e seu metodo min() que recebe a collection "notas" como parametro de busca
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //pra mostrar maior valor, class Collection + metodo max()
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        //max() acima recebe a collection "notas" como parametro de busca
        System.out.println("\n---------------------------------------------------------");

        //usado metodo Iterator para somar elementos da lista a cada iteração
        Iterator<Double> iterator = notas.iterator(); //metodo Iterator cria variavel "iterator" do tipo double
        Double soma = 0d; //variavel de controle para armazenar a soma, iniciada com 0
        while(iterator.hasNext()){  //laço de repeticao pergunta se tem elemento depois do atual
            Double next = iterator.next(); //coloca elemento dentro da variavel temporaria next
            soma += next; //soma com o proximo elemento da var next
        }
        System.out.println("Exiba a soma dos valores: " + soma); //imprime a soma de elementos da lista

        //pra calcular media, metodo size() retorna quantidade de elementos que tem na lista
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("\n---------------------------------------------------------");

        //metodo remove() recebe objeto pra remoção de elemento; pode passar posição também
        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //remove objeto que corresponde à nota 0.00
        System.out.println(notas);
        System.out.println("\n---------------------------------------------------------");

        //metodo remove() recebe indice pra remoção de elemento de posição especificada
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0); //remove elemento da posição/indice 0
        System.out.println(notas);
        System.out.println("\n---------------------------------------------------------");

        //usa metodo iterator() para buscar notas < 7
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator(); //criada variavel iterator1
        while(iterator1.hasNext()) {  //laço de repeticao pergunta por proxima nota menor que 7
            Double next = iterator1.next();  //coloca resposta true na variavel temporaria
            if(next < 7) iterator1.remove(); // condicao para remover elemento da lista
        //notas.removeIf(next -> next < 7); //outra opção sugerida pela IDE pra substituir o laço while
        }

        System.out.println(notas);  //impressão fora do laço pea não ser repetida a cada iteração
        System.out.println("\n---------------------------------------------------------");

        ///metodo clear() apaga lista inteira //
        System.out.println("Apague toda a lista: ");
        notas.clear(); //implementa metodo clear()
        System.out.println(notas); //impressao pra conferir execução do clear
        System.out.println("\n---------------------------------------------------------");

        //metodo isEmpty é booleano que retorna true pra vazio ou false pra cheio
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        System.out.println("\n---------------------------------------------------------");

/*  EXERCICIO RESOLVIDO ATRAVÉS DO CÓDIGO ExemploList2 !!
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        1) System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        2) System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        3) System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

    }
}
