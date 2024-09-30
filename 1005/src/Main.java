import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double A;
        double B;

        System.out.println("Insira a nota um: ");
        A = ler.nextDouble();
        System.out.println("Insira a nota dois:");
        B = ler.nextDouble();
        double media = (A * 3.5 + B * 7.5) / (3.5  + 7.5);
        System.out.printf("MEDIA = %.5f", media);
    }
}