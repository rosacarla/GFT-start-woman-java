package dio.com.bootcamp;
/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Mensagem {

    //criado metodo principal, usado pela classe principal Main //
    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia(); //poderia usar System.out.println() pra mostrar msg //
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default: // usado por causa do switch, se hora informada nao estiver no intervalo, mostra msg de erro //
                System.out.println("Hora inválida.");
                break;
        }
    }
    /* metodos pra mostrar mensagens de 3 metodos anteriores;
       imprime msg de saudação conforme a hora do dia */
    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }

}