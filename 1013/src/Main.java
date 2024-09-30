import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int A = ler.nextInt();
        int B = ler.nextInt();
        int C = ler.nextInt();

        int maiorAB = (A+B+Math.abs(A - B)) /2;

        int maior = (maiorAB > C) ? maiorAB : C;
        System.out.println(maior + " eh o maior");


    }
}