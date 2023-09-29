package exercicio01;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner peso = new Scanner(System.in);
		
		int numeroDeCaixas = 25;
		float pesoTotal = 0.0f;
		
		for (int i = 1; i <= numeroDeCaixas; i++) {
			System.out.print("Digite o peso da caixa " + i + ": " ); 
			
			float pesoDaCaixa = peso.nextFloat();
			pesoTotal += pesoDaCaixa;
		}
		System.out.println("O peso total carregado pelo caminhão é: " + pesoTotal + " kg");
		peso.close();
	}
}