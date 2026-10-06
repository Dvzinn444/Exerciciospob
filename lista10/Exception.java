package lista10;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class ContaCorrente{
    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar " + valor);
        }
        saldo -= valor;
        System.out.println("Saque realizado. Novo saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345-6", 100.0);

        try {
            System.out.println("Tentando sacar R$ 40,00...");
            conta.sacar(40.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente para sacar ");
        }
        try {
            System.out.println("Tentando sacar R$ 80,00...");
            conta.sacar(80.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente para sacar ");
        }
    }
}
}
