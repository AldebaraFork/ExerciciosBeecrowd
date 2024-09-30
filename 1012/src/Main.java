import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();

        double areaTriangulo = (A*C)/2;
        double areaCirculo = 3.14159* (C * C);
        double areaTrapezio = ((A + B)*C) /2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

    }
}