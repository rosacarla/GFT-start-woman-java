/* 
HORA DO CODIGO MINECRAFT


1 - Adicione um segundo comando "andar à frente" para chegar à ovelha.
*/
moveForward();
moveForward();


/*
2 - Madeira é um recurso muito importante. Muitas coisas são feitas com ela. 
Siga até a árvore e utilize o bloco "destruir" para cortar ela.
*/
moveForward();
moveForward();
destroyBlock();


/*
3 - Hora de tosar ovelhas! 
Utilize o comando "tosar" para coletar lã das 2 ovelhas.
*/
moveForward();
moveForward();
shear();
turnRight();
moveForward();
shear();


/*
4 - Precisamos construir uma casa antes que o sol se ponha. 
Casas utilizam muita madeira. Corte todas as 3 árvores.
*/
moveForward();
moveForward();
moveForward();
destroyBlock();
turnLeft();
moveForward();
moveForward();
moveForward();
destroyBlock();
turnLeft();
moveForward();
moveForward();
moveForward();
destroyBlock();


/*
5 - Toda casa é iniciada com uma parede. Construa a 1a. parte da casa colocando
um comando "colocar" e "seguir em frente" dentro de um laço de repetição.
*/
for (var count = 0; count < 4; count++) {
    placeBlock("planksOak");
    moveForward();
  }

  
/*
6 - Construa o restante da sua casa com qualquer material que desejar.
O comando "repetir" será útil.
*/
for (var count = 0; count < 3; count++) {
    moveForward();
    placeBlock("planksBirch");
  }
  turnRight();
  for (var count2 = 0; count2 < 3; count2++) {
    moveForward();
    placeBlock("planksBirch");
  }
  turnRight();
  for (var count3 = 0; count3 < 3; count3++) {
    moveForward();
    placeBlock("planksBirch");
  }


/*
7 - É sempre bom pensar no futuro.
Plante colheitas nos dois lados da água para você não passar fome depois.
*/
for (var count = 0; count < 6; count++) {
    plantCrop();
    moveForward();
  }
  turnRight();
  moveForward();
  moveForward();
  turnRight();
  for (var count2 = 0; count2 < 6; count2++) {
    moveForward();
    plantCrop();
  }


/*
8 - Não é uma boa ideia topar com um Creeper. 
Passe com cuidado pelos Creepers e chegue na sua casa em segurança.
*/
for (var count = 0; count < 4; count++) {
    moveForward();
  }
  turnLeft();
  for (var count2 = 0; count2 < 4; count2++) {
    moveForward();
  }
  turnLeft();
  for (var count3 = 0; count3 < 2; count3++) {
    moveForward();
  }
  OK


/*
9 - Você encontrará os recursos mais valiosos no subterrâneo, 
mas pode ficar escuro lá dentro. Coloque pelo menos 2 tochas
e minere pelo menos 2 carvões.
*/
placeTorch();
turnLeft();
for (var count = 0; count < 2; count++) {
  destroyBlock();
  moveForward();
}
placeTorch();


/*
10 - Não é uma boa ideia tentar andar sobre lava incandescente.
Coloque os paralelepípedos para criar uma ponte, depois minere
pelo menos dois dos blocos de ferro.
*/
moveForward();
placeBlockAhead("cobblestone");
for (var count = 0; count < 2; count++) {
  moveForward();
}
for (var count2 = 0; count2 < 2; count2++) {
  destroyBlock();
  moveForward();
}


/*
11 - Lava está escondida abaixo de alguns desses blocos, e você precisará cobri-los para mover adiante.
Um comando "se" será útil aqui. 
Adicione um comando "seguir em frente" no lugar correto para minerar esses blocos.
*/
for (var count = 0; count < 7; count++) {
    destroyBlock();
    ifLavaAhead(function() {
      placeBlockAhead("cobblestone");
    });
    moveForward();
  }

  
/*
12 - Agora as coisas estão ficando complicadas. Destrua 3 redstones, 
mas não caia na lava. Utilize um comando "se" para colocar cobblestone
em cima de qualquer lava que você descobrir.
*/
for (var count = 0; count < 2; count++) {
    moveForward();
  }
  for (var count2 = 0; count2 < 2; count2++) {
    destroyBlock();
    ifLavaAhead(function() {
      placeBlockAhead("cobblestone");
    });
    moveForward();
  }
  turnLeft();
  for (var count3 = 0; count3 < 4; count3++) {
    destroyBlock();
    ifLavaAhead(function() {
      placeBlockAhead("cobblestone");
    });
    moveForward();
  }


/*
13 - Ótimo trabalho! Você coletou vários recursos e construiu uma casinha modesta. 
Agora, construa o trilho desde a borda do mapa até a porta da sua casa.
*/
turnRight();
for (var count = 0; count < 6; count++) {
  placeBlock("rail");
  moveForward();
}
turnRight();
for (var count2 = 0; count2 < 6; count2++) {
  placeBlock("rail");
  moveForward();
}


/*
14 - Parabéns! Você concluiu todas as nossas tarefas! 
Agora, minere, construa e crie algo único, usando tudo que você já aprendeu.
*/
turnRight();
for (var count = 0; count < 6; count++) {
  moveForward();
}
for (var count2 = 0; count2 < 4; count2++) {
  placeBlock("bedrock");
  moveForward();
}


/*
Fim do codigo.
*/
