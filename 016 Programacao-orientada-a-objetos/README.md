# ♻️Programação Orientada a Objetos  

## 🗃️ Conteúdos do curso:  

_1) Introdução_: Apresentação inicial | Objetivos do curso |

_2) Por que usar?_: Por que usar? |  
##### <p align="justify">POO tem representação mais realista, modelagem de entidade e interações, mais recursos por ser de alto nível, trabalha com maior nível de abstração, foca no que fazer.  Vantagens: coesão de unidades de código, acomplamentos mais flexíveis, gap semântico reduzido, coletor de lixo limpa a memória do que não é usado.  </p>

_3) Fundamentos_: Fundamentos | Exercício |  
##### <p align="justify"> POO envolve análise, projeto e programação de sistemas de software baseado na composição e interação entre diversas unidades de software chamadas de OBJETOS. Fundamentos: ABSTRAÇÃO (isolar caracteristicas de objeto, focar no essencial e descartar acidentais); REUSO (criar novas unidades de código a partir de existentes); ENCAPSULAMENTO (esconde complexidades e protege dados). </p>  

_4) Estrutura básica da OO_: Classe - Conceitos | Classe - Exercício | Atributo - Conceitos | Atributo - Exercício | Método - Conceito | Método - Exercício | Objeto e Mensagem - Conceito | Objeto e Mensagem - Exercício |  
##### CLASSE é uma estrutura que abstrai conjunto de objetos com caracteristicas similares, por exemplo: bola, viagem, comprador, endereço etc.  
##### <p align="justify">ATRIBUTO é elemento de uma classe responsável por definir sua estrutura de dados, faz a caracterização de classes e futuros objetos, por exemplo: diâmetro (classe Bola), cor (calsse Carro), nome (classe Aluno), autor (classe Livro). </p>  

Atributo  |  Variável  
-|-
O que é próprio e peculiar a algo ou alguém. | O que pode variar ou mudar, inconstante.  

##### <p align="justify">MÉTODO é porção de código (sub-rotina) disponibilizada pela classe, executado quando é feita sua requisição, identifica quais serviços e ações a classe oferece, por exemplo: ligar (classe Carro), calcular total (classe Venda), realizar troca (classe Comprador).  </p>  
##### <p align="justify">OBJETO é representação de um conceito/entidade do mundo real, que pode ser física ou conceitual e tem significado definido em determinado software. A classe é estática, um molde, definida para saber depois como criar e manipular os objetos, que ficam na memória do computador. Objetos são instâncias de classes, que executam e fazem coisas acontecer.  </p>
##### <p align="justify">MENSAGEM é o processo de ativação de um método de um objeto, quando há uma requisição ou chamada ao método que dispara a execução do comportamento descrito na classe. Pode ir direto para a classe se a requisção é metodo estático. A troca de mensagens entre objetos e classes fazem o sistema funcionar.  </p>

_5) As relações: Herança, Associação e Interface_  
Herança - Conceito | Herança - Exercício 1 | Herança - Tipos | Herança - Upcast e Downcast | Herança - Polimorfismo e Sobrescrita | Herança - Proposta de Exercício 2 | Herança - Resolução de exercício 2 - Parte 1 | Herança - Resolução de exercício 2 - Parte 2 | Associação - Conceito |  Associação - Tipos | Associação - Exercício | Interface - Conceito | Interface - Exercício |  
##### <p align="justify">HERANÇA é relacionamento entre classes em que uma subclasse (classe filha, classe derivada) é extensão, um subtipo de outra superclasse (classe pai, classe mãe, classe base). A subclasse reaproveita os atributos e métodos da superclasse, também pode definir seus próprios membros além dos herdados.  </p>
##### <p align="justify">POLIMORFISMO é mesma ação (método)se comportando diferente. Pode usar polimorfismo com herança e usar herança sem usar polimorfismo.  </p>  
##### <p align="justify">SOBRESCRITA é mesma ação (método) podendo se comportar diferente.  </p>  

Polimorfismo | Sobrescrita  
-|-
Tem comportamento sempre diferente, método é muito abstrato, não podemos prever o comportamento padrão. | Há comportamento padrão que pode ser diferenciado em classe filha e pode ser reaproveitado da classe mãe.  

##### <p align="justify">ASSOCIAÇÃO possibilita relacionamento entre classes e objetos em que podem pedir ajuda a outras classes/objetos e representar de forma completa o conceito a que se destinam. Tipos: estrutural ligado a métodos (composição, agregação) e comportamental ligado a atributos (dependência).  </p>

Agregação | Composição  
-|-  
Relação mais fraca entre a existência de objetos, entidades. | Dependência forte entre objetos, entidades, se um deixa de existir o outro também.  

Herança | Associação  
-|-  
Relação mais rígida, é definida no desenvolvimento quando cria classe herdada de outra; não muda durante execução da aplicação. Pergunta de uso: uma coisa é a outra? | Relação mais flexível, os valores de métodos e atributos podem ser mudados durante execução do software. Pergunta de uso: uma coisa usa a outra?  

##### <p align="justify">INTERFACE define um contrato que deve ser seguido pela classe que a implementa, com compromisso de realizar todos os comportamentos da interface. </p> 

_6) A Organização de Pacotes e Visibilidades_  
Pacotes - Conceitos | Pacotes - Exercícios | Visibilidades - Conceitos | Visibilidades - Exercício | Conclusão | Slides |  
##### <p align="justify">PACOTES são organização física ou lógica para separar classes com responsabilidades distintas.  </p>
##### <p align="justify"> VISIBILIDADE é configurada por modifificador de acesso com finalidade de determinar até que ponto uma classe, atributo ou método pode ser usado. </p> 

---  

## 🎨 Práticas realizadas  

* Execução do programa da classe Carro.java
<p align="center">
	<img src="https://github.com/rosacarla/GFT-start-woman-java/blob/main/016%20Programacao-orientada-a-objetos/images/Classe-Carro.java-em-execucao.gif" width="880">
</p>

* Outros exercícios: [pacotes1](https://github.com/rosacarla/GFT-start-woman-java/tree/main/016%20Programacao-orientada-a-objetos/pacotes1/src) | [pacotes2](https://github.com/rosacarla/GFT-start-woman-java/tree/main/016%20Programacao-orientada-a-objetos/pacotes2/src/one/digitalinnovation/oo) | [poo-java/estrutura](****) | [poo-java/relacoes](https://github.com/rosacarla/GFT-start-woman-java/tree/main/016%20Programacao-orientada-a-objetos/poo-java/src/dio/com/poo/relacoes) |  

---

## 🔗 Links úteis  

[Curso POO - Curso em Vídeo - YouTube](https://www.youtube.com/watch?v=KlIL63MeyMY)  
[Curso de Java Básico - Loiane Groner - YouTube](https://www.youtube.com/watch?v=LnORjqZUMIQ&list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r)  
[Lesson: Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)  
[Orientação a Objetos: Aprenda seus conceitos e suas aplicabilidades de forma efetiva](https://www.casadocodigo.com.br/products/livro-oo-conceitos)  

---  
