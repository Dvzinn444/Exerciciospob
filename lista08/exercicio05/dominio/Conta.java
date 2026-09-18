package lista08.exercicio05.dominio;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        return saldo;
    }

    public double sacar(double valor) {
        return sacar(valor, 0);
    }

    public double sacar(double valor, double limite) {
        if (valor > 0 && valor <= saldo + limite) {
            saldo -= valor;
        }
        return saldo;
    }
}
