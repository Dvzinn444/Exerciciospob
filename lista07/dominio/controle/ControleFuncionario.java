package lista07.dominio.controle;

import lista07.dominio.Funcionario;


public class ControleFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "12345", 5500.00);
        
        funcionario.setSalario(3000.00);

        funcionario.exibirDados();

        funcionario.setNome("Robertinho");
        funcionario.setMatricula("6868");
        funcionario.setSalario(7800.00);

        funcionario.exibirDados();
    }
}
