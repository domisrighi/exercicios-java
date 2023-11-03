package exercicio23;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float[] numeros = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = ler.nextFloat();
        }

        Arrays.sort(numeros);
        float temp = numeros[0];
        numeros[0] = numeros[2];
        numeros[2] = temp;

        System.out.println("Números em ordem decrescente: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        ler.close();
    }
}