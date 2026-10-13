package lista11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercicio05 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", "Informática", 3499.90));
        produtos.add(new Produto("Mouse", "Informática", 89.90));
        produtos.add(new Produto("Café", "Alimentos", 18.50));
        produtos.add(new Produto("Arroz", "Alimentos", 27.99));
        produtos.add(new Produto("Dom Casmurro", "Livros", 39.90));
        produtos.add(new Produto("O Hobbit", "Livros", 49.90));

        Map<String, List<Produto>> produtosPorCategoria = new HashMap<>();
        for (Produto produto : produtos) {
            produtosPorCategoria
                    .computeIfAbsent(produto.getCategoria(), categoria -> new ArrayList<>())
                    .add(produto);
        }

        for (Map.Entry<String, List<Produto>> entry : produtosPorCategoria.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Produto produto : entry.getValue()) {
                System.out.println("- " + produto);
            }
        }
    }
}
