package lista09.exercicio04.controle;

import java.util.ArrayList;
import java.util.List;
import lista09.exercicio04.dominio.ContaBancaria;
import lista09.exercicio04.dominio.ContaCorrente;
import lista09.exercicio04.dominio.ContaEmpresarial;

public class ControleConta {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaCorrente(101, 1000.00));
        contas.add(new ContaEmpresarial(202, 5000.00));

        for (ContaBancaria conta : contas) {
            conta.depositar(100.00);
            System.out.println("Saldo antes da taxa - conta " + conta.getNumero() + ": R$ " + conta.consultarSaldo());
            conta.cobrarTaxaMensal();
            System.out.println("Saldo depois da taxa - conta " + conta.getNumero() + ": R$ " + conta.consultarSaldo());
        }
    }
}