package lista08.exercicio02.dominio;

public class Vendedor extends Funcionario{
    private double comissaoPercentual;
    private double totalVendas;

    public Vendedor(String nome, double salario, double comissaoPercentual, double totalVendas) {
        super(nome, salario);
        this.comissaoPercentual = comissaoPercentual;
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (totalVendas * comissaoPercentual);
    }
}