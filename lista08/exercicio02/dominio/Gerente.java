package lista08.exercicio02.dominio;

public class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonusFixo = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonusFixo;
    }

}
