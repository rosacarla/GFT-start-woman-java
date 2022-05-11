# Entendendo Métodos Java

## Conteúdos do curso:  

_1) Criação_  
Introdução ao Curso | Conceituação de métodos | Definição | Conceitos inerentes aos métodos e boas práticas na sua criação | Apresentação do exercício | Exercício prático  

_2) Sobrecarga_  
Como criar sobrecargas, usá-las e exercício prático | Resolução do exercício prático  

_3) Retornos_  
Funcionamento, Considerações, uso de retornos e apresentação
do exercício | Resolução do exercício prático | Encerramento do curso  

---

## Algumas práticas realizadas  

**- Criação do método "calcular" para cálculo de um empréstimo de dinheiro** 
```java
    /**
     *Classe de exemplo para exercício da Aula 1 sobre Métodos.
     */
   public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {

        return 3;
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.45;
    }
    //criado metodo principal para calculo, usado pela classe principal Main //
    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {  //condição de emprestimo em 2 x //

            // chamada interna de metodo getTaxaDuasParcelas() //
            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {   //condição de emprestimo em 3 x //

            // chamada interna de metodo getTaxaTresParcelas() //
            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {  //condição negativa pra emprestimo fora das 2 condições permitidas //
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}
```
 
**- Códigos das aulas práticas**

[Projeto methods-exercises: Main - Calculadora - Mensagem - Emprestimo]()  
[Projeto overloading-exercise: Main - Quadrilatero]()  
[Projeto return-exercise: Main - Quadrilateral]()  

---

## Links úteis  

[Class String](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)  
[Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)  
[Java Methods](https://www.w3schools.com/java/java_methods.asp)  
[Java Method Overloading](https://www.w3schools.com/java/java_methods_overloading.asp)  
[Orientação a Objetos](https://www.casadocodigo.com.br/products/livro-oo-conceitos)  
[Passing Information to a Method or a Constructor](https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html)  
[PrintStream](https://docs.oracle.com/javase/7/docs/api/java/io/PrintStream.html)  
[Returning a Value from a Method](https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html)

---
