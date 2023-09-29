package exercicio14;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner numeroInserido = new Scanner(System.in);
		
		int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        char continuar;
        
        do {
            System.out.print("Digite um número inteiro: ");
            int numero = numeroInserido.nextInt();

            if (numero > maiorValor) {
                maiorValor = numero;
            }
            if (numero < menorValor) {
                menorValor = numero;
            }
            do {
                System.out.print("Deseja continuar? Digite 'S' se sim, e 'N' caso não. ");
                continuar = numeroInserido.next().charAt(0);
                continuar = Character.toUpperCase(continuar);
            } while (continuar != 'S' && continuar != 'N');
            
        } while (continuar == 'S');
        
        System.out.println("O maior número fornecido foi: " + maiorValor);
        System.out.println("O menor número fornecido foi: " + menorValor);
        numeroInserido.close();
	}
}