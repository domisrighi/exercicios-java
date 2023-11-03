package exercicio1;

public class TestarEquipamentoSonoro {
    public static void main(String[] args) {
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(false, true, 5);

        // Liga o equipamento sonoro
        equipamentoSonoro.ligar();
        System.out.println("Equipamento Ligado.");
        System.out.println(equipamentoSonoro.toString());

        // Altera para modo mono
        equipamentoSonoro.mono();
        System.out.println("Modo Mono.");
        System.out.println(equipamentoSonoro.toString());

        // Aumenta o volume
        equipamentoSonoro.aumentarVolume();
        System.out.println("Aumentar Volume:");
        System.out.println(equipamentoSonoro.toString());

        // Diminui o volume
        equipamentoSonoro.diminuirVolume();
        System.out.println("Diminuir Volume:");
        System.out.println(equipamentoSonoro.toString());

        // Desliga o equipamento sonoro
        equipamentoSonoro.ligar();
        System.out.println("Equipamento ligado.");
        System.out.println(equipamentoSonoro.toString());
    }
}

