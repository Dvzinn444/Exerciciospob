package lista09.exercicio02.dominio;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override 
    public void exibirCor() {
        System.out.println("Cor do retângulo: " + cor);
    }
}
