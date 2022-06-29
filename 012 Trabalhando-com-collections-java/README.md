# 🌳Trabalhando com Collections Java

## ⏭️Conteúdos do curso:  

_Introdução ao Curso_  
Apresentação do curso | Visão Geral: Collections Framework | [Slides - Introdução](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/slides-collections/Slides-introducao.pdf) | [Slides - Visão geral sobre Collections](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/slides-collections/Slides-visao-geral-collections.pdf)

_Lists_  
Coleções com iterações ordenadas: listas | Conhecendo os métodos List - parte 1 | Conhecendo os métodos List - parte 2 | Ordenação de elementos em uma coleção List - parte 1 | Ordenação de elementos em uma coleção List - parte 2 | Exercícios Propostos - List | [Slides](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/slides-collections/Slides-colecoes-com-iteracoes-listas.pdf)  

_Set_  
Coleções com singularidade: Set | Conhecendo os métodos Set | Ordenação de elementos em uma coleção Set | Exercícios Propostos Set | [Slides](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/slides-collections/Slides-colecoes-singulares-set.pdf)  

_Map_  
Coleções de pares: Map | Conhecendo os métodos Map - parte 1 |  Conhecendo os métodos Map - parte 2 | Ordenação - Map | Exercícios Propostos - Map | [Slides](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/slides-collections/Slides-colecoes-de-pares-map.pdf)  

_Stream_  
Visão geral: Stream API - parte 1 | Visão geral: Stream API - parte 2 | Principais operações Stream API - parte 1 | Principais operações Stream API - parte 2 | Principais operações Stream API - parte 3 | Conclusão do curso | [Slides](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/slides-collections/Slides-java-stream.pdf)  

---  

## ✏️Práticas realizadas  

* [Exemplos com Collections](https://github.com/rosacarla/GFT-start-woman-java/tree/main/012%20Trabalhando-com-collections-java/collections-examples/src/dio/com/collections)  

``` java
package dio.com.collections;

/* Implementar estrutura com Map que recupere dados de um aluno passando
 apenas seu nome como argumento de um método; informa-se o nome do aluno
 e o objeto correspondente a esse nome é devolvido. */

import java.util.*;

public class MapaAluno {

    public static void main(String[] args) { //declaração do collection informa 2 tipos (String e Aluno)//
        Map<String, Aluno> mapa = new TreeMap<String, Aluno>(); //String é a chave e objeto Aluno é o valor//
        //TreeMap garante que as chaves estão em ordem ascendente

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Benedito Silva", "OpenOffice", 0);

        //metodo put() insere na estrutura e recebe 2 objetos (chave e valor)//
        mapa.put("João da Silva", a);
        mapa.put("Antonio Sousa", b);
        mapa.put("Lúcia Ferreira", c);
        mapa.put("Benedito Silva", d);
        System.out.println(mapa);
        System.out.println("\n--------------------------------------------\n");
        //get() recupera objeto específico, passada a chave como parâmetro
        System.out.println(mapa.get("Lúcia Ferreira")); //nome do aluno é a chave
        System.out.println("\n--------------------------------------------\n");

        // metodo values() retorna um Collection com valores associados às chaves
        Collection<Aluno> alunos = mapa.values();
        for (Aluno e : alunos) {   //percorrer mapa partindo do value e usado enhanced-for
            System.out.println(e);
        }
    }

}
```

* Exercícios com Collections  
[Lists (5 exercícios)](https://github.com/rosacarla/GFT-start-woman-java/tree/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/list) - Exemplo: programa com perguntas sobre um crime para classificar a pessoa respondente como "Suspeita", "Cúmplice", "Assassina" ou "Inocente". [Ver código.](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/list/ExercicioProposto02.java)  
[Set (4 exercícios)](https://github.com/rosacarla/GFT-start-woman-java/tree/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/set) - Exemplo: programa cria conjunto com dados sobre séries favoritas, ordena o conjunto e exibe nome, gênero e tempo de episódio. [Ver código.](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/set/ExemploOrdenacaoSet.java)  
[Map (5 exercícios)](https://github.com/rosacarla/GFT-start-woman-java/tree/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/map) - Exemplo: programa recebe dados de modelos de carros e respectivos consumos na estrada, que são ordenados/atualizados em um dicionário, para fazer comparações e exibir informações sobre eficiência de consumo. [Ver código.](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/map/ExemploMap.java)  
[Stream (2 exercícios)](https://github.com/rosacarla/GFT-start-woman-java/tree/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/streamAPI) - Exemplo: programa recebe dados para ordená-los em um dicionário e exibir informações de : Nome id - Nome contato. [Ver código.](https://github.com/rosacarla/GFT-start-woman-java/blob/main/012%20Trabalhando-com-collections-java/collections-exercises/src/dio/com/collections/streamAPI/RefatoracaoOrdenacaoMap.java)  

---

## 🔗Links úteis  

[Class LinkedList<E>](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html)  
[Como comparar objetos - Classe abstrata Comparable e o método compareTo](https://www.javaprogressivo.net/2012/11/Comparando-objetos-Classe-abstrata-Comparable-metodo-compareTo.html#:~:text=A%20classe%20abstrata%20Comparable%20e,usada%20como%20padr%C3%A3o%20de%20compara%C3%A7%C3%A3o.)  
[Como usar o toString?](https://blog.cod3r.com.br/como-usar-o-tostring/)  
[Get e Set - Métodos Acessores em Java](https://www.devmedia.com.br/get-e-set-metodos-acessores-em-java/29241)  
[Interface Comparable<T>](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)  
[Iterator Interface In Java](https://www.geeksforgeeks.org/iterator-interface-in-java/?ref=gcse)  
[Java Collections: Como utilizar Collections](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)  
[Java forEach y sus opciones](https://www.arquitecturajava.com/java-foreach-y-sus-opciones/)  
[Java LinkedList](https://www.w3schools.com/java/java_linkedlist.asp)  
[LinkedList in Java](https://www.geeksforgeeks.org/linked-list-in-java/?ref=gcse)  
[O que é LinkedHashSet em Java?](https://comozed.com/o-que-%C3%A9-linkedhashset-em-java)  
[Tutorial de Java Collections Framework - site Oracle/Sun](https://docs.oracle.com/javase/tutorial/collections/index.html)  
  
---  
