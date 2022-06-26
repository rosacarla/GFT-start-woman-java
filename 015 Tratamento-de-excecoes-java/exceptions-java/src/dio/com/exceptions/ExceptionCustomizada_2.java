package dio.com.exceptions;

import javax.swing.*;

//Divisao de numerador por denominador e impressao do resultado
public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                //se o nro for impar, imprime mensagem de erro da exception customizada

                int resultado = numerador[i] / denominador[i]; //var recebe valor resultante da divisao
                System.out.println(resultado); //imprime resultado
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                //acima tratamento de exceptions informadas na pilha

                e.printStackTrace(); //será capturada as mensagens da exception quando houver
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");

    }
}

/* Execução das divisões apresenta 2 erros que estouram exceptions porque há divisão
por zero e índice 4 fora dos limites de comprimento do array, conforme segue:

2
dio.com.exceptions.DivisaoNaoExataException: Divisão não exata!
	at dio.com.exceptions.ExceptionCustomizada_2.main(ExceptionCustomizada_2.java:13)
java.lang.ArithmeticException: / by zero
	at dio.com.exceptions.ExceptionCustomizada_2.main(ExceptionCustomizada_2.java:16)
5
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at dio.com.exceptions.ExceptionCustomizada_2.main(ExceptionCustomizada_2.java:13)
O programa continua...

 */