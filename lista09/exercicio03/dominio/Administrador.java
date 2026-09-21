package lista09.exercicio03.dominio;

public class Administrador implements Autenticavel, ExportavelJSON {
    private String login;
    private String senha;
    private int nivelAcesso;

    public Administrador(String login, String senha, int nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean autenticar(String senhaFornecida) {
        return this.senha.equals(senhaFornecida);
    }

    @Override
    public String exportarJSON() {
        return "{\n" +
               "  \"login\": \"" + login + "\",\n" +
               "  \"nivelAcesso\": " + nivelAcesso + "\n" +
               "}";
    }
}