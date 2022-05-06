import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String cliente;
        boolean cartao;
        String numero;
        
        cliente = input.nextLine();
        cartao = input.nextBoolean();
        if (cartao) {
            numero = input.nextLine();
        } else {
            System.out.println("Infelizmente a loja aceita compras só via cartao.");
        }
    }
}
