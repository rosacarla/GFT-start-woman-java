package dio.com.poo.estrutura;

/**
 * Classe de exemplo para exercicios da parte 4 do curso de POO,
 * que tratam de classe, atributo, metodos, objeto e mensagem.
 */

public class Carro {  //definida a classe e seus atributos

    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor vazio
    Carro() {

    }

    //sobreacarga do construtor da classe
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //metodos getters e setters pra atribuir valores aos atributos
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //sobrescreve toString() pra não imprimir endereço de memória
    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }

    //metodo calcula valor pra abastecer tanque do carro
    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
