import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jan, fev, mar, abr, media;
        
        System.out.println("Informe os valores de suas vendas no 1o. quadrimestre.");
        jan = input.nextInt();
        fev = input.nextInt();
        mar = input.nextInt();
        abr = input.nextInt();
        media = (int) ((double) (jan + fev + mar + abr) / 4);
        System.out.println("O valor medio de suas vendas é: ");
        System.out.println(media);
        if (media >= 5000) {
            System.out.println("Parabens, voce vai receber um abono de 10%!");
            System.out.println("Seu abono será no valor de: ");
            System.out.println((double) (media * 10) / 100);
        } else {
            System.out.println("Você receberá um abono de 3%!");
            System.out.println("Seu abono será no valor de: ");
            System.out.println((double) (media * 3) / 100);
        }
    }
}
