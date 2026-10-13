package lista11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio04 {
    private final Map<String, Integer> estoque = new HashMap<>();

    public boolean adicionarProduto(String codigo, int quantidade) {
        validarProduto(codigo, quantidade);
        if (estoque.containsKey(codigo)) {
            return false;
        }
        estoque.put(codigo, quantidade);
        return true;
    }

    public Integer consultarEstoque(String codigo) {
        return estoque.get(codigo);
    }

    public boolean atualizarEstoque(String codigo, int quantidade) {
        validarProduto(codigo, quantidade);
        if (!estoque.containsKey(codigo)) {
            return false;
        }
        estoque.put(codigo, quantidade);
        return true;
    }

    private void validarProduto(String codigo, int quantidade) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do produto não pode ficar vazio.");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    private static int lerQuantidade(Scanner scanner) {
        while (true) {
            System.out.print("Quantidade: ");
            try {
                int quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade < 0) {
                    System.out.println("A quantidade não pode ser negativa.");
                    continue;
                }
                return quantidade;
            } catch (NumberFormatException exception) {
                System.out.println("Digite uma quantidade inteira válida.");
            }
        }
    }

    public static void main(String[] args) {
        exercicio04 sistema = new exercicio04();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n1. Cadastrar produto");
            System.out.println("2. Consultar estoque");
            System.out.println("3. Atualizar estoque");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1": {
                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine().trim();
                    int quantidade = lerQuantidade(scanner);
                    if (sistema.adicionarProduto(codigo, quantidade)) {
                        System.out.println("Produto cadastrado.");
                    } else {
                        System.out.println("Já existe um produto com esse código.");
                    }
                    break;
                }
                case "2": {
                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine().trim();
                    Integer quantidade = sistema.consultarEstoque(codigo);
                    if (quantidade == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.println("Estoque: " + quantidade);
                    }
                    break;
                }
                case "3": {
                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine().trim();
                    int quantidade = lerQuantidade(scanner);
                    if (sistema.atualizarEstoque(codigo, quantidade)) {
                        System.out.println("Estoque atualizado.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }
                case "0":
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
