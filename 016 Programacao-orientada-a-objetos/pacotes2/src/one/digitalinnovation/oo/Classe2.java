package one.digitalinnovation.oo;

/**
 * Classe de exemplo para exercicios da parte 6 do curso de POO.
 * a fim de mostrar as visibilidades de objetos.
 */

class Classe2 extends Classe1 {  //Classe2 é subclasse de Classe1

    //Atributos próprios

    void metodo() {

        //atributo2 e 3
        //herda somente atributos2 e 3, porque o atributo1 tem visibilidade private

    }

    //metodo2 e 3
    //herda somente metodos2() e 3(), porque o metodo1() também é private
}
