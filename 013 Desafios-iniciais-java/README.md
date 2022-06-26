# Desafios Iniciais Java - GFT Start Woman

<p align="justify"><img src="https://github.com/rosacarla/GFT-start-woman-java/blob/main/013%20Desafios-iniciais-java/images/desafio.jpg" with = "550">
</p>

---

## 1/4 MULTIPLICAÇÃO SIMPLES  
<p align="justify"> Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável <b>PROD</b>, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).  
</p>

**Entrada**  

A entrada contém 2 valores inteiros.

**Saída**   

Exiba a variável **PROD** conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.  

</br>

Exemplos de Entrada | Exemplos de Saída
-|-
3 | PROD = 27
9 |                   
-30 | PROD = -300
10 | 	
0 | PROD = 0
9 |

---

## 2/4 COXINHA DE BUENO
<p align="justify"> Em 2015 um novo record foi alcançado na competição de Coxinhas de Bueno de Andrada, onde Mônica mandou pra dentro 43 coxinhas em apenas 10 minutos, passando se antecessor que conseguiu comer, no mesmo tempo, 38 coxinhas em 2014. O restaurante especializado em coxinhas do pequeno distrito de Bueno de Andrada, interior de São Paulo, organiza essa competição todos os anos, mas nunca conseguiram entrar para o livro dos recordes, o Guinness Book. Para isso, o restaurante precisa preencher informações sobre a competição, como o número de coxinhas consumidas pelos competidores durante o evento. Porém, como já foi informado, a especialidade deles é coxinha, não matemática, então será que você pode ajudá-los? Com base no número total de coxinhas consumidas e o número de participantes na competição, o dono do restaurante precisa que você desenvolva um programa para saber a quantidade média de coxinha que os participantes da competição conseguem devorar. Ah, lembre que, em troca da sua ajuda, você poderá comer quantas coxinhas conseguir.  
</p>

**Entrada**  
<p align="justify">A entrada consiste de uma única linha que contém dois inteiros <b>H</b> e <b>P</b> (1 ≤ <b>H</b>, <b>P</b> ≤ 1000) indicando respectivamente o número total de coxinhas consumidas e o número total de participantes na competição.</p>

**Saída**  
<p align="justify"> Seu programa deve produzir uma única linha com um número racional representando o número médio de coxinhas consumidas pelos participantes. O resultado deve ser escrito como um número racional com exatamente dois dígitos após o ponto decimal, arredondado se necessário.
</p> </br>


Exemplos de Entrada | Exemplos de Saída
-|-
10 90 | 0.11
840 11 | 76.36
1 50 | 0.02

---

## 3/4 ÁLBUM DA COPA
<p align="justify">A Copa do Mundo de Futebol é um dos maiores eventos esportivos do Planeta Terra, e o álbum de figurinhas oficial é sempre um grande sucesso entre os amantes dessa competição. O álbum contém espaços numerados de 1 a <b>N</b> para colar as figurinhas; cada figurinha, também numerada de 1 a <b>N</b>, é uma pequena foto de um jogador de uma das seleções que jogará a Copa do Mundo. O objetivo é colar todas as figurinhas nos respectivos espaços no álbum, de modo a completar o álbum, ou seja, não deixar nenhum espaço sem a correspondente figurinha. As figurinhas são vendidas em envelopes fechados, de forma que o comprador não sabe quais figurinhas está comprando, e pode ocorrer de comprar uma figurinha que ele já tenha colado no álbum. Para ajudar os usuários, a empresa responsável pela venda do álbum e das figurinhas quer criar um aplicativo que permita gerenciar facilmente as figurinhas que faltam para completar o álbum e está solicitando a sua ajuda. Dados o número total de espaços e figurinhas do álbum, e uma lista das figurinhas já compradas (que pode conter figurinhas repetidas), o seu desafio é determinar quantas figurinhas faltam para completar o álbum.  
</p>

**Entrada**  
<p align="justify"> A primeira linha contém um inteiro <b>N</b> (1 ≤ <b>N</b> ≤ 100) indicando o número total de figurinhas e espaços no álbum. A segunda linha contém um inteiro <b>M</b> (1 ≤ <b>M</b> ≤ 300) indicando o número de figurinhas já compradas. Cada uma das <b>M</b> linhas seguintes contém um número inteiro <b>X</b> (1 ≤ <b>X</b> ≤ N) indicando uma figurinha já comprada.
</p>

**Saída**  

Seu programa deve produzir uma única linha contendo um inteiro representando o número de figurinhas que falta para completar o álbum.  
</br> 

Exemplos de Entrada | Exemplos de Saída  
-|-
10 | 7
3 |
5 |
8 |
3 | 
3 | 0
4 |
2 |
1 |
3 |
3 | 

---  

## 4/4 DEGUSTAÇÃO DE VINHO  
<p align="justify">Degustação de vinho às escuras é a habilidade de identificar um vinho usando apenas seus sentidos do olfato e paladar. Durante uma competição de degustação, uma garrafa de vinho é aberta e dividia em taças para que os cinco competidores possam provar. Eles podem cheirar, saborear e avaliar a bebida para conseguir identificar qual o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir. No final, as respostas são verificadas para determinar o número de suposições corretas. Dado qual foi o tipo do vinho e as respostas fornecidas, determine o número de participantes que receberam a resposta correta.  
</p>

**Entrada**  
<p align="justify"> A primeira linha contém um inteiro <b>T</b> representando o tipo de vinho (1 ≤ <b>T</b> ≤ 4). A segunda linha contém cinco inteiros <b>A, B, C, D</b> e <b>E</b>, que indica a resposta dada por cada competidor (1 ≤ <b>A, B, C, D, E</b> ≤ 4).
</p>

**Saída**  

A saída contém um inteiro representando o número de concorrentes que obtiveram a resposta correta.  

</br>

Exemplos de Entrada | Exemplos de Saída  
-|-  
1 | 2
1 2 3 2 1 |
3 | 0  
4 1 1 2 1 |  

---  

## Soluções propostas  

Ver os códigos a seguir:  
| [1 - MultiplicacaoSimples]() | [2 - CoxinhaBueno]() | [3 - CompletaAlbum]() | [4 - DegustacaoCorreta]() |  

<p align="justify">
<img src="https://github.com/rosacarla/GFT-start-woman-java/blob/main/013%20Desafios-iniciais-java/images/DesafioCodigoJava_GFT.gif" width="880">
</p>  

---  

## Links úteis  

[La diferencia entre tamaño y longitud en Java](https://www.delftstack.com/es/howto/java/size-vs-length-in-java/)  
[MÉTODO CLOSE() DO LEITOR EM JAVA COM EXEMPLOS](https://acervolima.com/metodo-close-do-leitor-em-java-com-exemplos/#:~:text=O%20m%C3%A9todo%20close()%20de,estiver%20fechado%2C%20n%C3%A3o%20ter%C3%A1%20efeito.)  
[Métodos Split e IndexOf: Mais Métodos da Classe String](https://www.devmedia.com.br/metodos-split-e-indexof-mais-metodos-da-classe-string/23458#:~:text=O%20Split%20%C3%A9%20usado%20para,%E2%80%9Cagente%E2%80%9D%20divisor%20da%20mesma.)  

---  
