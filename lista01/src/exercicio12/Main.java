package exercicio12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE; // inicializa o maior valor com o menor valor possível

        System.out.println("Digite números inteiros (digite um número negativo para sair): ");

        while (true) {
            int numero = input.nextInt();

            if (numero < 0) {
                break; // sai do loop qnd um número negativo for inserido
            }

            if (numero > maiorValor) {
                maiorValor = numero; // atualiza o maior valor, se necessário
            }
        }

        if (maiorValor != Integer.MIN_VALUE) {
            System.out.println("O maior valor fornecido foi: " + maiorValor);
        } else {
            System.out.println("Nenhum valor válido foi fornecido.");
        }
        input.close();
    }
}