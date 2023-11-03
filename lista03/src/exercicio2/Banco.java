package exercicio2;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarConta(int numero, String titular) {
        Conta novaConta = new Conta(numero, titular);
        contas.add(novaConta);
    }

    public void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : contas) {
                System.out.println(conta.toString());
            }
        }
    }

    public void realizarDeposito(int numeroConta, float valor) {
        Conta conta = localizarConta(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarSaque(int numeroConta, float valor) {
        Conta conta = localizarConta(numeroConta);
        if (conta != null) {
            float valorSacado = conta.sacar(valor);
			System.out.println("Saque de " + valorSacado + " realizado com sucesso na conta " + numeroConta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public Conta localizarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta(1, "João");
        banco.criarConta(2, "Maria");

        banco.realizarDeposito(1, 1000.0f);
        banco.realizarSaque(1, 500.0f);

        banco.listarContas();
    }
}

