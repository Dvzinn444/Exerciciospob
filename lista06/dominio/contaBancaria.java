package lista06.dominio;

public class contaBancaria {
    String titular;
    double saldo = 0.0;

    public contaBancaria(String titular) {
        this.titular = titular;
    }

    public String setTitular(String titular) {
        this.titular = titular;
        return titular;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        return saldo;
    }

    public double sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente para saque.");
        }
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
