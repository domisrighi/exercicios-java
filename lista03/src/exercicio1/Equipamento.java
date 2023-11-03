package exercicio1;

public class Equipamento {
	boolean ligado;
	
	void ligar() {
		ligado = true;
	}
	
	void desligar() {
		ligado = false;
	}
	
	public String toString() {
		if (ligado) {
			return "O equipamento está ligado!";
		} else {
			return "O equipamento está desligado.";
		}
	}
	
	public static void main(String[] args) {
		Equipamento equipamento = new Equipamento();
		equipamento.ligar();
		System.out.println(equipamento.toString());
		equipamento.desligar();
		System.out.println(equipamento.toString());
	}
}