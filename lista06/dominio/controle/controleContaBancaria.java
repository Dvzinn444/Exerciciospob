package lista06.dominio.controle;

import lista06.dominio.contaBancaria;
import java.util.Scanner;

public class controleContaBancaria {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        contaBancaria c1 = new contaBancaria(null);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = ler.nextLine();
        c1.setTitular(titular);

        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = ler.nextDouble();
        c1.depositar(valorDeposito);

        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = ler.nextDouble();
        c1.sacar(valorSaque);

        c1.consultarSaldo();
        ler.close();
    }
}
