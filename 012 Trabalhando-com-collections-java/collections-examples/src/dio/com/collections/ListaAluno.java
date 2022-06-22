package dio.com.collections;

/* Classe ListaAluno utilizando uma implementação da interface List.
 Obs.: implementações de coleções sobrescrevem o método toString(),
 por isso pode imprimir a lista passando só a referência para o
 método println(). */

import java.util.*;

public class ListaAluno {

    public static void main(String[] args) {
        //Aplicação instancia um ArrayList e o atribui a uma referência do tipo List
        //List<String> lista = new ArrayList<String>();

        //classe ListaAluno modificada
        //List<Aluno> lista = new ArrayList<Aluno>();
        //ComparaAluno ca = new ComparaAluno();
        //interface Set não permite elementos duplicados
        Set<Aluno> conjunto = new HashSet<Aluno>();

        /* insere nomes de alunos com método add()
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira"); */

        //pode adicionar objetos Aluno ao invés de String na lista
        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        //houve inserção de objeto duplicado pra demonstrar uso de interface Set//

        // lista.add(a);
        // lista.add(b);
        // lista.add(c);
        // lista.add(d);
        // System.out.println(lista); //imprime a lista

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto); //imprime o conjunto sem elemento duplicado

        //Utilização do método sort() da classe utilitária Collections
        // Collections.sort(lista);  //metodo sort() classifica a interface List em ordem natural...
        // ... ou de acordo com implementação da interface Comparator.

        //sort() recebe como argumentos a lista a ser ordenada e uma instância da implementacao de Comparator
        //Collections.sort(lista, ca);

        //System.out.println(lista);
        //método sort() altera a ordem da lista original

        /* Utilização da interface Iterator para percorrer uma lista
        Aluno aluno; //tipo que será retornado pelo Iterator
        Iterator<Aluno> itr = lista.iterator();
        while (itr.hasNext()) { //método hasNext() retorna true se houver elemento a ser lido
            aluno = itr.next(); //metodo next() retorna o bojeto
            System.out.println(aluno.getNome());
        //Iterator percorre a collection do início ao fim, até remover seus elementos//
        } */
    }

}