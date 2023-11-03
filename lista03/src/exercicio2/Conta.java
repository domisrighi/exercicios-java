package exercicio2;

class Conta {
    private int numero;
    private String titular;
    private float saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0f;
    }

    public int getNumero() {
        return numero;
    }

    public float sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente.");
            return 0.0f;
        }
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta [Número: " + numero + ", Titular: " + titular + ", Saldo: " + saldo + "]";
    }
}