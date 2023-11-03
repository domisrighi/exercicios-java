package exercicio1;

public class EquipamentoSonoro extends Equipamento {
	boolean stereo;
	int volume;
	
	public EquipamentoSonoro(boolean ligado, boolean stereo, int volume) {
		this.stereo = stereo;
		this.volume = volume;
	}
	
	void ligar() {
		super.ligar(); //chama o método ligar da superclasse
		volume = 5;	//ajusta o atributo volume para 5
	}
	
	void mono() {
		stereo = false;
	}

	void stereo() {
		stereo = true;
	}

	void aumentarVolume() {
		if(ligado && volume < 10) {
			volume++;
		}
	}

	void diminuirVolume() {
		if(ligado && volume > 0) {
			volume--;
		}
		
	}
	
	public String toString() {
		String statusEquipamento = super.toString();
		String modoStereo = stereo ? "Estéreo" : "Mono";
		String numVolume = "Volume: " + volume; 
		
		return statusEquipamento + "\nModo: " + modoStereo + "\n" + numVolume;
	}
	
	public static void main(String[] args) {
		EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(false, true, 5);
		equipamentoSonoro.ligar();
		System.out.println(equipamentoSonoro.toString());
	}

}