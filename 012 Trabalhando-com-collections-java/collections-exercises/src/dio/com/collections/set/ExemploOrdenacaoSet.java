package dio.com.collections.set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*; //importa pacote java.util

//criada classe principal do programa
public class ExemploOrdenacaoSet {  //criada classe principal do programa
    public static void main(String[] args) {
	 
	  //metodo HashSet mostra ordem aleatoria
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{  //inicia o hashset e instancia nova serie
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio()); //forEach imprime em 3 colunas

        // LinkedHashSet mostra ordem de inserção
        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{  //var minhasSeries1 recebe novo cj ordenado
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());  //imprime na ordem de insercao em 3 colunas

        //metodo TreeSet pra executar ordenação natural
        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);  //var minhaSeries2 recebe cj ordenado por TreeSet
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio()); //imprime em 3 colunas

        //Exercício1: ordenação do cj por gênero
        System.out.println("--\tOrdem gênero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries); //var minhasSeries4 recebe collection minhasSeries
        for (Serie serie: minhasSeries4) System.out.println(serie); //opção 1 de impressão de dicionario do cj
        for (Serie serie: minhasSeries4) System.out.println(serie.getGenero() + " - "
                +  serie.getNome() + " - " + serie.getTempoEpisodio());  //opção 2 de impressão formatada em 3 colunas

        //Exercício2: ordenação do cj por TempoEpisodio
        System.out.println("--\tOrdem Tempo Episódio\t--"); //IDE importa 2 comparators abaixo
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero.ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries); //var minhasSeries5 recebe collection minhasSeries
        for (Serie serie: minhasSeries4) System.out.println(serie); //opção 1 de impressão de dicionario do cj
        for (Serie serie: minhasSeries5) System.out.println(serie.getTempoEpisodio() + " - "
                + serie.getNome() + " - " + serie.getGenero());  //opção 2 de impressão formatada em 3 colunaas

        //ordenacao por eliminacao de criterios com Comparator e compareTo
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); //chama o Comparator
        minhasSeries3.addAll(minhasSeries);  //metodo addAll recebe Collection minhasSeries
        for (Serie serie: minhasSeries3) System.out.println(serie); //opção 1 de impressão de dicionario do cj
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());  //opção 2 de impressão formatada */

    }
}

//criacao de classe privada com atributos e Comparable
class Serie implements Comparable<Serie>{
    public String nome;
    public String genero;
    public Integer tempoEpisodio;

    //gera construtor da classe Serie
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    
    //gera getters pra modificar classe privada
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    //sobrescreve toString para não imprimir endereço de memoria
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    //sobrescreve metodo equals(), necessario em implementacoes que contem palavra "hash" no nome
    @Override
    public boolean equals(Object o) {   //verifica se objeto tem hashcode dentro da classe
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    //sobrescreve metodo hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
    
    //metodo compareTo tem tempoEpisodio como criterio de comparacao    
    @Override
    public int compareTo(Serie serie) {   //classe criada pra ordenação natural por tempoEpisodio
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero()); //genero é criterio de desempate de comparacao
    }
}

//classe ComparatorGenero implementa Comparator com criterio "genero"
class ComparatorGenero implements Comparator<Serie>{

    public int compare(Serie s1, Serie s2) { return s1.genero.compareToIgnoreCase(s2.genero); }

//classe ComparatorTempoEpisodio implementa Comparator com criterio "tempoEpisodio"
static class ComparatorTempoEpisodio implements Comparator<Serie> {

    public int compare(Serie s1, Serie s2) {
        return Integer.compare(s1.tempoEpisodio, s2.tempoEpisodio);
        }
    }
}

//criada classe Comparator Nome... e implementa o Comparator
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome; ////1o. criterio de compraracao

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;  //2. criterio de comparacao

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio()); //3o. criterio de comparacao
        //se TempoEspisodio for igual, nao ordena porque todos sao iguais
    }
}


