package lista08.exercicio02.dominio.controle;

import lista08.exercicio02.dominio.Funcionario;
import lista08.exercicio02.dominio.Gerente;
import lista08.exercicio02.dominio.Vendedor;

public class ControleFuncionario {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("João", 5000.0, 1000.0);
        Funcionario vendedor = new Vendedor("Maria", 3000.0, 0.1, 20000.0);

        System.out.println("Salário do Gerente: " + gerente.calcularSalario());
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}
