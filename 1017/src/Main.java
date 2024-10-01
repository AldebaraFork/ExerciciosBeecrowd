import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        int quantidadeGasolinaGasta = 12;
        int tempoGasto = ler.nextInt();
        int velocidadeMedia = ler.nextInt();

        double gasosa = (double) (tempoGasto + velocidadeMedia) / quantidadeGasolinaGasta;

        System.out.println(gasosa);
    }
}