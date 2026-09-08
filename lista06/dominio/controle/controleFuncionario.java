package lista06.dominio.controle;

import lista06.dominio.funcionario;
import java.util.Scanner;

public class controleFuncionario {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        funcionario f1 = new funcionario(null, null, 0);

        System.out.print("Digite o nome do funcionário: ");
        String nome = ler.nextLine();
        f1.setNome(nome);

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = ler.nextLine();
        f1.setCargo(cargo);

        System.out.print("Digite o salário do funcionário: ");
        double salario = ler.nextDouble();
        f1.setSalarioBruto(salario);

        f1.exibirInformacoes();

        System.out.print("Digite o percentual de aumento: ");
        double percentualAumento = ler.nextDouble();
        f1.aplicarAumento(percentualAumento);
        f1.calcularSalarioLiquido(100.0);

        f1.exibirInformacoes();
        ler.close();
    }
}
