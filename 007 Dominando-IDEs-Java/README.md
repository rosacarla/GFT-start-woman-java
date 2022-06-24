# 🧮 Dominando IDEs Java

## 📑Conteúdos do curso:  

_1) Apresentação e visão geral_  
Apresentação do curso | Visão geral do curso  

_2) Ambiente de desenvolvimento Ubuntu_  
Instalação JDK e Git no Ubuntu | Instalação IntelliJ e Eclipse no Ubuntu 

_3) Ambiente de desenvolvimento Windows_  
Instalação JDK e Git no Windows | Instalação IntelliJ e Eclipse no Windows  

_4) Eclipse_  
Criando seu primeiro projeto com Eclipse | Atalhos | Git e GitHub | Debug | Últimas observações sobre Ecplipse  

_5) IntelliJ_  
Criando seu primeiro projeto com IntelliJ | Mais atalhos e versionamento | Debug | Plugins | Outra opção de IDE: Visual Studio Code

---

## 🧰 Algumas práticas realizadas  

**- Testes de versionamento de projetos**  
| [teste 1: IDE Eclipse](https://github.com/rosacarla/Teste-ide-eclipse) | [teste 2: sem IDE](https://github.com/rosacarla/Teste-sem-ide) | [teste 3: IDE IntelliJ](https://github.com/rosacarla/Teste-ide-intellij) |


**- Criação de classes** 

```java
package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        Gato gato = new Gato();
        Livros livros = new Livros();

        System.out.println(gato);
        System.out.println(livros);

        /* int a = 2;
        int b = 3;
        System.out.println("Hello World! " + (a+b)); */
    }

}
class Livros {
    private String nome;
    private String npag;
}
```

**- Desenvolvimento de uma calculadora**  

```java
package dio.com.br.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o 1o. valor: ");
        a = scan.nextInt();
        System.out.println("Digite o 2o. valor: ");
        b = scan.nextInt();

        /* delara metodos */
        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("divi: " + dividir);
    }
    public static int somar(int a , int b) {
        return a + b;
    }
    public static int subtrair(int a , int b) {
        return a - b;
    }
    public static int multiplicar(int a , int b) {
        return a * b;
    }
    public static double dividir(double a , double b) {
        return a / b;
    }
}
```

---

## 🔗 Links úteis  

[Atalhos do IntelliJ Idea](http://www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea?msclkid=b9e9588ece8e11ec9a461daf5dc5f705)  
[Download Visual Studio Code](https://code.visualstudio.com/download)  
[IntelliJ](https://www.jetbrains.com/idea/download/#section=windows)  
[OpenJDK da Azul Zulu](https://www.azul.com/downloads/?package=jdk)  
[Repositorio do curso - Instrutora Camila](https://github.com/cami-la/curso-dio-dominando-ides-java)  
[What can cause the "cannot find symbol" error in Java?](https://www.tutorialspoint.com/what-can-cause-the-cannot-find-symbol-error-in-java#:~:text=The%20%E2%80%9Ccannot%20find%20symbol%E2%80%9D%20error,variable%20we%20are%20referring%20to.)

---
