package dio.com.collections.map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        //HashMap pra criar dicionario em ordem aleatoria
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{  //chave é string e value é livro,cria objeto "meusLivros"
            //metodo put() pra inserir elementos no dicionario, iniciada a classe Livro com nome e paginas
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) //entrySet possibilita separar elementos
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
            //com forEach(), para cada livro, imprime autor (chave) e nome do livro (valor)

        //LinkedHashMap mostra em ordem de inserção
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{ //meusLivros1 é o novo dicionario
            //metodo put() insere no dicionario
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()); //impressao formatada com forEach()

        //TreeMap mostra autores em ordem alfabetica que é a ordem natural
        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);  //meusLivros2 recebe novo dicionario
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome()); //imprime autor e nome do livro

        //TreeSet mostra nomes dos livros em ordem alfabetica (natural)
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        //nome do livro está em valor, entao usa TreeSet pra passar um Comparator no construtor
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome()); //meusLivros3 é o novo set
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //TreeSet mostra livros por nro das paginas
        System.out.println("--\tOrdem número de página\t--");
        //nro de paginas esta em valor, deve usar TreeSet + Comparator
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome.ComparatorPaginas());
        //IDE sugeriu correção do ComparatorPaginas como classe estática
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());

    }
}

//criada classe Livro com atributos
class Livro {
    private String nome;
    private Integer paginas;

    //gerado contrutor da classe
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    //gerados getters
    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    //sobrecreve metodo equals() por trabalhar com implementações "hash"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }
    //sobrecreve metodo hashCode() por trabalhar com implementações "hash"
    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    //sobrescreve metodo toString() pra não imprimir endereço de memoria
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
//criada classe ComparatorNome com metodo "compare" por nome
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

//criada classe ComparatorPaginas com metodo "compare" por página
static class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
        }
    }
}