package exercicio07;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] numeros = new int[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o número " + (i+1) + " : ");
			numeros[i] = ler.nextInt();
		}
		
		int produto = numeros[0] * numeros[1];
		
		System.out.println("O produto dos números é igual a: " + produto);
		ler.close();
	}
}