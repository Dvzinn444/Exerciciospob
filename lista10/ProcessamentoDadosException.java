package lista10;

public class ProcessamentoDadosException extends java.lang.Exception {
    public ProcessamentoDadosException(String mensagem) {
        super(mensagem);
    }

    public ProcessamentoDadosException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
