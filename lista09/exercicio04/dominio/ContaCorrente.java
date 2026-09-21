package lista09.exercicio04.dominio;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public void cobrarTaxaMensal() {
        debitar(15.00);
    }
}