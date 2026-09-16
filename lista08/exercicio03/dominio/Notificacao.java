package lista08.exercicio03.dominio;

public class Notificacao {
    private String destinatario;

    public Notificacao(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando notificação para " + destinatario + ": " + mensagem);
    }
}
