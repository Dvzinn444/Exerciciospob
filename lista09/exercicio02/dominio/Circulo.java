package lista09.exercicio02.dominio;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override 
    public void exibirCor() {
        System.out.println("Cor do círculo: " + cor);
    }
}
