package lista08.exercicio05.dominio;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limiteChequeEspecial = limite;
    }

    @Override
    public double sacar(double valor) {
        return super.sacar(valor + 2.0, limiteChequeEspecial);
    }
    
}
