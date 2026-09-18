package lista08.exercicio05.dominio.controle;

import lista08.exercicio05.dominio.Conta;
import lista08.exercicio05.dominio.ContaCorrente;
import lista08.exercicio05.dominio.ContaPoupanca;

public class ControleConta {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("12345", 1000.0, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("67890", 2000.0, 0.05);

        System.out.println("Saldo inicial da conta corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo inicial da conta poupança: " + contaPoupanca.getSaldo());

        contaCorrente.depositar(200.0);
        System.out.println("Saldo após depósito na conta corrente: " + contaCorrente.getSaldo());

        contaPoupanca.aplicarRendimento();
        System.out.println("Saldo após aplicar rendimento na conta poupança: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(300.0);
        System.out.println("Saldo após saque na conta corrente: " + contaCorrente.getSaldo());

        contaPoupanca.sacar(100.0);
        System.out.println("Saldo após saque na conta poupança: " + contaPoupanca.getSaldo());
    }
}