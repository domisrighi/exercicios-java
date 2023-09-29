package exercicio04;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner numeroDeHoras = new Scanner(System.in);
		
		int numeroDeDias = 30;
		float ganhoHora = 10.00f;
		int totalHorasTrabalhadas = 0;
		
		for (int i = 1; i <= numeroDeDias; i++) {
			System.out.println("Digite o número de horas trabalhadas no dia " + i + ": ");
			int horasTrabalhadas = numeroDeHoras.nextInt();
			totalHorasTrabalhadas += horasTrabalhadas;
		}
		
		float salarioBruto = totalHorasTrabalhadas * ganhoHora;
		
		System.out.println("O salário recebido pelo funcionário é de R$" + salarioBruto + " reais.");
		numeroDeHoras.close();
	}
}