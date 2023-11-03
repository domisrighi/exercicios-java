package exercicio4;

class GuardaRoupas {
    private int numVest;
    private int numCalcas;
    private int numCam;
    private Vestimenta[] vestimentas;
    private int count = 0;

    public GuardaRoupas(int numVest, int numCalcas, int numCam) {
        this.numVest = numVest;
        this.numCalcas = numCalcas;
        this.numCam = numCam;
        this.vestimentas = new Vestimenta[numVest + numCalcas + numCam];
    }

    public void guardar(Vestido vestido) {
        if (count < numVest) {
            vestimentas[count] = vestido;
            count++;
        } else {
            System.out.println("Guarda-roupas de vestidos está cheio.");
        }
    }

    public void guardar(Calca calca) {
        if (count < numVest + numCalcas) {
            vestimentas[count] = calca;
            count++;
        } else {
            System.out.println("Guarda-roupas de calças está cheio.");
        }
    }

    public void guardar(Camisa camisa) {
        if (count < numVest + numCalcas + numCam) {
            vestimentas[count] = camisa;
            count++;
        } else {
            System.out.println("Guarda-roupas de camisas está cheio.");
        }
    }

    public void listar() {
        System.out.println("Vestimentas no guarda-roupas:");
        for (int i = 0; i < count; i++) {
            System.out.println(vestimentas[i]);
        }
    }

    public static void main(String[] args) {
        GuardaRoupas guardaRoupas = new GuardaRoupas(3, 3, 3);

        Vestido vestido1 = new Vestido("Azul", "Algodão", true);
        Calca calca1 = new Calca("Preto", "Jeans", 30);
        Camisa camisa1 = new Camisa("Branca", "Algodão", "Manga Curta", 15);

        guardaRoupas.guardar(vestido1);
        guardaRoupas.guardar(calca1);
        guardaRoupas.guardar(camisa1);

        guardaRoupas.listar();

        System.out.println("Número de objetos da classe Vestimenta criados: " + Vestimenta.obterNumeroDeVestimenta());
    }
}