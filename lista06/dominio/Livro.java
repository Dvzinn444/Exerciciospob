package lista06.dominio;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String setTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }

    public String setAutor(String autor) {
        this.autor = autor;
        return autor;
    }

    public int setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
        return numeroPaginas;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}