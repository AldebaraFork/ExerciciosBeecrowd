import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int distancia = ler.nextInt();
        double combustivelGasto = ler.nextDouble();
        double gasosa = distancia / combustivelGasto;


        System.out.printf("%.3f km/l", gasosa);
    }
}