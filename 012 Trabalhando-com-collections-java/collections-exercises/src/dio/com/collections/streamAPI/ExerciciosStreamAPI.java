package dio.com.collections.streamAPI;


import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        //iniciada lista de elementos do tipo string
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        //opçao de impressao com interface funcional Consumer, sem função lambda
        System.out.println("Imprima todos os elementos dessa lista de String (interface Consumer): ");
        //forEach() pede um Consumer que é interface funcional do Stream
        numerosAleatorios.stream().forEach(new Consumer<String>() {  //ao digitar Consumer, IDE preenche com restante
            @Override
            //metodo void accept nao retorna nada
            public void accept(String s) {  //accept pega cada elemento da String s e imprime todos
                System.out.println(s);
            }
        });

        //opção de impressao com função lamda
        System.out.println("\nImprima todos os elementos dessa lista de String (função Lambda): ");
        numerosAleatorios.forEach(s -> {  //implementada função lambda
            System.out.println(s);
        });

        //opção de impressao com reference method
        System.out.println("\nImprima todos os elementos dessa lista de String (reference method): ");
        numerosAleatorios.forEach(System.out::println); //implementado o reference method

        //impressao de elementos de um set com operacao limit
        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set (operação limit):");
        numerosAleatorios.stream()
                .limit(5)  //operacao limit recebe tipo de dado long, pega 5 primeiros nros
                .collect(Collectors.toSet()) //operacao collect pega elementos da lista de stream e coloca no set
                .forEach(System.out::println); //forEach com reference method pra impressao
                //imprime apenas 4 elementos porque set não aceita repetições

        //opçao de armazenamento do set em variavel com operacao limit
        System.out.println("\nImpressao do set com 5 primeiros números (variável + operação limit):");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        //transformação de lista de strings em lista de nros inteiros com map
        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros (map e collect).");
        numerosAleatorios.stream()
                //IDE informa que Stream é de string
                .map(Integer::parseInt)
                //IDE informa que Stream é de integer
                .collect(Collectors.toList())
                //IDE informa que list pe de Integer
                .forEach(System.out::println); //imprime a lista tranformada de inteiros

        //armazena em variavel a lista tranformada
        System.out.println("\nImpressao de lista transformada e armazenada em variável 'nrosAleatoriosInteger.");
        List<Integer> nrosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(nrosAleatoriosInteger); //imprime a lista transformada e armazenada na variavel

        //coletar nros pares maiores que 2 e colocar em lista com Predicate
        System.out.println("\nPegue os nros pares maiores que 2 e coloque em uma lista (map, filter, Predicate):");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                //map transforma string em integer por reference method
                .map(Integer::parseInt)
                //filter pede predicate
                .filter(new Predicate<Integer>() {  //ao digitar Predicate, IDE preenche com boleano e return
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }) .collect(Collectors.toList());
                System.out.println(listParesMaioresQue2);

        //coletar nros pares maiores que 2 e colocar em lista com função Lambda
        System.out.println("\nPegue os nros pares maiores que 2 e coloque em uma lista (map, filter, lambda):");
        //ao digitar Predicate, IDE preenche com boleano e return
        List<Integer> listParesMaior2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList()); //função lambda
                //função lambda com filtro da condição de par+2 e coleta o que se encaixa
        System.out.println(listParesMaior2);

        //average e ifPresent para calculo da media
        System.out.println("\nMostre a média dos números (average, ifPresent): ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                //mapToInt pega cada elemento pra fazer manipulações
                .average()
                //tipo OptionalDouble evita retorno nulo
                .ifPresent(System.out::println);
                //ifPresent pede um DoubleConsumer e retorna um void (nada)

        //remove elementos de acordo com uma condição do removeIf
        System.out.println("\nRemova os valores ímpares (removeIf): ");
        nrosAleatoriosInteger.removeIf(i -> (i % 2 !=0));
        System.out.println(nrosAleatoriosInteger);

        //uso de skip() pra imprimir lista sem 3 primeiros elementos
        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante (skip):");
        numerosAleatorios.stream()
                .skip(3)  //skip ignora 3 primeiros nros da lista
                .forEach(System.out::println); //imprime lista atualizada

        //distinct e count pra mostrar quantos nros restam depois de retirar nros repetidos
        long countNrosUnicos = numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println("\nAo retirar números repetidos da lista, quantos números ficam (distinct, count)? " + countNrosUnicos);

        //mapToInt, min, ifPresent pra mostrar menor valor da lista
        System.out.print("\nMostre o menor valor da lista (mapToInt, min, ifPresent): ");
        nrosAleatoriosInteger.stream()  //usada lista transformada em int
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        //mapToInt, max, ifPresent pra mostrar maior valor da lista
        System.out.print("Mostre o maior valor da lista  (mapToInt, max, ifPresent): ");
        nrosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        //filter, mapToInt, sum pra soma de numeros
        int somaNrosPares = nrosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))  //filtro com condição pra usar nros impares
                .mapToInt(Integer::intValue)
                .sum(); // executa a soma
        System.out.println("\nPegue apenas os números ímpares e some (filter, mapToInt, sum): " + somaNrosPares);

        //sorted e collect pra mostrar lista em ordem nUmerica
        System.out.println("\nMostre a lista na ordem númerica (sorted, collect): ");
        List<Integer> nrosOrdemNatural = nrosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())  //sorted ordena nros comparados pelo Comparator
                .collect(Collectors.toList()); //collect pega nros ordenados e coloca em lista
        System.out.println(nrosOrdemNatural); //imprime lista reordenada

        //collect(Collectors.groupingBy) pra agrupar nros conforme criterio definido
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5 (groupingBy):");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNrosMultiplos3E5 = nrosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));  //condição pra coletar nros
        System.out.println(collectNrosMultiplos3E5);  //imprime dicionario de nros agrupados
    }
}
