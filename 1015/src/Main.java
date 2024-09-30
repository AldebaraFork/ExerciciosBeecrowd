import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double x1 = ler.nextDouble();
        double x2 = ler.nextDouble();

        double y1 = ler.nextDouble();
        double y2 = ler.nextDouble();

        double distancia = ((x2 - x1) * 2) + ((y2 - y1) * 2);

        System.out.printf("%.3f", distancia);
    }
}