package lista10.exercicio05.dominio;

import java.io.IOException;

public class ProcessadorArquivo {
    public void processarArquivo(String caminho) throws ProcessamentoDadosException {
        try {
            if (caminho == null || caminho.isEmpty()) {
                throw new IOException("O caminho do arquivo está vazio.");
            }

            String conteudo = caminho.equals("dados-invalidos.txt") ? "abc" : "123";
            Integer.parseInt(conteudo);
            System.out.println("Arquivo processado com sucesso: " + caminho);
        } catch (IOException | NumberFormatException e) {
            throw new ProcessamentoDadosException("Não foi possível processar os dados do arquivo.", e);
        }
    }
}