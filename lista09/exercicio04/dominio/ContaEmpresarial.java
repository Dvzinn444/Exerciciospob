package lista09.exercicio04.dominio;

public class ContaEmpresarial extends ContaBancaria {
    public ContaEmpresarial(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal() {
        double taxa = 30.00 + (consultarSaldo() * 0.005);
        debitar(taxa);
    }
}