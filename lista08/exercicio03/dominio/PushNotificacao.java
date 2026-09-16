package lista08.exercicio03.dominio;

public class PushNotificacao extends Notificacao{
    private final String destinatario;
    
    public PushNotificacao(String destinatario) {
        super(destinatario);
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação push para " + destinatario + ": " + mensagem);
    }
    
}
