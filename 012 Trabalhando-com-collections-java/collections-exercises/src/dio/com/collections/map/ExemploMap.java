package dio.com.collections.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 Obs.: modelo é a key e consumo é o value.
 */
          //opções para iniciar um Map
//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        //HashMap cria dicionario com chave (modelo) e value (consumo)
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{ //inicia o Map com tipos de chave string e valor double
            //metodo put() pra incluir chaves e valores; nao tem add() na interface Map
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares); //impressao do dicionário do map
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo put() usado pra substituição de chave/valor
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); //put() recebe chave e valor pra substituir no map
        System.out.println(carrosPopulares); //imprime dicionario atualizado
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo containsKey() verifica se elemento está no dicionário
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Confira se o modelo uno está no dicionário: " + carrosPopulares.containsKey("uno"));
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo get() mostra o valor da chave informada (objeto)
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("Exiba o consumo do mobi: " + carrosPopulares.get("mobi"));
        System.out.println("--------------------------------------------------------------------------- \n");

        //não é possível executar a linha de comando abaixo
        // System.out.println("Exiba o terceiro modelo adicionado: ");
        //Map nao tem método para mostrar chave/valor pela posição de inserção

        //metodo keySet() mostra as chaves em um set
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); //precisa inf tipo de dado (string)
        System.out.println(modelos); //var "modelos" recebe o conjunto
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo values() mostra os valores da coleção
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos); //var "consumos" recebe a coleção de values
        System.out.println("--------------------------------------------------------------------------- \n");

        //MÉTODO max() de Collections mostra maior valor
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        //max() recebe uma collection do metodo values() que traz valores das chaves
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); //var "consumoMaisEficiente" armazena
        //metodo entrySet() retorna set com elementos do tipo entry que, neste caso, sao string e double
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";  //variavel de controle

        for (Map.Entry<String, Double> entry : entries) {  //forEach percorre elementos entries em entry
            if (entry.getValue().equals(consumoMaisEficiente)) { //condição pra achar consumo eficiente em entry
                modeloMaisEficiente = entry.getKey(); //var controle recebe chave de entry ref ao valor do consumo
                System.out.println("Exiba Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("--------------------------------------------------------------------------- \n");

        //MÉTODO min() recebe collection do metodo values com consumo menos eficiente
        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        //var consumoMenosEficiente armazena collection de valores
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";  //criada var de controle
        //entrySet() retorna um set onde pode manipular chaves e valores separadamente
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) { //forEach percorre entry.Set
            if(entry.getValue().equals(consumoMenosEficiente)) { //condicao valor do entry é igual consumo - eficiente
                modeloMenosEficiente = entry.getKey(); //var de controle recebe chave do entry
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
         }
         System.out.println("--------------------------------------------------------------------------- \n");

        //iterator() percorre o set de consumos e exibe a soma deles
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;  //variavel pra guardar soma
        while(iterator.hasNext()){  //while pergunta se tem proxima chave
            soma += iterator.next(); //executa a soma dos valores das iterações
        }
        System.out.println("Exiba a soma dos consumos: " + soma); //imprime a soma final
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo size() exibe a média de consumos do dicionario
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
        System.out.println("--------------------------------------------------------------------------- \n");

        //iterator() percorre o dicionario pra buscar chaves que atendem a condição de exclusao
        System.out.println(carrosPopulares); //imprime cj completo para comparar com o cj atualizado
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator(); //
        while(iterator1.hasNext()){  //while pergunta por proxima chave
            if(iterator1.next().equals(15.6)) iterator1.remove(); //condição pra remover chave/valor
        }
        System.out.println(carrosPopulares);
        System.out.println("--------------------------------------------------------------------------- \n");

        //LinkedHashMap mostra ordem de inserção do dicionario
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{  //var carrosPopulares1 recebe dicionario
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);  //imprime novo dicionario
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo TreeMap() executa ordenação por chave que corresponde ao modelo
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        //var carrosPopulares2 recebe o novo dicionario com ordem natural/alfabetica das chaves
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);  //imprime novo dicionario por ordem de modelo
        System.out.println("--------------------------------------------------------------------------- \n");

        //metodo clear apaga elementos
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();  //clear apaga dicionario
        System.out.println(carrosPopulares); //imprime dicionario atualizado

        //metodo isEmpty verifica se map está vazio
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
        System.out.println("--------------------------------------------------------------------------- \n");
    }
}
