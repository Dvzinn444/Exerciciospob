package exercicio_em_sala.controle;

import java.util.ArrayList;
import java.util.Scanner;
import exercicio_em_sala.dominio.Produto;

public class ControleProduto {
    private ArrayList<Produto> produtos;

    public ControleProduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int id, String nome, double valor) {
        Produto produto = new Produto(id, nome, valor);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                produto.listarProduto();
            }
        }
    }

    public static void main(String[] args) {
        ControleProduto controle = new ControleProduto();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Valor do Produto: ");
                    double valor = scanner.nextDouble();
                    controle.adicionarProduto(id, nome, valor);
                    break;
                case 2:
                    controle.listarProdutos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
