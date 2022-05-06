import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nome, sobrenome, idade;
        
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = input.nextLine();
        System.out.println("Digite sua idade: ");
        idade = input.nextLine();
        System.out.println("O seu nome é: " + nome + " e o seu sobrenome é: " + sobrenome + "." + " A sua idade é: " + idade + ".");
    }
}
