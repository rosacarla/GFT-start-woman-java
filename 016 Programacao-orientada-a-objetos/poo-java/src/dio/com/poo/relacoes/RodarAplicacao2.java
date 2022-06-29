package dio.com.poo.relacoes;

/**
 * Classe de exemplo para exercícios da parte 5 do curso de POO,
 * com a finalidade de executar códigos da classe Funcionario.
 */

public class RodarAplicacao2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); //instanciado o objeto Funcionario() na classe Funcionario

        //iniciadas subclasses para superclasse Funcionario, criados 3 upcasts implicitos
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //exemplo de downcast implicito feito com erro
        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //execução há erro do downcast porque o tipo Vendedor...
        //... tem dados não reaproveitados pelo novo objeto e o compilador não sabe o que fazer com a sobra, por
        //isso estoura um ClassCastException, conforme segue:

        /*
        Cópia do erro:
        Exception in thread "main" java.lang.ClassCastException: class dio.com.poo.java.Funcionario cannot be cast
        to class dio.com.poo.java.Vendedor (dio.com.poo.java.Funcionario and dio.com.poo.java.Vendedor are in
        unnamed module of loader 'app') at dio.com.poo.java.RodarAplicacao2.main(RodarAplicacao2.java:21)

        Process finished with exit code 1
         */



    }

}
