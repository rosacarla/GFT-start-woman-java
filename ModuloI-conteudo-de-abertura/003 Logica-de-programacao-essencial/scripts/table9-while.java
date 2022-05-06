import java.util.*;
import java.lang.Math;

public class JavaApplication {
    public static void main(String[] args) {
        int numero, limite;
        
        numero = 0;
        limite = 10;
        System.out.println("## TABUADA 9 ##");
        while (numero <= limite) {
            System.out.println("9 x " + numero + " = " + 9 * numero);
            numero = numero + 1;
        }
    }
}
