/**
 * * Classe de exemplo pra exercicio da aula 1.
 */

public class VariaveisExercicios {
    /* main é o metodo + simpes do Java, inicia a execucao */
    public static void main(String[] args) {

        int i;
        //int i;  /* erro na definicao de var com mesmo nome */
        int I;  /*nome aceito por ser i maiusculo */
        //int 1a;  /* nome errado começa com nro */
        int _1a; /*nao gera erro, uso de "_" fere boas práticas, melhor evitar */
        int $aq; /*nao gera erro, uso de "$" fere boas práticas, melhor evitar */

        /* inicialização de variaveis dentro do metodo main, atribuição de valores */
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15; /* constante j nao pode ter valor alterado */
        int asrn24678md;  /* definicao pouco usual, mas correta, dificil de entender o nome*/
        //int asrn246 78md; /*definicao errada com espaço */
        int asrn2$4678_md;  /*nao gera erro, mas underline é recomendado em constantes */
        //int asrn2$46%78_md = 11; /*definicao errada com caractere % */

        /* atribuicao de valores iniciais às variaveis do 2o. grupo */
        asrn24678md = 1000;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; /* nao é boa pratica definir var com 1a. letra maiuscula */
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5;   /* constante nao segue boa prática por nao começar com maiuscula*/
        int QUANTIDADE_OPCOES = 25; /* var definida com escrita de constante, nao dá erro, nao é boa prática */
        //int qtdProd; /*expressividade nao segue boa pratica */

        /* comando System.out.println() usado pra mostrar saidas no console */
        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
