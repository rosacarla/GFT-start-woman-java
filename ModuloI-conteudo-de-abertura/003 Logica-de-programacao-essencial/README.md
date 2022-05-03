# Lógica de Programação Essencial  

<p align="center">
	<img src="" width="250">
</p>

## Conteúdos do curso:  

1) Introdução à logica e à programação  
- Entendendo o que é lógica  
- O que são algoritmos e pseudocódigo  
- Aprendendo fluxograma, variáveis e constantes  
- Tomadas de decisões e expressões  
- Como utilizar a concatenação  
2) Introdução ao Portugol  
- Aprenda como utilizar uma estrutura de repetição  
- O que são linguagens de programação  
- Aprenda a utilizar desvios condicionais e boas práticas em
programação  
- Trabalhando com laços de repeticção em Portugol  
- Aplicação prática com matrizes e vetores

---

## Algumas práticas realizadas  

- Construção de casa com laço de repetição em jogo Minecraft, no site Hour of Code  
</br>

<p align="center">
	<img src="" width="250">
</p>  


- Pseudocódigos com Flowgorithm
</br>

<p align="center">
	<img src="" width="250">
</p> 

- Versão do pseudocódigo em Java 

```java
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        double nota1, nota2, nota3, nota4, media;
                
        System.out.println("Qual o seu nome? )";
        nome = input.nextLine();
        System.out.println("Digite suas notas: ");
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(nome + ", sua media é: " + media + ".");
        if (media >= 7) {
            System.out.println("Parabens, voce foi aprovado(a)!");
        } else {
            System.out.println("Infelizmente voce foi reprovado(a).");
        }
    }
}
```  


---

## Links úteis  

[Hour of Code Minecraft](https://studio.code.org/s/mc/stage/1/puzzle/1)  
[Jogo do lobo, ovelha, repolho](https://www.proprofs.com/games/wolf-sheep-and-cabbage/)  
[Jogo dos ponguins](https://rachacuca.com.br/jogos/pinguins-numa-fria/) 
[Programa para criar fluxogramas: Flowgorithm](http://www.flowgorithm.org)  
[Sobre espressões relacionis em Java](https://runestone.academy/ns/books/published//Subgoals/WriteSelection/WorkedEx-1-WriteRelationalExpressions.html)  


---
