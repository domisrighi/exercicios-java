package exercicio03;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner nH = new Scanner(System.in);
		
		int numeroDeDias = 30;
		int totalHorasTrabalhadas = 0;
		
		for (int i = 1; i <= numeroDeDias; i++) {
			System.out.print("Digite o número de horas trabalhadas por dia " + i + ": ");
			
			int horasTrabalhadas = nH.nextInt();
			totalHorasTrabalhadas += horasTrabalhadas;
		}
		System.out.println("Total de horas trabalhadas em 30 dias: " + totalHorasTrabalhadas + " horas.");
		nH.close();
	}
}

//horas redondas