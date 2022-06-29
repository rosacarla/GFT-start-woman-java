package dio.com.poo.estrutura;

/**
 * Classe de exemplo para exercicio da aula 4 do curso de POO,
 * com objetivo de criar novos objetos da classe Carro.
 */

public class RodarAplicacao1 {

    public static void main(String[] args) {  //ponto de entrada pra aplicação começar funcionamento

        Carro carro1 = new Carro(); //criado objeto do tipo Carro com construtor default sem parametro
        //contrutor default, padrao ou vazio instancia o novo objeto e vincula à variavel carro1

        //chamada dos metodos set() com passagem de atributos
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        //usa System.out... e metodo get() pra mostrar os atributos do objeto
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        //chamada do metodo totalValorTanque() e passa parametro de preço do combustivel para calculo do gasto
        System.out.println(carro1.totalValorTanque(6.39));

        //criado novo objeto com sobrecarga do construtor, sem usar os metodos set(), passa 3 parametros
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        //usa System.out... e metodo get pra mostrar os atributos do 2o. objeto
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
