package lista09.exercicio01.dominio;

public class CartaoDeCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;

    public CartaoDeCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor <= limite) {
            limite -= valor;
            System.out.println("Pagamento de R$" + valor + " processado com sucesso. Limite restante: R$" + limite);
            return;
        }
        else{
            System.out.println("Pagamento recusado: valor excede o limite do cartão.");
        }
    }

    @Override
    public String obterDetalhes() {
        String detalhes = "Cartão de Crédito - Número: " + numeroCartao + ", Limite: R$" + limite;
        return detalhes;
    }
    
}
