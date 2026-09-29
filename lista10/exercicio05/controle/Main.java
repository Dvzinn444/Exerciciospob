package lista10.exercicio05.controle;

import lista10.exercicio05.dominio.ProcessadorArquivo;
import lista10.exercicio05.dominio.ProcessamentoDadosException;

public class Main {
    public static void main(String[] args) {
        ProcessadorArquivo processador = new ProcessadorArquivo();

        processar(processador, "");
        processar(processador, "dados-invalidos.txt");
    }

    public static void processar(ProcessadorArquivo processador, String caminho) {
        try {
            processador.processarArquivo(caminho);
        } catch (ProcessamentoDadosException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Motivo raiz: " + e.getCause().getMessage());
        }
    }
}