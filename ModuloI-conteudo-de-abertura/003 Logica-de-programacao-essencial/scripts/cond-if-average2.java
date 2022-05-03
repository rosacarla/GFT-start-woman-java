import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;
        
        nota1 = input.nextDouble();
        nota2 = input.nextDouble();
        nota3 = input.nextDouble();
        nota4 = input.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua media é: ");
        System.out.println(media);
        if (media >= 7) {
            System.out.println("Parabens, voce foi aprovado!");
        } else {
            System.out.println("Infelizmente voce foi reprovado.");
        }
    }
}
