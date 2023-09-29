package exercicio02;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int numeroDeProdutos = 45;
		float totalGasto = 0f;
		
		 for (int i = 1; i <= numeroDeProdutos; i++) {
			 System.out.print("Digite a quantidade do produto " + i + ": ");
			 int numeroQtd = numero.nextInt();
			 
			 System.out.print("Digite o preço do produto " + i + ": ");
			 float precoProduto = numero.nextFloat();
			 
			 totalGasto += numeroQtd * precoProduto;
		 }
		 System.out.println("O total gasto pela empresa é: R$" + totalGasto);
		 numero.close();
	}
}