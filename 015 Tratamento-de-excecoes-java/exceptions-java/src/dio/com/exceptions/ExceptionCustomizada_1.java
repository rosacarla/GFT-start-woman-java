package dio.com.exceptions;

import javax.swing.*;
import java.io.*;

//Imprimir arquivo o console
public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());  //passa msg da classe exception personalizada Impossivel...
            e.printStackTrace();
        } catch (IOException ex) { //exception generica de fechamento, descarregar, ler linha, pular linha, escrever
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    //classe recebe tratamento de exceção customizada pra falha na abertura de arquivo
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath()); //lança nova exception
            //getName() e getPath() são da classe File
        }
    }
}

//classe de exception customizada, criada abaixo do fechamento de ExceptionCustomizada_1
//fica como se fosse criada externamente
class ImpossivelAberturaDeArquivoException extends Exception {  //classe estende de Exception (herdeira — OPP)
//é boa prática colocar Exception no final do nome de uma classe de exceção

    private String nomeDoArquivo;  //atributo 1
    private String diretorio; //atributo 2

    //construtor mostra várias formas pra criar que são herdadas de Exception
    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio + ".'");
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    //sobrescreve toString personalizado
    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }

    /*
    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }  */
}

/* Na execução 1 com nome de arquivo errado, estoura a exception ImpossivelAberturaDeArquivoException
e imprime na 1a. linha da pilha o retorno do toString (nome do arq e diretorio), conforme segue:

ImpossivelAberturaDeArquivoException{nomeDoArquivo='carla.txt', diretorio='carla.txt'}
	at dio.com.exceptions.ExceptionCustomizada_1.lerArquivo(ExceptionCustomizada_1.java:44)
	at dio.com.exceptions.ExceptionCustomizada_1.imprimirArquivoNoConsole(ExceptionCustomizada_1.java:17)
	at dio.com.exceptions.ExceptionCustomizada_1.main(ExceptionCustomizada_1.java:10)

Com exception ou não, o programa continua...

Na execução 2 com toString desativado, estoura a exception ImpossivelAberturaDeArquivoException
e imprime na 1a. linha da pilha a mensagem padrao herdada da classe, como segue:

dio.com.exceptions.ImpossivelAberturaDeArquivoException: O arquivo casa.tre não foi encontrado no diretório casa.tre.'
	at dio.com.exceptions.ExceptionCustomizada_1.lerArquivo(ExceptionCustomizada_1.java:45)
	at dio.com.exceptions.ExceptionCustomizada_1.imprimirArquivoNoConsole(ExceptionCustomizada_1.java:17)
	at dio.com.exceptions.ExceptionCustomizada_1.main(ExceptionCustomizada_1.java:10)

Com exception ou não, o programa continua...
 */
