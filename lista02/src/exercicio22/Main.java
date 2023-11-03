package exercicio22;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o valor nº " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("O valor " + numeros[i] + " é par.");
            } else {
                System.out.println("O valor " + numeros[i] + " é ímpar.");
            }
        }

        ler.close();
    }
}