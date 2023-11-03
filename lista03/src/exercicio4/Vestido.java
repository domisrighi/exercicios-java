package exercicio4;

class Vestido extends Vestimenta {
    private boolean longo;

    public Vestido(String cor, String tecido, boolean longo) {
        super(cor, tecido);
        this.longo = longo;
    }

    public String toString() {
        return super.toString() + "\nLongo: " + longo;
    }
}