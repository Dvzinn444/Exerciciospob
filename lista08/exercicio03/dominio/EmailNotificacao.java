package lista08.exercicio03.dominio;

public class EmailNotificacao extends Notificacao{
    private final String destinatario;
    
    public EmailNotificacao(String destinatario) {
        super(destinatario);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
    }
}
