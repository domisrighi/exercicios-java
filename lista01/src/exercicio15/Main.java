package exercicio15;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número positivo (ou digite 0 para sair): ");

        while (true) {
            int numero = input.nextInt();

            if (numero == 0) {
                break; // sai do loop quando 0 for inserido
            }

            if (numero < 0) {
                System.out.println("Por favor, digite um número positivo.");
                continue; // volta para o início do loop se o número for negativo
            }

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par.");
            } else {
                System.out.println("O número " + numero + " é ímpar.");
                input.close();
            }
        }
    }
}