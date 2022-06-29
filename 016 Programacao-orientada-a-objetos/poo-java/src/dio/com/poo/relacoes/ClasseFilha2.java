package dio.com.poo.relacoes;

/**
 * Classe de exemplo para exercícios da parte 5 do curso de POO,
 * com a finalidade de mostrar polimorfismo e sobrescrita.
 */

public class ClasseFilha2 extends ClasseMae {

    //sobrescrita de metodo1() da classe mae para classe filha 2
    @Override
    void metodo1() {
        System.out.println("Método 1 da Classe Filha 2");
    }

    //sobrescrita de metodo2() da classe mae para classe filha 2
    @Override
    void metodo2() {
        System.out.println("Método 2 da Classe Filha 2");
    }
}
