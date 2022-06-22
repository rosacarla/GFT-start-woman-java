package dio.com.collections.list;

/*Dadas as seguintes informações sobre meus gatos,
crie uma lista e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {   ///criada classe principal do programa
    public static void main(String[] args) {
        //criada lista de Gatos
        List<Gato> meusGatos = new ArrayList<>(){{
            //adiciona dados na lista
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        System.out.println(meusGatos); //impressao pra conferir lista

        meusGatos.sort(Comparator.comparing(Gato::getNome));  //ordenação/comparação de Gato por nome

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos); //imprime na ordem inicial

        //ordenação aleatória da lista Gato
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos); //metodo shuffle para ordenação aleatória
        System.out.println(meusGatos);

        //Necessario implementar classe Comparable e metodo CompareTo() pra ordenação natural
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos); //metodo sort de Collections recebe uma list, é organizada se há Comparable
        System.out.println(meusGatos);

        //Necessario implementar classe Comparator em metodo compare
        System.out.println("--\tOrdem Idade\t---");
        // Collections.sort(meusGatos, new ComparatorIdade()); //cada comparacao transforma a lista em outra nova
        meusGatos.sort(new ComparatorIdade()); //ordenação por idade
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
        // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());  //ordenação por cor
        System.out.println(meusGatos);

        //necessario criar classe ComparatorNomeCorIdade
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        // Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade()); //comparacao feita com objeto
        System.out.println(meusGatos);
    }
}

//criada classe Gato
class Gato implements Comparable<Gato>{ //implementa classComparable pra comparar itens de Gato por nome
    private String nome;
    private Integer idade;
    private String cor;

    //criado construtor da classe com seus atributos
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    //gerado getters (modificadores) da classe criada como private
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //sobrescreve metodo toString() pra retornar saída desejada (sem ele imprimiria endereço de memoria)
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    //implementa metodo compareTo() para comparação de Gato por nome
    //metodo retorna indice int: 0 pra nomes iguais, 1 pra nome maior (posterior ao comparado),
    //retorna -1 pra nome menor (anterior ao comparado)

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    //usado compareToIgnoreCase porque criterio de comparacao é uma String
}

//classe ComparatorIdade implementa a interface Comparator
class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) { //implementacao obrigatoria de metodo compare pra Comparator
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    //usado metodo compare do Integer porque criterio de comparacao é um inteiro
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
   //usado IgnoreCase porque cor é uma String
    }
}
//criada classe Comparator pra compracao de 3 atributos
class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome; //condicao pra nomes diferentes (indice 1 ou -1)

        //comparacao de nomes iguais leva à comparacao por cor
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor; //condicao pra cores diferentes

        // comparacao de cores iguais leva à comparacao por idade
        return Integer.compare(g1.getIdade(), g2.getIdade());
        //se nome, cor, idade forem iguais, gatos iguais não sao ordenados
    }
}