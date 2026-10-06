package lista10;

import java.io.IOException;

public class ServicoProcessamentoArquivo {
    public void processarArquivo(String caminho) throws ProcessamentoDadosException {
        try {
            if (caminho == null || caminho.trim().isEmpty()) {
                throw new IOException("O caminho do arquivo é nulo ou vazio.");
            }
            if ("falha-parsing".equals(caminho)) {
                throw new NumberFormatException("Os dados do arquivo não puderam ser interpretados.");
            }
            System.out.println("Arquivo processado: " + caminho);
        } catch (IOException | NumberFormatException causa) {
            throw new ProcessamentoDadosException("Falha ao processar o arquivo.", causa);
        }
    }
}