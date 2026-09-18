package lista08.exercicio05.dominio;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double aplicarRendimento(){
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        return getSaldo();
    }
    
    public double sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            super.sacar(valor);
        }
        return getSaldo();
    }
}
