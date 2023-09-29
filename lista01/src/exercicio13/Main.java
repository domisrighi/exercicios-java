package exercicio13;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner algumValor = new Scanner(System.in);
		
		int menorNumero = Integer.MAX_VALUE;
		char continuar;
		
		do {
			 System.out.print("Digite um número inteiro: ");
			 int numeroAdd = algumValor.nextInt();
			 if (numeroAdd < menorNumero) {
				 menorNumero = numeroAdd;
			 }
			 System.out.print("Deseja continuar? Digite 'S' se sim, e 'N' caso não. ");
			 continuar = algumValor.next().charAt(0);

		 } while (continuar == 'S' || continuar == 's');
		 
		 if (continuar != 'N' && continuar != 'n') {
	            System.out.println("Digite somente 'S' se sim e 'N' caso não! Tente novamente.");
	        } else {
	            System.out.println("O menor número é igual a: " + menorNumero);
	            algumValor.close();
	        }
	}
}

//Integer.MAX_VALUE é o maior valor recebido pra int em java.
