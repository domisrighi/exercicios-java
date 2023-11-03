package exercicio21;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float[] notas = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota nº " + (i + 1) + ": ");
            notas[i] = ler.nextFloat();
        }

        float mediaNotas = (notas[0] + notas[1] + notas[2]) / 3;

        if (mediaNotas >= 7.0) {
            System.out.println("Aprovado(a)!");
        } else {
            System.out.println("Reprovado(a).");
        }
        
        ler.close();
    }
}