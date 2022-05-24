package dio.com.bootcamp;
/**
 * Classe de exemplo para o exercício da Aula 3 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.
 */
public class Main {

    public static void main(String[] args) {

        //metodos
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();  // criacao de var intermediarias

        switchSemana();
        switchNumero();
        switchFerias();
    }
    /*
    Exemplo de if flecha que deve ser evitado, por causa
     da indentação que se prolonga pra direita e ocupa
     cada vez mais espaço na tela.
    */
    private static void ifFlecha() {

        int mes = 9;
        //int mes = 20; condição obtém resposta mês indefinido //
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }  //efeito flecha nao tem problema de execução, mas é ruim esteticamente. //

    //Exemplo de if sem flecha com uso de "if-else" //
    private static void ifSemFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else {
            System.out.println("Dezembro");
        }
//      } else if (mes == 12) {
//            System.out.println("Dezembro");
//      } else {
//            System.out.println("Mês indefinido");
//      }

    }

    /*
     Exemplo de como nao fazer o if por ter variavel única
     caberia usar um switch porque se busca um valor exato.
    */
    private static void ifFerias() {

        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    //metodo com finalidade de melhorar os ifs pra resumi-los //
    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio.");
        } else {
            System.out.println("Funcionário não deve receber auxílio.");
        }

    }

    //Exemplo de testes com valores que a variavel unica pode assumir //
    private static void switchSemana() {

        String dia = "Terça";
        //String dia = "mgmgjmg"; obtém resposta dia inválido//
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
//                System.out.println(1);
                System.out.println("Dia inválido");
                break;
        }
    }

    //Exemplo de teste com switch para obter mais de 1 resposta //
    private static void switchNumero() {

        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break; //interrompe execução quando ocorrer um dos 3 casos //
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    //Exemplo de switch com strings para obter mais de 1 resposta //
    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break; //interrompe quando houver um dos 3 casos //
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }
}