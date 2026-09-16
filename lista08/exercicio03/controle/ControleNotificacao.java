package lista08.exercicio03.controle;

import lista08.exercicio03.dominio.EmailNotificacao;
import lista08.exercicio03.dominio.Notificacao;
import lista08.exercicio03.dominio.PushNotificacao;
import lista08.exercicio03.dominio.SmsNotificacao;

public class ControleNotificacao {
    public static void main(String[] args) {
        Notificacao email = new EmailNotificacao("user@example.com");
        Notificacao sms = new SmsNotificacao("+123456789");
        Notificacao push = new PushNotificacao("user@app.com");

        email.enviar("Esta é uma notificação por e-mail.");
        sms.enviar("Este é um SMS.");
        push.enviar("Esta é uma notificação push.");
    }


    public static void processarEnvio(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
    }
}
