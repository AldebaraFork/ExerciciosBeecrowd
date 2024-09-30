import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double pi = 3.14159;
        double raio = ler.nextDouble();
        double volume = ((double) 4 /3) * pi * (raio * raio * raio);
        System.out.printf("Volume = %.3f", volume);
    }
}