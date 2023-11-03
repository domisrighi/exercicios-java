package exercicio24;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a capacidade máxima do elevador em kg: ");
        float capacidadeMax = ler.nextFloat();
        float[] pesos = new float[5];
        float pesoTotal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o peso da pessoa nº " + (i + 1) + ": ");
            pesos[i] = ler.nextFloat();
        }
        
        for (int i = 0; i < 5; i++) {
            pesoTotal += pesos[i];
        }

        if (pesoTotal <= capacidadeMax) {
            System.out.println("O elevador está liberado para subir!");
        } else {
            System.out.println("O elevador excedeu a carga máxima.");
        }

        ler.close();
    }
}