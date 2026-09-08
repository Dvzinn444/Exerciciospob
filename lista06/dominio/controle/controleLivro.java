package lista06.dominio.controle;

import lista06.dominio.Livro;
import java.util.Scanner;

public class controleLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro1 = new Livro(null, null, 0);
        Livro livro2 = new Livro(null, null, 0);

        System.out.print("Digite o título do livro 1: ");
        String titulo1 = scanner.nextLine();

        System.out.print("Digite o autor do livro 1: ");
        String autor1 = scanner.nextLine();

        System.out.print("Digite o número de páginas do livro 1: ");
        int numeroPaginas1 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        livro1 = new Livro(titulo1, autor1, numeroPaginas1);

        System.out.print("Digite o título do livro 2: ");
        String titulo2 = scanner.nextLine();

        System.out.print("Digite o autor do livro 2: ");
        String autor2 = scanner.nextLine();

        System.out.print("Digite o número de páginas do livro 2: ");
        int numeroPaginas2 = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        livro2 = new Livro(titulo2, autor2, numeroPaginas2);

        livro1.setAutor(autor1);
        livro1.setTitulo(titulo1);
        livro1.setNumeroPaginas(numeroPaginas1);

        livro2.setAutor(autor2);
        livro2.setTitulo(titulo2);
        livro2.setNumeroPaginas(numeroPaginas2);
        
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        scanner.close();
    }
}
