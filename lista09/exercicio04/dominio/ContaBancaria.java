package lista09.exercicio04.dominio;

public abstract class ContaBancaria {
    private int numero;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    protected void debitar(double valor) {
        saldo -= valor;
    }

    public abstract void cobrarTaxaMensal();
}