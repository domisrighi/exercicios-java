package exercicio06;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite o valor de N:");
		
		float n = numero.nextFloat();
		int h = 0;
		
		for (int i = 1; i <= n; i++) {
			h += i;
		}
		System.out.println("O valor de H é igual a: " + h);
		numero.close();
	}
}