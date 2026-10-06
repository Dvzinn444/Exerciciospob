package lista10;

public class exercicio2 {
    public static void main(String[] args) {
        ServicoProcessamentoArquivo servico = new ServicoProcessamentoArquivo();
        String[] caminhos = {"", "falha-parsing"};

        for (String caminho : caminhos) {
            try {
                servico.processarArquivo(caminho);
            } catch (ProcessamentoDadosException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Motivo raiz: " + e.getCause().getMessage());
            }
        }
    }
}
