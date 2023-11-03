package exercicio4;

class Vestimenta {
    protected String cor;
    protected String tecido;
    protected static int cont = 0;

    public Vestimenta(String cor, String tecido) {
        this.cor = cor;
        this.tecido = tecido;
        cont++;
    }

    public static int obterNumeroDeVestimenta() {
        return cont;
    }

    public String toString() {
        return "Cor: " + cor + "\nTecido: " + tecido;
    }
}