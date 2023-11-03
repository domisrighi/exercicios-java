package exercicio03;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int[] idades = new int[10];
		float[] pesos = new float[10];
		float[] alturas = new float[10];
		
		int somaIdades = 0;
		int maisDe90KgMenosDe150Cm = 0;
		int maisDe190CmEntre10E30Anos = 0;
		int totalMaior190Cm = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a idade da pessoa " + (i + 1) + " : ");
			idades[i] = ler.nextInt();
			
			System.out.println("Digite o peso da pessoa " + (i + 1) + " : ");
			pesos[i] = ler.nextFloat();
			
			System.out.println("Digite a altura da pessoa " + (i + 1) + " : ");
			alturas[i] = ler.nextFloat();
			
			somaIdades += idades[i];
			
			if (pesos[i] > 90 && alturas[i] < 1.50) {
				maisDe90KgMenosDe150Cm++;
			}
			if (idades[i] >= 10 && idades[i] <= 30 && alturas[i] > 1.90) {
				maisDe190CmEntre10E30Anos++;
			}
			if (alturas[i] > 1.90) {
				totalMaior190Cm++;
			}
		}
		
		float mediaIdades = somaIdades / 10;
		float porcentagem = maisDe190CmEntre10E30Anos / totalMaior190Cm * 100;
		
		System.out.println("Média das idades das 10 pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90kg e altura inferior a 1.50cm: " + maisDe90KgMenosDe150Cm);
        System.out.println("Porcentagem de pessoas com idade entre 10 a 30 anos entre as pessoas que medem mais de 1.90cm: " + porcentagem + "%");
        ler.close();
	}
}
