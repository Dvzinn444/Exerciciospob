package lista07.dominio.controle;

import lista07.dominio.Produto;
import java.util.Scanner;

public class controleProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(null, 0, 0);
        Produto produto2 = new Produto(null, 0, 0);
        Scanner ler = new Scanner(System.in);   

        System.out.println("Digite o nome do produto: ");
        String nome = ler.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = ler.nextDouble();
        System.out.println("Digite a qtd em estoque: ");
        int qtd = ler.nextInt();

        produto1.Produto1(nome, preco, qtd);

        System.out.println("Digite o nome do produto: ");
        String nome1 = ler.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco1 = ler.nextDouble();
        
        produto2.Produto1(nome1, preco1, 0);
        double resp = produto1.calcularValorTotalEmEstoque(preco, qtd);
        System.out.println("O preço é: " + resp);
        double resp2 = produto2.calcularValorTotalEmEstoque(preco1, qtd);
        System.out.println("O preço é: " + resp2);
    }
}
