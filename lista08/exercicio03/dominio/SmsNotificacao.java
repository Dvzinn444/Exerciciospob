package lista08.exercicio03.dominio;

public class SmsNotificacao extends Notificacao{
    private final String destinatario;
    
    public SmsNotificacao(String destinatario) {
        super(destinatario);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}
