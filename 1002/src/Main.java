import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);

        double a = ler.nextDouble();
        double n = 3.14159;
        double calculoArea = n * (a * a);


        System.out.printf("A=%.4f%n", calculoArea);

    }
}