package dio.com.exceptions;

import javax.swing.*;
import java.io.*;

//Imprimir um arquivo no console.
public class CheckedException {  //compilador avisa que só roda programa se exceptions forem resolvidas
    public static void main(String[] args) {  //metodo chamador do imprimirArquivoNoConsole
        //metodo mains tambem recebe tratamento de exceção porque chama o metodo imprimir que teve mesmo tratamento
        String nomeDoArquivo = "romance-blake-crouch.txt";  //string recebe nome do arquivo pra impressao

        try {
        imprimirArquivoNoConsole(nomeDoArquivo);  //executa o metodo de impressao
        } catch (FileNotFoundException e) {  //tratamento pra falha no FileReader
            JOptionPane.showMessageDialog(null,                 //metodo getCause exibe motivo do erro
                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            e.printStackTrace();
        } catch (IOException e) {  //tratamento pra erro genérico, como de leitura, escrita ou descarregar
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua..."); //se der certo ou nao, programa segue
    }

    //metodo para imprimir arquivo no console
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException { //mae FileNotFoundException
        File file = new File(nomeDoArquivo);  //inicia objeto do tipo File

        //classe BufferedReader usada pra ler fluxo de entrada baseado em caracteres
        BufferedReader br = new BufferedReader(new FileReader(file.getName())); //cria buffered com doc pra impressao
        //metodo FileReader pode receber nome do arquivo ou caminho/diretorio dele
        //FileReader lança FileNotFoundException que deve ser tratada, filha de IOException que resolve todas

        //metodo readLine() faz leitura linha por linha do buffered
        String line = br.readLine();
        //metodo readLine() lança exception IOException que deve ser tratada

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //OutputStreamWriter abre o console
        //BufferedWriter edita o fluxo de saida do buffered no console

        //loop do-while lê cada linha do BufferedReader e imprime no console
        do{  //todos metodos abaixo lançam exception IOException que devem ser tratadas
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);  //loop continua ate que nao tenha nada pra ser lido no doc
        bw.flush();  //pede pra descarregar o buffered
        br.close(); //fecha o arquivo
    }
}
/* Ao passar nome errado do arquivo pra impressão, estouram as exceptions porque o metodo FileReader
não conseguiu ler o arquivo com nome errado e lança a exception "FileNotFoundException" na lin. 34,
que aparece tambem junto do main na 1a linha da pilha, conforme segue:

Exception in thread "main" java.io.FileNotFoundException: romance-blake-crouch.txt (O sistema não pode encontrar o
arquivo especificado)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
	at java.base/java.io.FileReader.<init>(FileReader.java:60)
	at dio.com.exceptions.CheckedException.imprimirArquivoNoConsole(CheckedException.java:34)
	at dio.com.exceptions.CheckedException.main(CheckedException.java:13)
 */