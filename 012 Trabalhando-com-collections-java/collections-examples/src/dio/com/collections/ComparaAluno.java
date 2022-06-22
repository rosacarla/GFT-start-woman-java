package dio.com.collections;

/* Implementar ordenação em coleção de objetos de uma
classe de terceiros que não é comparável e por isso
não implementa Comparable(). Utilizada também quando
precisa de ordenação diferente da natural. */

import java.util.Comparator; //importa interface Comparator

//criação de classe para implementar a interface Caomparator
public class ComparaAluno implements Comparator<Aluno> {
    public int compare(Aluno a, Aluno b) { //define 2 objetos da lista para comparacao
        return a.getNome().compareTo(b.getNome());
    }
}