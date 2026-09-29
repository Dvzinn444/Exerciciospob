package lista10.exercicio04.dominio;

public class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}