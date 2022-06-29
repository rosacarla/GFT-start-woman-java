package one.digitalinnovation.oo.outropacote;

/**
 * Classe de exemplo para exercicios da parte 6 do curso de POO.
 * a fim de mostrar as visibilidades de objetos.
 */

import one.digitalinnovation.oo.Classe1;

class Classe4 {  //classe esta fora de outropacote, nao herda de Classe1

    Classe1 classe1;  //associação com Classe1 para acesso a objetos de visibilidade "liberada"

    void metodo() {

        //atributo3
        //classe.atributo3 --> tem acesso por associação a atributo3 que é o unico publico
        //não tem acesso atributo2 porque é protected e está em pacote diferente

        //metodo3 tem comportamento similar ao atributo3
        //classe.metodo3() --> tem acesso por ser metodo public
    }

}
