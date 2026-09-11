package lista07.dominio.controle;

import lista07.dominio.ContaBancaria;
import java.util.Scanner;

public class controleConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("12345", null, 0.0);

        System.out.println("Digite o nome do titular da conta:");
        conta.setTitular(ler.nextLine());

        System.out.println("Titular da conta: " + conta.getTitular());
        conta.depositar(1000.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        conta.sacar(500.0);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        ler.close();
    }    
}
