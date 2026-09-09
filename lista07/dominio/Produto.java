package lista07.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome,double preco,int qtd){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = qtd;
    }

    public void Produto1(String nome,double preco,int qtd){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = qtd;
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

    public void setQtd(int qtd){
        if(qtd >= 0){
            this.quantidadeEstoque = qtd;
        }else{
            System.out.println("Quantidade negativa!");
        }
    }

    public int getQtd(){
        return quantidadeEstoque;
    }

    public double calcularValorTotalEmEstoque(double preco, int qtd){
        return preco * quantidadeEstoque;
    }
}
