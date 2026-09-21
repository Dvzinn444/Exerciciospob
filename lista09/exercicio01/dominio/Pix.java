package lista09.exercicio01.dominio;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando QRCode Pix para o valor de R$ " + String.format("%.2f", valor) + "...");
        System.out.println("Pagamento Pix realizado com sucesso!");
    }

    @Override
    public String obterDetalhes() {
        return "Pix | Chave: " + chavePix;
    }
}