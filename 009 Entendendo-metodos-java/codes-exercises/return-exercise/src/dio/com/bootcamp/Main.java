package dio.com.bootcamp;

public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        //retornos sao guardados em variaveis, porque metodos retornam doubles //
        double areaQuadrado = Quadrilateral.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilateral.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilateral.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}