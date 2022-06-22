package dio.com.collections.set;

import java.util.*;

/*
Crie um conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores do arco-íris uma abaixo da outra;
b) Exiba a quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio.
 */

public class ExercicioProposto01 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>(); //inicia hashset e instancia novo cj
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);
        System.out.println("____________________________________________________________ \n");

        //uso de forEach para imprimir conjunto em lista verticalmente
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {  //comando forEach(   :   )
            System.out.println(cor);
        }
        System.out.println("____________________________________________________________ \n");

        //metodo size() mostra quantidade de elementos do cj
        System.out.println("Exiba a quantidade de cores que o arco-íris tem: " + coresArcoIris.size());
        System.out.println("____________________________________________________________ \n");

        //metodo TreeSet executa ordem natural que é alfabética para Strings
        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris); //novo conjunto em ordem alfabetica
        System.out.println(coresArcoIris2);
        System.out.println("____________________________________________________________ \n");

        //construtor de conjunto ligado recebe um array como argumento
        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>( //inicia lista duplamente vinculada de itens nao repetidos
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);  //imprime cj na ordem original de inserção
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);  //inicia novo array pra receber cj invertido
        Collections.reverse(coresArcoIrisList); //metodo reverse inverte ordem de elementos do cj
        System.out.println(coresArcoIrisList);
        System.out.println("____________________________________________________________ \n");

        // uso de forEach e if pra mostrar cor específicada
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) { //forEach percorre o cj procurando string de cores
            if(cor.startsWith("v")) System.out.println(cor); //condicao para imprimir cor específica
        }
        System.out.println("____________________________________________________________ \n");

        //Iterator percorre o cj e metodo remove() exclui itens que atendem condição do laço
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();  //variavel iterator 2 recebe retorno de iterações
        while (iterator2.hasNext()) {  //laco de repeticao pergunta se tem proximo elemento
            if (!iterator2.next().startsWith("v")) iterator2.remove(); //condicao pra remover elemento
        }
        System.out.println(coresArcoIris);
        System.out.println("____________________________________________________________ \n");

        //metodo clear limpa/elimina elementos do cj
        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        //metodo isEmpty verifica se cj está vazio
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
        System.out.println("____________________________________________________________ \n");
        }
    }

