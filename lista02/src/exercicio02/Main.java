package exercicio02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int quantidadeEntre = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = ler.nextInt();
			
			if (numeros[i] >= 30 && numeros[i] <= 90) {
				quantidadeEntre++;
			}
		}
		
		System.out.println("A quantidade de números entre 30 e 90 é de: " + quantidadeEntre);
		ler.close();
	}
}