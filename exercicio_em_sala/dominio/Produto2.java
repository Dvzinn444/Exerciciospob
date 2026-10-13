package exercicio_em_sala.dominio;

public class Produto2 {
    private int id;
    private String nome;
    private double valor;

    public Produto2(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

       // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void listarProduto() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Valor: R$ " + valor);
    }
}