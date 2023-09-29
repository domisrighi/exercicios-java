package exercicio11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        System.out.println("Digite números inteiros e positivos (Digite um número negativo para sair): ");

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // sai do loop quando o número for negativo
            }

            soma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }

        scanner.close();
    }
}
