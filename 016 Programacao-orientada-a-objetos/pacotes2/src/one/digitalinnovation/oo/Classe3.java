package one.digitalinnovation.oo;

/**
 * Classe de exemplo para exercicios da parte 6 do curso de POO.
 * a fim de mostrar as visibilidades de objetos.
 */

class Classe3 {

    Classe1 classe1;  //associação com a Classe1 pra acessar objetos com visibilidade "liberada"

    void metodo() {

        //atributo2 e 3
        //classe.atributo2 --> tem acesso por associação ao atributo2 porque está no mesmo pacote
        //classe.atributo3 --> tem acesso por associação ao atributo3 porque é public

        //metodo2 e 3 têm comportamento semelhante ao dos atributos
        //classe.metodo2() --> tem acesso pelo metodo2() estar em mesmo pacote
        //classe.metodo3() --> tem acesso por ser metodo3() ser publico

    }
}
