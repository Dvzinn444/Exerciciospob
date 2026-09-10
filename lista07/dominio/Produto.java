package lista07.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("Preço negativo!");
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setQuantidadeEstoque(int qtd){
        if(qtd >= 0){
            this.quantidadeEstoque = qtd;
        }else{
            System.out.println("Quantidade negativa!");
        }
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public double calcularValorTotalEmEstoque(){
        return preco * quantidadeEstoque;
    }
}
