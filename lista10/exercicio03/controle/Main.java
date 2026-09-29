package lista10.exercicio03.controle;

import lista10.exercicio03.dominio.ContaCorrente;
import lista10.exercicio03.dominio.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345", 100.00);

        try {
            conta.sacar(50.00);
            conta.sacar(60.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro no saque: " + e.getMessage());
        }
    }
}