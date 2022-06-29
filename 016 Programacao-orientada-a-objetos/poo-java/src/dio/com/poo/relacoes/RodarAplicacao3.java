package dio.com.poo.relacoes;

/**
 * Classe de exemplo para exercícios da parte 5 do curso de POO,
 * com a finalidade de executar códidos da ClasseMae.java.
 */

public class RodarAplicacao3 {

    public static void main(String[] args) {

        //criado vetor de classes com 3 objetos de tipos ClasseFilha1, ClasseFilha2, ClasseMae
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //loop com for each() percorre o vetor e chama o metodo1()
        for (ClasseMae classe : classes) { //há sobrescrita com polimorfismo para Classes Filha1 e Filha2 porque...
                                           //... método se comporta conforme o tipo de dado.
            classe.metodo1(); //chamada do metodo1(), para ClasseMae não há polimorfismo, pois chamou seu próprio metodo
        }

        System.out.println(" ");

        for (ClasseMae classe : classes) { //há sobrescrita com polimorfismo apenas para ClasseFilha2 porque...
                                           //.. ClasseFilha1 não tem sobrescrita do metodo2().
            classe.metodo2(); //chamada do metodo2() para ClasseFilha2 e ClasseMae
        }

        System.out.println(" ");

        //instanciado novo objeto para ClasseFilha2
        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //sobrescrita pura porque nao usou metodo da ClasseMae
        classeFilha2.metodo2(); //chamada de método2() sobrescrito da ClasseFilha2
    }

    /* Saidas:

    Método 1 da Classe Filha 1
    Método 1 da Classe Filha 2
    Método 1 da Classe Mãe

    Método 2 da Classe Mãe
    Método 2 da Classe Filha 2
    Método 2 da Classe Mãe

    Método 2 da Classe Filha 2

    Process finished with exit code 0

    */
}

