package lista07.dominio.controle;

import lista07.dominio.Produto;
import java.util.Scanner;

public class controleProduto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = ler.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = ler.nextDouble();
        System.out.println("Digite a qtd em estoque: ");
        int qtd = ler.nextInt();

        Produto produto1 = new Produto(nome, preco, qtd);

        ler.nextLine();
        System.out.println("Digite o nome do produto: ");
        String nome1 = ler.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco1 = ler.nextDouble();

        Produto produto2 = new Produto(nome1, preco1);
        double resp = produto1.calcularValorTotalEmEstoque();
        System.out.println("O preço é: " + resp);
        double resp2 = produto2.calcularValorTotalEmEstoque();
        System.out.println("O preço é: " + resp2);

        produto1.setPreco(-10.0);
        System.out.println("Preço após tentativa inválida: " + produto1.getPreco());
        ler.close();
    }
}
