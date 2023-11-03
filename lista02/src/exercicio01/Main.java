package exercicio01;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float[] idades = new float[7];
		float[] pesos = new float[7];
		//contadores
		int maisDe90Kg = 0;
		float totalDeIdades = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.println("Digite a idade da pessoa " + (i + 1) + " : ");
			idades[i] = ler.nextFloat();
			
			System.out.println("Digite o peso da pessoa " + (i + 1) + " em kg: ");
			pesos[i] = ler.nextFloat();
			
			totalDeIdades += idades[i];
			
			if (pesos[i] > 90) {
				maisDe90Kg++;
			}
		}
		
		float mediaIdades = totalDeIdades / 7;
		
		System.out.println("Quantidade de pessoas com mais de 90kg: " + maisDe90Kg);
		System.out.println("Média das idades de 7 pessoas: " + mediaIdades);
		ler.close();
	}
}