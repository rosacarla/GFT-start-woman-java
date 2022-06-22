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