package exercicio08;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float[] numeros = new float[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite o número " + (i + 1) + " : ");
			numeros[i] = ler.nextFloat();
		}
		
		float maiorNumero = numeros[0];
		for (int i = 0; i < 2; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		
		System.out.println("O maior número é: " + maiorNumero);
		ler.close();
	}
}
