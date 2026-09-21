package lista09.exercicio03.controle;

public class Main {
    public static void main(String[] args) {
        Usuario usuarioComum = new Usuario("joao.silva", "123456");
        Administrador admin = new Administrador("admin.root", "superSenha123", 1);

        System.out.println("--- Teste de Autenticação ---");
        testarAutenticacao(usuarioComum, "123456");
        testarAutenticacao(admin, "senhaIncorreta");

        System.out.println("\n--- Teste de Exportação JSON ---");
        // Tentativa de exportar ambos os objetos
        processarExportacao(usuarioComum);
        processarExportacao(admin);
    }

    public static void testarAutenticacao(Autenticavel usuario, String senha) {
        if (usuario.autenticar(senha)) {
            System.out.println("Autenticação REALIZADA com sucesso!");
        } else {
            System.out.println("Autenticação FALHOU: Senha incorreta.");
        }
    }

    public static void processarExportacao(Object obj) {
        if (obj instanceof ExportavelJSON) {
            ExportavelJSON exportavel = (ExportavelJSON) obj;
            System.out.println("Exportando objeto para JSON:");
            System.out.println(exportavel.exportarJSON());
        } else {
            System.out.println("O objeto da classe " + obj.getClass().getSimpleName() + " não suporta exportação para JSON.");
        }
    }
}