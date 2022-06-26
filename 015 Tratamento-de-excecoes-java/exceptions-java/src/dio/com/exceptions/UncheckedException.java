package dio.com.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {  //em UncheckedException o compilador não avisa que deve ser tratada a exception
    public static void main(String[] args) { //dentro do metodo main são feitos inputs de 2 valores

        boolean continueLooping = true; //booleano inicia com true pra rodar o laço ate que while seja falso
        do {   //classe JOptionPane e metodo showInputDialog implementam uma caixa de dialogo pro input

            String a = JOptionPane.showInputDialog("Numerador: ");  //metodo retorna uma string
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {  //bloco com a logica de onde pode ocorrer a exception

                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                //metodo parseInt tranforma strings em nros inteiros
                System.out.println("Resultado: " + resultado);  //NumberFormatException é do Throwable
                continueLooping = false;  //caso imprima o resultado, o loop para aqui e o programa finaliza

            } catch (NumberFormatException e) {  //com cursor junto da chave, IDE sugere o catch e captura a exception
                e.printStackTrace(); //imprime exceção 1 e sua pilha de chamadas
                //"e" é um objeto que herda metodos da exception passada ao catch
                JOptionPane.showMessageDialog(null, "Entrada inválida, digite um nro inteiro! " + e.getMessage());
                //parentComponent é pai da caixa de diálogo e dá coordenadas pra colocação da caixa na tela
                //getMessage() exibe mensagem passada sobre o erro

            } catch (ArithmeticException e) {
                e.printStackTrace(); //imprime exceção 2 e sua pilha de chamadas
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0!");

            } finally {  //uso opcional,nem sempre é executado, as vezes é preciso forçar sua parada
                System.out.println("Chegou no finally!"); //msg mostra execução de finnaly com ou sem exception
            }

        } while (continueLooping); //loop do-while para pedir ao usuario os inputs quando houver exception

        System.out.println("O código continua...");  //msg pra sinalizar a parada antes da correção do erro
               //continueLooping = false;
    }

    public static int dividir(int a, int b) { //divisao recebe nros inteiros convertidos
        return a / b;
    }
}

/* 1a. execução sem tratamento de exceção, pra entradas a=camila e b=5, estourou
exception NumberFormatException, porque a string não foi convertida em inteiro:

Exception in thread "main" java.lang.NumberFormatException: For input string: "camila"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at dio.com.exceptions.UncheckedException.main(UncheckedException.java:15)

2a. execução com tratamento de exceção, pra mesmas entradas anteriores, estourou
exception NumberFormatException por mesmo motivo, foi exibida janela com msg de
erro ao usuário.

java.lang.NumberFormatException: For input string: "camila"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at dio.com.exceptions.UncheckedException.main(UncheckedException.java:15)
Chegou no finally!
O código continua...

3a. execução com tratamento de exceção, pra entradas a=8 e b=0, primeiro imprimiu
msg do finally, porque não houve NumberFormatException, e estourou a exception
ArithmeticException, por causa da divisão de nro inteiro por zero.

Chegou no finally!
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at dio.com.exceptions.UncheckedException.dividir(UncheckedException.java:44)
	at dio.com.exceptions.UncheckedException.main(UncheckedException.java:15)
 */