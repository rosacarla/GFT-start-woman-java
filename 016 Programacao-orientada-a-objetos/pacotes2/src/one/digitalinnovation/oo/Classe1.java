package one.digitalinnovation.oo;

/**
 * Classe de exemplo para exercicios da parte 6 do curso de POO.
 * a fim de mostrar as visibilidades de objetos.
 */

public class Classe1 {

    //criados 3 atributos com diferentes visibilidades
    private String atributo1;  //só dentro da classe

    protected String atributo2;  //dentro da classe, mesmo pacote e subclasses

    public String atributo3; //em qualquer lugar

    //criados 3 metodos
    private void metodo1() {

    }

    protected void metodo2() {

    }

    public void metodo3() {

    }
}
